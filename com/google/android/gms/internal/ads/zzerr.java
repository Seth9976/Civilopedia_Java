package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzerr implements zzetg {
    public final zzetg a;
    public final long b;
    public final ScheduledExecutorService c;

    public zzerr(zzetg zzetg0, long v, ScheduledExecutorService scheduledExecutorService0) {
        this.a = zzetg0;
        this.b = v;
        this.c = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return this.a.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfvl zzfvl0 = this.a.zzb();
        long v = this.b;
        if(v > 0L) {
            zzfvl0 = zzfvc.zzo(zzfvl0, v, TimeUnit.MILLISECONDS, this.c);
        }
        return zzfvc.zzg(zzfvl0, Throwable.class, zzerq.zza, zzcfv.zzf);
    }
}

