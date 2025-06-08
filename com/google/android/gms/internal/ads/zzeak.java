package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzeak implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzeak(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    public final zzeaj zza() {
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        zzeba zzeba0 = ((zzebb)this.c).zza();
        zzgqo zzgqo0 = zzgqt.zza(this.d);
        return new zzeaj(scheduledExecutorService0, zzcfv.zza, zzeba0, zzgqo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

