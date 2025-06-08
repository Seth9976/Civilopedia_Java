package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeur implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;

    public zzeur(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzcei zzcei0 = new zzcei();
        int v = (int)((zzevm)this.b).zza();
        Context context0 = ((zzcnl)this.c).zza();
        Object object0 = this.d.zzb();
        Object object1 = this.e.zzb();
        zzgrc.zzb(zzcfv.zza);
        String s = ((zzevl)this.g).zza();
        return new zzeup(zzcei0, v, context0, ((zzcer)object0), ((ScheduledExecutorService)object1), zzcfv.zza, s, null);
    }
}

