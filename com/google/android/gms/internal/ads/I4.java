package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;

public final class i4 implements zzfuy {
    public final int i;
    public final zzfuy j;
    public final zzcyl k;

    public i4(zzcyl zzcyl0, zzfuy zzfuy0, int v) {
        this.i = v;
        this.k = zzcyl0;
        this.j = zzfuy0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        if(this.i != 0) {
            zzcyi zzcyi0 = new zzcyi(this.k);
            zzcfv.zze.execute(zzcyi0);
            this.j.zza(throwable0);
            return;
        }
        this.j.zza(throwable0);
        zzcyi zzcyi1 = new zzcyi(this.k);
        zzcfv.zze.execute(zzcyi1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        if(this.i != 0) {
            zzcyi zzcyi0 = new zzcyi(this.k);
            zzcfv.zze.execute(zzcyi0);
            this.j.zzb(((zzcxx)object0));
            return;
        }
        List list0 = ((zzcye)object0).zza;
        zzcyl zzcyl0 = this.k;
        Executor executor0 = zzcyl0.a;
        zzfuy zzfuy0 = this.j;
        if(list0 != null && !list0.isEmpty()) {
            zzfvl zzfvl0 = zzfvc.zzi(null);
            for(Object object1: list0) {
                zzcyg zzcyg0 = new zzcyg(zzfuy0);
                zzfvl0 = zzfvc.zzn(zzfvc.zzg(zzfvl0, Throwable.class, zzcyg0, executor0), new zzcyh(zzcyl0, zzfuy0, ((zzfvl)object1)), executor0);
            }
            zzfvc.zzr(zzfvl0, new i4(zzcyl0, zzfuy0, 1), executor0);
            return;
        }
        executor0.execute(new zzcyf(zzfuy0));
    }
}

