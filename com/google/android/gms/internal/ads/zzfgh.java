package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzfgh implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzfgh(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.b.zzb();
        l6 l60 = ((zzfgi)this.c).zza();
        return new zzfgf(zzcfv.zza, scheduledExecutorService0, l60);  // 初始化器: Lcom/google/android/gms/internal/ads/zzffx;-><init>(Lcom/google/android/gms/internal/ads/zzfvm;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzffy;)V
    }
}

