package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzghe implements zzfwf {
    public final zzfyu a;

    public zzghe(byte[] arr_b) throws GeneralSecurityException {
        if(!zzfze.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new zzfyu(arr_b, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        return this.a.zza(arr_b2, arr_b, arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = zzgik.zza(12);
        return this.a.zzb(arr_b2, arr_b, arr_b1);
    }
}

