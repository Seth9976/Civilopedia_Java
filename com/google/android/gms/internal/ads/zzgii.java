package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgii implements zzfwx {
    public final zzgbg a;
    public final int b;

    public zzgii(zzgbg zzgbg0, int v) throws GeneralSecurityException {
        this.a = zzgbg0;
        this.b = v;
        if(v < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgbg0.zza(new byte[0], v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwx
    public final void zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(!zzghh.zzb(this.zzb(arr_b1), arr_b)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfwx
    public final byte[] zzb(byte[] arr_b) throws GeneralSecurityException {
        return this.a.zza(arr_b, this.b);
    }
}

