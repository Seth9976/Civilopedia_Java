package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzeuz implements Callable {
    public final zzfvl zza;
    public final zzfvl zzb;

    public zzeuz(zzfvl zzfvl0, zzfvl zzfvl1) {
        this.zza = zzfvl0;
        this.zzb = zzfvl1;
    }

    @Override
    public final Object call() {
        return new zzevb(((String)this.zza.get()), ((String)this.zzb.get()));
    }
}

