package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzetx implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzetx(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzcei zzcei0 = new zzcei();
        Context context0 = ((zzcnl)this.b).zza();
        Object object0 = this.c.zzb();
        zzgrc.zzb(zzcfv.zza);
        int v = (int)((zzevm)this.e).zza();
        return new zzetv(zzcei0, context0, ((ScheduledExecutorService)object0), zzcfv.zza, v, null);
    }
}

