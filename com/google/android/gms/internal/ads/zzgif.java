package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class zzgif implements zzgbg {
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public zzgif(byte[] arr_b) throws GeneralSecurityException {
        zzgim.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.a = secretKeySpec0;
        if(!zzfze.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher0 = (Cipher)zzghs.zza.zza("AES/ECB/NoPadding");
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = h.x(cipher0.doFinal(new byte[16]));
        this.b = arr_b1;
        this.c = h.x(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgbg
    public final byte[] zza(byte[] arr_b, int v) throws GeneralSecurityException {
        byte[] arr_b1;
        if(v > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if(!zzfze.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher0 = (Cipher)zzghs.zza.zza("AES/ECB/NoPadding");
        cipher0.init(1, this.a);
        int v1 = Math.max(1, ((int)Math.ceil(((double)arr_b.length) / 16.0)));
        if(v1 * 16 == arr_b.length) {
            arr_b1 = zzghh.zze(arr_b, (v1 - 1) * 16, this.b, 0, 16);
        }
        else {
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, (v1 - 1) * 16, arr_b.length);
            if(arr_b2.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] arr_b3 = Arrays.copyOf(arr_b2, 16);
            arr_b3[arr_b2.length] = (byte)0x80;
            arr_b1 = zzghh.zzd(arr_b3, this.c);
        }
        byte[] arr_b4 = new byte[16];
        for(int v2 = 0; v2 < v1 - 1; ++v2) {
            arr_b4 = cipher0.doFinal(zzghh.zze(arr_b4, 0, arr_b, v2 * 16, 16));
        }
        return Arrays.copyOf(cipher0.doFinal(zzghh.zzd(arr_b1, arr_b4)), v);
    }
}

