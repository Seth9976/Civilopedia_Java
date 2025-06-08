package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevu implements zzetg {
    public final zzcer a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final zzfvm d;

    public zzevu(zzcer zzcer0, boolean z, zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = zzcer0;
        this.b = z;
        this.d = zzfvm0;
        this.c = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 50;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(!this.b) {
            return zzfvc.zzi(null);
        }
        zzfvl zzfvl0 = zzfvc.zzo(zzfvc.zzm(zzfvc.zzi(null), zzevs.zza, this.d), ((long)(((Long)zzbkc.zzc.zze()))), TimeUnit.MILLISECONDS, this.c);
        zzevt zzevt0 = new zzevt(this);
        return zzfvc.zzf(zzfvl0, Exception.class, zzevt0, this.d);
    }
}

