package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeup implements zzetg {
    public final zzcer a;
    public final ScheduledExecutorService b;
    public final Executor c;

    public zzeup(zzcei zzcei0, int v, Context context0, zzcer zzcer0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, String s, byte[] arr_b) {
        this.a = zzcer0;
        this.b = scheduledExecutorService0;
        this.c = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 44;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfut zzfut0 = (zzfut)zzfvc.zzo(zzfvc.zzm(zzfut.zzv(zzfvc.zzl(new zzeum(this), this.c)), zzeun.zza, this.c), ((long)(((Long)zzay.zzc().zzb(zzbhz.zzaP)))), TimeUnit.MILLISECONDS, this.b);
        zzeuo zzeuo0 = new zzeuo(this);
        return zzfvc.zzf(zzfut0, Exception.class, zzeuo0, zzfvs.zzb());
    }
}

