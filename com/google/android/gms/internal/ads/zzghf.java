package com.google.android.gms.internal.ads;

import A.f;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzghf implements zzfwl {
    public final zzgif a;
    public final byte[] b;
    public static final List c;
    public static final byte[] d;

    static {
        zzghf.c = Arrays.asList(new Integer[]{0x40});
        zzghf.d = new byte[16];
    }

    public zzghf(byte[] arr_b) throws GeneralSecurityException {
        if(!zzfze.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if(!zzghf.c.contains(((int)arr_b.length))) {
            throw new InvalidKeyException(f.e(arr_b.length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, arr_b.length >> 1);
        this.b = Arrays.copyOfRange(arr_b, arr_b.length >> 1, arr_b.length);
        this.a = new zzgif(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwl
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b5;
        if(arr_b.length > 0x7FFFFFEF) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher0 = (Cipher)zzghs.zza.zza("AES/CTR/NoPadding");
        byte[][] arr2_b = {arr_b1, arr_b};
        zzgif zzgif0 = this.a;
        byte[] arr_b2 = zzgif0.zza(zzghf.d, 16);
        for(int v = 0; v <= 0; ++v) {
            byte[] arr_b3 = arr2_b[v];
            if(arr_b3 == null) {
                arr_b3 = new byte[0];
            }
            arr_b2 = zzghh.zzd(h.x(arr_b2), zzgif0.zza(arr_b3, 16));
        }
        byte[] arr_b4 = arr2_b[1];
        if(arr_b4.length >= 16) {
            if(arr_b4.length < arr_b2.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int v1 = arr_b4.length - arr_b2.length;
            arr_b5 = Arrays.copyOf(arr_b4, arr_b4.length);
            for(int v2 = 0; v2 < arr_b2.length; ++v2) {
                arr_b5[v1 + v2] = (byte)(arr_b5[v1 + v2] ^ arr_b2[v2]);
            }
        }
        else {
            if(arr_b4.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] arr_b6 = Arrays.copyOf(arr_b4, 16);
            arr_b6[arr_b4.length] = (byte)0x80;
            arr_b5 = zzghh.zzd(arr_b6, h.x(arr_b2));
        }
        byte[] arr_b7 = zzgif0.zza(arr_b5, 16);
        byte[] arr_b8 = (byte[])arr_b7.clone();
        arr_b8[8] = (byte)(arr_b8[8] & 0x7F);
        arr_b8[12] = (byte)(arr_b8[12] & 0x7F);
        cipher0.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(arr_b8));
        return zzghh.zzc(new byte[][]{arr_b7, cipher0.doFinal(arr_b)});
    }
}

