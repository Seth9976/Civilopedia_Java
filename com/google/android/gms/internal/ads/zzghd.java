package com.google.android.gms.internal.ads;

import L2.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzghd implements zzfwf {
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;
    public static final b e;
    public static final b f;

    static {
        zzghd.e = new b(7);
        zzghd.f = new b(8);
    }

    public zzghd(byte[] arr_b, int v) throws GeneralSecurityException {
        if(!zzfze.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if(v != 12 && v != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = v;
        zzgim.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.c = secretKeySpec0;
        Cipher cipher0 = (Cipher)zzghd.e.get();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = zzghd.a(cipher0.doFinal(new byte[16]));
        this.a = arr_b1;
        this.b = zzghd.a(arr_b1);
    }

    public static byte[] a(byte[] arr_b) {
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 15; ++v) {
            int v1 = arr_b[v];
            arr_b1[v] = (byte)((v1 + v1 ^ (arr_b[v + 1] & 0xFF) >>> 7) & 0xFF);
        }
        int v2 = arr_b[15];
        arr_b1[15] = (byte)(arr_b[0] >> 7 & 0x87 ^ v2 + v2);
        return arr_b1;
    }

    public final byte[] b(Cipher cipher0, int v, byte[] arr_b, int v1, int v2) {
        byte[] arr_b1 = new byte[16];
        arr_b1[15] = (byte)v;
        byte[] arr_b2 = this.a;
        if(v2 == 0) {
            return cipher0.doFinal(zzghd.c(arr_b1, arr_b2));
        }
        byte[] arr_b3 = cipher0.doFinal(arr_b1);
        int v4;
        for(v4 = 0; v2 - v4 > 16; v4 += 16) {
            for(int v5 = 0; v5 < 16; ++v5) {
                arr_b3[v5] = (byte)(arr_b3[v5] ^ arr_b[v1 + v4 + v5]);
            }
            arr_b3 = cipher0.doFinal(arr_b3);
        }
        byte[] arr_b4 = Arrays.copyOfRange(arr_b, v4 + v1, v1 + v2);
        if(arr_b4.length == 16) {
            return cipher0.doFinal(zzghd.c(arr_b3, zzghd.c(arr_b4, arr_b2)));
        }
        byte[] arr_b5 = Arrays.copyOf(this.b, 16);
        for(int v3 = 0; v3 < arr_b4.length; ++v3) {
            arr_b5[v3] = (byte)(arr_b5[v3] ^ arr_b4[v3]);
        }
        arr_b5[arr_b4.length] = (byte)(arr_b5[arr_b4.length] ^ 0x80);
        return cipher0.doFinal(zzghd.c(arr_b3, arr_b5));
    }

    public static byte[] c(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b2[v] = (byte)(arr_b[v] ^ arr_b1[v]);
        }
        return arr_b2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.d;
        int v1 = arr_b.length - v - 16;
        if(v1 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Object object0 = zzghd.e.get();
        SecretKeySpec secretKeySpec0 = this.c;
        ((Cipher)object0).init(1, secretKeySpec0);
        byte[] arr_b2 = this.b(((Cipher)object0), 0, arr_b, 0, this.d);
        byte[] arr_b3 = arr_b1 == null ? new byte[0] : arr_b1;
        byte[] arr_b4 = this.b(((Cipher)object0), 1, arr_b3, 0, arr_b3.length);
        byte[] arr_b5 = this.b(((Cipher)object0), 2, arr_b, this.d, v1);
        int v2 = arr_b.length - 16;
        int v3 = 0;
        for(int v4 = 0; v4 < 16; ++v4) {
            v3 = (byte)(v3 | arr_b[v2 + v4] ^ arr_b4[v4] ^ arr_b2[v4] ^ arr_b5[v4]);
        }
        if(v3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher0 = (Cipher)zzghd.f.get();
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b2));
        return cipher0.doFinal(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.d;
        if(arr_b.length > 0x7FFFFFEF - v) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int v1 = v + arr_b.length;
        byte[] arr_b2 = new byte[v1 + 16];
        byte[] arr_b3 = zzgik.zza(v);
        System.arraycopy(arr_b3, 0, arr_b2, 0, v);
        Object object0 = zzghd.e.get();
        ((Cipher)object0).init(1, this.c);
        byte[] arr_b4 = this.b(((Cipher)object0), 0, arr_b3, 0, arr_b3.length);
        byte[] arr_b5 = this.b(((Cipher)object0), 1, arr_b1, 0, 0);
        Cipher cipher0 = (Cipher)zzghd.f.get();
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b4);
        cipher0.init(1, this.c, ivParameterSpec0);
        cipher0.doFinal(arr_b, 0, arr_b.length, arr_b2, this.d);
        byte[] arr_b6 = this.b(((Cipher)object0), 2, arr_b2, this.d, arr_b.length);
        for(int v2 = 0; v2 < 16; ++v2) {
            arr_b2[v1 + v2] = (byte)(arr_b5[v2] ^ arr_b4[v2] ^ arr_b6[v2]);
        }
        return arr_b2;
    }
}

