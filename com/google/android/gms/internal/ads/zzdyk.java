package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzdyk implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;
    public final zzgrh i;
    public final zzgrh j;

    public zzdyk(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8, zzgrh zzgrh9) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
        this.i = zzgrh8;
        this.j = zzgrh9;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object object0 = this.a.zzb();
        Context context0 = ((zzcnl)this.b).zza();
        WeakReference weakReference0 = ((zzcnm)this.c).zza();
        zzgrc.zzb(zzcfv.zza);
        Object object1 = this.e.zzb();
        Object object2 = this.f.zzb();
        Object object3 = this.g.zzb();
        zzcfo zzcfo0 = ((zzcnv)this.h).zza();
        zzdik zzdik0 = ((zzdil)this.i).zza();
        Object object4 = this.j.zzb();
        return new zzdyj(((Executor)object0), context0, weakReference0, zzcfv.zza, ((zzduc)object1), ((ScheduledExecutorService)object2), ((zzdwq)object3), zzcfo0, zzdik0, ((zzfhu)object4));
    }
}

