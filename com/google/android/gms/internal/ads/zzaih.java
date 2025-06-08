package com.google.android.gms.internal.ads;

import A.f;
import android.util.Pair;
import i3.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class zzaih {
    public static int a(int v) {
        switch(v) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return 0x40;
            }
            default: {
                throw new IllegalArgumentException("Unknown content digest algorthm: " + v);
            }
        }
    }

    public static int b(int v) {
        switch(v) {
            case 0x102: 
            case 260: 
            case 0x202: {
                return 2;
            }
            case 0x101: 
            case 0x103: 
            case 0x201: 
            case 0x301: {
                return 1;
            }
            default: {
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
            }
        }
    }

    public static String c(int v) {
        switch(v) {
            case 1: {
                return "SHA-256";
            }
            case 2: {
                return "SHA-512";
            }
            default: {
                throw new IllegalArgumentException("Unknown content digest algorthm: " + v);
            }
        }
    }

    public static ByteBuffer d(ByteBuffer byteBuffer0, int v) {
        int v1 = byteBuffer0.limit();
        int v2 = byteBuffer0.position();
        int v3 = v + v2;
        if(v3 >= v2 && v3 <= v1) {
            byteBuffer0.limit(v3);
            try {
                ByteBuffer byteBuffer1 = byteBuffer0.slice();
                byteBuffer1.order(byteBuffer0.order());
                byteBuffer0.position(v3);
                return byteBuffer1;
            }
            finally {
                byteBuffer0.limit(v1);
            }
        }
        throw new BufferUnderflowException();
    }

    public static ByteBuffer e(ByteBuffer byteBuffer0) {
        if(byteBuffer0.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer0.remaining());
        }
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + v + ", remaining: " + byteBuffer0.remaining());
        }
        return zzaih.d(byteBuffer0, v);
    }

    public static void f(int v, byte[] arr_b) {
        arr_b[1] = (byte)(v & 0xFF);
        arr_b[2] = (byte)(v >>> 8 & 0xFF);
        arr_b[3] = (byte)(v >>> 16 & 0xFF);
        arr_b[4] = (byte)(v >> 24);
    }

    public static byte[] g(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new IOException("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + v + ", available: " + byteBuffer0.remaining());
        }
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return arr_b;
    }

    public static X509Certificate[] h(ByteBuffer byteBuffer0, HashMap hashMap0, CertificateFactory certificateFactory0) {
        X509Certificate x509Certificate0;
        Pair pair0;
        String s;
        ByteBuffer byteBuffer1 = zzaih.e(byteBuffer0);
        ByteBuffer byteBuffer2 = zzaih.e(byteBuffer0);
        byte[] arr_b = zzaih.g(byteBuffer0);
        ArrayList arrayList0 = new ArrayList();
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        int v = -1;
        int v1 = 0;
        while(byteBuffer2.hasRemaining()) {
            try {
                ++v1;
                ByteBuffer byteBuffer3 = zzaih.e(byteBuffer2);
                if(byteBuffer3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int v2 = byteBuffer3.getInt();
                arrayList0.add(v2);
                if(v2 != 0x201 && v2 != 0x202 && v2 != 0x301 && (v2 != 0x101 && v2 != 0x102 && v2 != 0x103 && v2 != 260) || v != -1 && (zzaih.b(v2) == 1 || zzaih.b(v) != 1)) {
                    continue;
                }
                arr_b2 = zzaih.g(byteBuffer3);
                v = v2;
                continue;
            }
            catch(IOException | BufferUnderflowException iOException0) {
            }
            throw new SecurityException("Failed to parse signature record #" + v1, iOException0);
        }
        if(v == -1) {
            throw v1 == 0 ? new SecurityException("No signatures found") : new SecurityException("No supported signatures found");
        }
        switch(v) {
            case 0x201: 
            case 0x202: {
                s = "EC";
                break;
            }
            case 0x301: {
                s = "DSA";
                break;
            }
            default: {
                if(v != 0x101 && v != 0x102 && v != 0x103 && v != 260) {
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
                }
                s = "RSA";
            }
        }
        switch(v) {
            case 0x101: {
                pair0 = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 0x20, 1));
                break;
            }
            case 0x102: {
                pair0 = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 0x40, 1));
                break;
            }
            case 0x103: {
                pair0 = Pair.create("SHA256withRSA", null);
                break;
            }
            case 260: {
                pair0 = Pair.create("SHA512withRSA", null);
                break;
            }
            case 0x201: {
                pair0 = Pair.create("SHA256withECDSA", null);
                break;
            }
            case 0x202: {
                pair0 = Pair.create("SHA512withECDSA", null);
                break;
            }
            case 0x301: {
                pair0 = Pair.create("SHA256withDSA", null);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
            }
        }
        String s1 = (String)pair0.first;
        AlgorithmParameterSpec algorithmParameterSpec0 = (AlgorithmParameterSpec)pair0.second;
        try {
            PublicKey publicKey0 = KeyFactory.getInstance(s).generatePublic(new X509EncodedKeySpec(arr_b));
            Signature signature0 = Signature.getInstance(s1);
            signature0.initVerify(publicKey0);
            if(algorithmParameterSpec0 != null) {
                signature0.setParameter(algorithmParameterSpec0);
            }
            signature0.update(byteBuffer1);
            if(!signature0.verify(arr_b2)) {
                throw new SecurityException(s1 + " signature did not verify");
            }
        }
        catch(NoSuchAlgorithmException | InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException | SignatureException noSuchAlgorithmException0) {
            throw new SecurityException(e.f("Failed to verify ", s1, " signature"), noSuchAlgorithmException0);
        }
        byteBuffer1.clear();
        ByteBuffer byteBuffer4 = zzaih.e(byteBuffer1);
        ArrayList arrayList1 = new ArrayList();
        int v3 = 0;
        while(byteBuffer4.hasRemaining()) {
            try {
                ++v3;
                ByteBuffer byteBuffer5 = zzaih.e(byteBuffer4);
                if(byteBuffer5.remaining() < 8) {
                    throw new IOException("Record too short");
                }
                int v4 = byteBuffer5.getInt();
                arrayList1.add(v4);
                if(v4 != v) {
                    continue;
                }
                arr_b1 = zzaih.g(byteBuffer5);
                continue;
            }
            catch(IOException | BufferUnderflowException iOException1) {
            }
            throw new IOException("Failed to parse digest record #" + v3, iOException1);
        }
        if(!arrayList0.equals(arrayList1)) {
            throw new SecurityException("Signature algorithms don\'t match between digests and signatures records");
        }
        int v5 = zzaih.b(v);
        byte[] arr_b3 = (byte[])hashMap0.put(v5, arr_b1);
        if(arr_b3 != null && !MessageDigest.isEqual(arr_b3, arr_b1)) {
            throw new SecurityException(zzaih.c(v5) + " contents digest does not match the digest specified by a preceding signer");
        }
        ByteBuffer byteBuffer6 = zzaih.e(byteBuffer1);
        ArrayList arrayList2 = new ArrayList();
        int v6 = 0;
        while(byteBuffer6.hasRemaining()) {
            ++v6;
            byte[] arr_b4 = zzaih.g(byteBuffer6);
            try {
                x509Certificate0 = (X509Certificate)certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b4));
            }
            catch(CertificateException certificateException0) {
                throw new SecurityException("Failed to decode certificate #" + v6, certificateException0);
            }
            arrayList2.add(new l0(x509Certificate0, arr_b4));
        }
        if(arrayList2.isEmpty()) {
            throw new SecurityException("No certificates listed");
        }
        if(!Arrays.equals(arr_b, ((X509Certificate)arrayList2.get(0)).getPublicKey().getEncoded())) {
            throw new SecurityException("Public key mismatch between certificate and signature record");
        }
        return (X509Certificate[])arrayList2.toArray(new X509Certificate[arrayList2.size()]);
    }

    public static byte[][] i(int[] arr_v, i0[] arr_i0) {
        MessageDigest messageDigest1;
        int v11;
        long v = 0L;
        for(int v1 = 0; v1 < 3; ++v1) {
            v += (arr_i0[v1].zza() + 0xFFFFFL) / 0x100000L;
        }
        if(v >= 0x1FFFFFL) {
            throw new DigestException("Too many chunks: " + v);
        }
        byte[][] arr2_b = new byte[arr_v.length][];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            byte[] arr_b = new byte[zzaih.a(arr_v[v2]) * ((int)v) + 5];
            arr_b[0] = 90;
            zzaih.f(((int)v), arr_b);
            arr2_b[v2] = arr_b;
        }
        byte[] arr_b1 = new byte[5];
        arr_b1[0] = -91;
        MessageDigest[] arr_messageDigest = new MessageDigest[arr_v.length];
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            String s = zzaih.c(arr_v[v3]);
            try {
                arr_messageDigest[v3] = MessageDigest.getInstance(s);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new RuntimeException(s + " digest not supported", noSuchAlgorithmException0);
            }
        }
        int v4 = 0;
        int v5 = 0;
        for(int v6 = 0; v6 < 3; ++v6) {
            i0 i00 = arr_i0[v6];
            long v8 = i00.zza();
            for(long v7 = 0L; v8 > 0L; v7 += (long)v9) {
                int v9 = (int)Math.min(v8, 0x100000L);
                zzaih.f(v9, arr_b1);
                for(int v10 = 0; v10 < arr_v.length; ++v10) {
                    arr_messageDigest[v10].update(arr_b1);
                }
                try {
                    i00.a(arr_messageDigest, v7, v9);
                    v11 = 0;
                }
                catch(IOException iOException0) {
                    throw new DigestException(f.d(v4, v5, "Failed to digest chunk #", " of section #"), iOException0);
                }
                while(v11 < arr_v.length) {
                    int v12 = arr_v[v11];
                    byte[] arr_b2 = arr2_b[v11];
                    int v13 = zzaih.a(v12);
                    MessageDigest messageDigest0 = arr_messageDigest[v11];
                    int v14 = messageDigest0.digest(arr_b2, v4 * v13 + 5, v13);
                    if(v14 != v13) {
                        throw new RuntimeException("Unexpected output size of " + messageDigest0.getAlgorithm() + " digest: " + v14);
                    }
                    ++v11;
                }
                v8 -= (long)v9;
                ++v4;
            }
            ++v5;
        }
        byte[][] arr2_b1 = new byte[arr_v.length][];
        for(int v15 = 0; v15 < arr_v.length; ++v15) {
            int v16 = arr_v[v15];
            byte[] arr_b3 = arr2_b[v15];
            String s1 = zzaih.c(v16);
            try {
                messageDigest1 = MessageDigest.getInstance(s1);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException1) {
                throw new RuntimeException(s1 + " digest not supported", noSuchAlgorithmException1);
            }
            arr2_b1[v15] = messageDigest1.digest(arr_b3);
        }
        return arr2_b1;
    }

    public static X509Certificate[][] j(FileChannel fileChannel0, k0 k00) {
        int v1;
        ByteBuffer byteBuffer0;
        CertificateFactory certificateFactory0;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        try {
            certificateFactory0 = CertificateFactory.getInstance("X.509");
        }
        catch(CertificateException certificateException0) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", certificateException0);
        }
        try {
            byteBuffer0 = zzaih.e(((ByteBuffer)k00.d));
            v1 = 0;
        }
        catch(IOException iOException0) {
            throw new SecurityException("Failed to read list of signers", iOException0);
        }
        while(byteBuffer0.hasRemaining()) {
            try {
                ++v1;
                arrayList0.add(zzaih.h(zzaih.e(byteBuffer0), hashMap0, certificateFactory0));
            }
            catch(IOException | BufferUnderflowException | SecurityException iOException1) {
                throw new SecurityException(f.e(v1, "Failed to parse/verify signer #", " block"), iOException1);
            }
        }
        if(v1 <= 0) {
            throw new SecurityException("No signers found");
        }
        if(hashMap0.isEmpty()) {
            throw new SecurityException("No content digests found");
        }
        long v2 = k00.a;
        j0 j00 = new j0(fileChannel0, 0L, v2);
        j0 j01 = new j0(fileChannel0, k00.b, k00.c - k00.b);
        ByteBuffer byteBuffer1 = ((ByteBuffer)k00.e).duplicate();
        byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
        zzaii.zzd(byteBuffer1, v2);
        E9 e90 = new E9(byteBuffer1);
        int v3 = hashMap0.size();
        int[] arr_v = new int[v3];
        int v4 = 0;
        for(Object object0: hashMap0.keySet()) {
            arr_v[v4] = (int)(((Integer)object0));
            ++v4;
        }
        try {
            byte[][] arr2_b = zzaih.i(arr_v, new i0[]{j00, j01, e90});
        }
        catch(DigestException digestException0) {
            throw new SecurityException("Failed to compute digest(s) of contents", digestException0);
        }
        for(int v = 0; v < v3; ++v) {
            int v5 = arr_v[v];
            if(!MessageDigest.isEqual(((byte[])hashMap0.get(v5)), arr2_b[v])) {
                throw new SecurityException(zzaih.c(v5) + " digest of contents did not verify");
            }
        }
        return (X509Certificate[][])arrayList0.toArray(new X509Certificate[arrayList0.size()][]);
    }

    public static X509Certificate[][] zza(String s) throws zzaie, SecurityException, IOException {
        ByteBuffer byteBuffer4;
        X509Certificate[][] arr2_x509Certificate;
        long v10;
        RandomAccessFile randomAccessFile2;
        long v2;
        ByteOrder byteOrder0;
        ByteBuffer byteBuffer1;
        long v1;
        RandomAccessFile randomAccessFile1;
        long v;
        ByteBuffer byteBuffer0;
        Pair pair0;
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(s, "r");
        try {
            if(randomAccessFile0.length() < 22L) {
                pair0 = null;
            }
            else {
                pair0 = zzaii.a(randomAccessFile0, 0);
                if(pair0 == null) {
                    pair0 = zzaii.a(randomAccessFile0, 0xFFFF);
                }
            }
            if(pair0 != null) {
                byteBuffer0 = (ByteBuffer)pair0.first;
                v = (long)(((Long)pair0.second));
                if(v - 20L >= 0L) {
                    randomAccessFile0.seek(v - 20L);
                    if(randomAccessFile0.readInt() == 0x504B0607) {
                        randomAccessFile1 = randomAccessFile0;
                        throw new zzaie("ZIP64 APK not supported");
                    }
                }
                goto label_15;
            }
            randomAccessFile1 = randomAccessFile0;
            throw new zzaie("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile1.length() + " bytes");
        }
        catch(Throwable throwable0) {
            randomAccessFile1 = randomAccessFile0;
            goto label_107;
        }
        try {
            randomAccessFile1 = randomAccessFile0;
            throw new zzaie("ZIP64 APK not supported");
        }
        catch(Throwable throwable0) {
            goto label_107;
        }
        try {
        label_15:
            v1 = zzaii.zza(byteBuffer0);
            if(v1 < v) {
                if(v1 + zzaii.zzb(byteBuffer0) == v) {
                    if(v1 >= 0x20L) {
                        byteBuffer1 = ByteBuffer.allocate(24);
                        byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                        byteBuffer1.order(byteOrder0);
                        randomAccessFile0.seek(v1 - ((long)byteBuffer1.capacity()));
                        randomAccessFile0.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                        if(byteBuffer1.getLong(8) == 0x20676953204B5041L && byteBuffer1.getLong(16) == 0x3234206B636F6C42L) {
                            goto label_29;
                        }
                        randomAccessFile1 = randomAccessFile0;
                        throw new zzaie("No APK Signing Block before ZIP Central Directory");
                    }
                    randomAccessFile1 = randomAccessFile0;
                    throw new zzaie("APK too small for APK Signing Block. ZIP Central Directory offset: " + v1);
                }
                randomAccessFile1 = randomAccessFile0;
                throw new zzaie("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            randomAccessFile1 = randomAccessFile0;
            throw new zzaie("ZIP Central Directory offset out of range: " + v1 + ". ZIP End of Central Directory offset: " + v);
        }
        catch(Throwable throwable0) {
            try {
                randomAccessFile1 = randomAccessFile0;
            }
            catch(Throwable throwable0) {
            }
            goto label_107;
        }
        try {
        label_29:
            v2 = byteBuffer1.getLong(0);
        }
        catch(Throwable throwable0) {
            try {
                randomAccessFile1 = randomAccessFile0;
            }
            catch(Throwable throwable0) {
            }
            goto label_107;
        }
        if(v2 >= ((long)byteBuffer1.capacity()) && v2 <= 0x7FFFFFF7L) {
            try {
                long v3 = v1 - ((long)(((int)(v2 + 8L))));
                if(v3 < 0L) {
                    randomAccessFile2 = randomAccessFile0;
                    throw new zzaie("APK Signing Block offset out of range: " + v3);
                }
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)(v2 + 8L)));
                randomAccessFile2 = randomAccessFile0;
                byteBuffer2.order(byteOrder0);
                randomAccessFile2 = randomAccessFile0;
                randomAccessFile2.seek(v3);
                randomAccessFile2.readFully(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.capacity());
                long v4 = byteBuffer2.getLong(0);
                if(v4 != v2) {
                    throw new zzaie("APK Signing Block sizes in header and footer do not match: " + v4 + " vs " + v2);
                }
                Pair pair1 = Pair.create(byteBuffer2, v3);
                ByteBuffer byteBuffer3 = (ByteBuffer)pair1.first;
                long v5 = (long)(((Long)pair1.second));
                if(byteBuffer3.order() != byteOrder0) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int v6 = byteBuffer3.capacity();
                if(v6 - 24 < 8) {
                    throw new IllegalArgumentException("end < start: " + (v6 - 24) + " < 8");
                }
                int v7 = byteBuffer3.capacity();
                if(v6 - 24 > byteBuffer3.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + (v6 - 24) + " > " + v7);
                }
                try {
                    byteBuffer3.position(0);
                    byteBuffer3.limit(v6 - 24);
                    byteBuffer3.position(8);
                    byteBuffer4 = byteBuffer3.slice();
                    byteBuffer4.order(byteBuffer3.order());
                }
                finally {
                    byteBuffer3.position(0);
                    byteBuffer3.limit(byteBuffer3.limit());
                    byteBuffer3.position(byteBuffer3.position());
                }
                int v9 = 0;
                while(true) {
                    if(!byteBuffer4.hasRemaining()) {
                        throw new zzaie("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    ++v9;
                    if(byteBuffer4.remaining() < 8) {
                        throw new zzaie("Insufficient data to read size of APK Signing Block entry #" + v9);
                    }
                    v10 = byteBuffer4.getLong();
                    if(v10 < 4L || v10 > 0x7FFFFFFFL) {
                        throw new zzaie("APK Signing Block entry #" + v9 + " size out of range: " + v10);
                    }
                    int v11 = byteBuffer4.position();
                    if(((int)v10) > byteBuffer4.remaining()) {
                        throw new zzaie("APK Signing Block entry #" + v9 + " size out of range: " + ((int)v10) + ", available: " + byteBuffer4.remaining());
                    }
                    if(byteBuffer4.getInt() == 0x7109871A) {
                        break;
                    }
                    byteBuffer4.position(v11 + ((int)v10));
                }
                k0 k00 = new k0(zzaih.d(byteBuffer4, ((int)v10) - 4), v5, v1, v, byteBuffer0);
                arr2_x509Certificate = zzaih.j(randomAccessFile2.getChannel(), k00);
                randomAccessFile2.close();
            }
            catch(Throwable throwable0) {
                randomAccessFile1 = randomAccessFile2;
                goto label_107;
            }
            try {
                randomAccessFile2.close();
            }
            catch(IOException unused_ex) {
            }
            return arr2_x509Certificate;
        }
        try {
            randomAccessFile1 = randomAccessFile0;
            throw new zzaie("APK Signing Block size out of range: " + v2);
        }
        catch(Throwable throwable0) {
        }
        try {
        label_107:
            randomAccessFile1.close();
        }
        catch(IOException unused_ex) {
        }
        throw throwable0;
    }
}

