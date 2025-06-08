package com.google.android.gms.internal.ads;

public final class zzfep implements zzfuj {
    public final zzfeq zza;
    public final zzfei zzb;

    public zzfep(zzfeq zzfeq0, zzfei zzfei0) {
        this.zza = zzfeq0;
        this.zzb = zzfei0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfeq zzfeq0 = this.zza;
        Exception exception0 = (Exception)object0;
        synchronized(zzfeq0) {
            zzfeq0.d = true;
            throw exception0;
        }
    }
}

