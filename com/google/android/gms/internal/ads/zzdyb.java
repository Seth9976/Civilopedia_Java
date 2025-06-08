package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdyb implements Callable {
    public final zzdyj zza;
    public final zzfhh zzb;

    public zzdyb(zzdyj zzdyj0, zzfhh zzfhh0) {
        this.zza = zzdyj0;
        this.zzb = zzfhh0;
    }

    @Override
    public final Object call() {
        this.zza.e.zzd(Boolean.TRUE);
        this.zzb.zze(true);
        zzfhl zzfhl0 = this.zzb.zzj();
        this.zza.p.zzb(zzfhl0);
        return null;
    }
}

