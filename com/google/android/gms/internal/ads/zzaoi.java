package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzaoi {
    public static Cipher a;
    public static final Object b;
    public static final Object c;

    static {
        zzaoi.b = new Object();
        zzaoi.c = new Object();
    }

    public zzaoi(SecureRandom secureRandom0) {
    }

    public static final Cipher a() {
        synchronized(zzaoi.c) {
            if(zzaoi.a == null) {
                zzaoi.a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            return zzaoi.a;
        }
    }

    public final String zza(byte[] arr_b, byte[] arr_b1) throws zzaoh {
        byte[] arr_b3;
        byte[] arr_b2;
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzaoi.b) {
                zzaoi.a().init(1, secretKeySpec0, null);
                arr_b2 = zzaoi.a().doFinal(arr_b1);
                arr_b3 = zzaoi.a().getIV();
            }
            int v1 = arr_b2.length + arr_b3.length;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
            byteBuffer0.put(arr_b3).put(arr_b2);
            byteBuffer0.flip();
            byte[] arr_b4 = new byte[v1];
            byteBuffer0.get(arr_b4);
            return zzamn.zza(arr_b4, false);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new zzaoh(this, noSuchAlgorithmException0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzaoh(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzaoh(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzaoh(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzaoh(this, badPaddingException0);
        }
    }

    public final byte[] zzb(byte[] arr_b, String s) throws zzaoh {
        try {
            byte[] arr_b1 = zzamn.zzb(s, false);
            if(arr_b1.length <= 16) {
                throw new zzaoh(this);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length);
            byteBuffer0.put(arr_b1);
            byteBuffer0.flip();
            byte[] arr_b2 = new byte[16];
            byte[] arr_b3 = new byte[arr_b1.length - 16];
            byteBuffer0.get(arr_b2);
            byteBuffer0.get(arr_b3);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzaoi.b) {
                zzaoi.a().init(2, secretKeySpec0, new IvParameterSpec(arr_b2));
            }
            return zzaoi.a().doFinal(arr_b3);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzaoh(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzaoh(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzaoh(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzaoh(this, badPaddingException0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new zzaoh(this, invalidAlgorithmParameterException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new zzaoh(this, illegalArgumentException0);
        }
        throw new zzaoh(this, noSuchAlgorithmException0);
    }
}

