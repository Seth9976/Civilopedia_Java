package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgap {
    public final zzfwf a;
    public final zzfwl b;

    public zzgap(zzfwf zzfwf0) {
        this.a = zzfwf0;
        this.b = null;
    }

    public zzgap(zzfwl zzfwl0) {
        this.a = null;
        this.b = zzfwl0;
    }

    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return this.a == null ? this.b.zza(arr_b, arr_b1) : this.a.zzb(arr_b, arr_b1);
    }
}

