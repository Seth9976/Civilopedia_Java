package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzech implements Callable {
    public final zzfvl zza;
    public final zzfvl zzb;

    public zzech(zzfvl zzfvl0, zzfvl zzfvl1) {
        this.zza = zzfvl0;
        this.zzb = zzfvl1;
    }

    @Override
    public final Object call() {
        return new zzecn(((zzecr)this.zza.get()), ((zzecl)this.zzb.get()).zzb, ((zzecl)this.zzb.get()).zza);
    }
}

