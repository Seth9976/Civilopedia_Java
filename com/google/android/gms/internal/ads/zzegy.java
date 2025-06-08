package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzegy implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzegy(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    public final zzegx zza() {
        Object object0 = this.a.zzb();
        zzege zzege0 = ((zzegf)this.b).zza();
        Object object1 = this.c.zzb();
        Object object2 = this.d.zzb();
        zzgrc.zzb(zzcfv.zza);
        return new zzegx(((zzcws)object0), zzege0, ((zzdbv)object1), ((ScheduledExecutorService)object2), zzcfv.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

