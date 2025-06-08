package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzeul implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzeul(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    public static zzeuj zza(String s, zzbcp zzbcp0, zzcer zzcer0, ScheduledExecutorService scheduledExecutorService0, zzfvm zzfvm0) {
        return new zzeuj(zzcer0, scheduledExecutorService0, zzfvm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        ((zzevl)this.a).zza();
        zzcer zzcer0 = (zzcer)this.c.zzb();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.d.zzb();
        zzgrc.zzb(zzcfv.zza);
        return new zzeuj(zzcer0, scheduledExecutorService0, zzcfv.zza);
    }
}

