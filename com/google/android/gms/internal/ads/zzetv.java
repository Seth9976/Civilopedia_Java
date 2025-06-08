package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzetv implements zzetg {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final int d;
    public final zzcei e;

    public zzetv(zzcei zzcei0, Context context0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, int v, byte[] arr_b) {
        this.e = zzcei0;
        this.a = context0;
        this.b = scheduledExecutorService0;
        this.c = executor0;
        this.d = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 40;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaO)).booleanValue()) {
            zzfut zzfut0 = (zzfut)zzfvc.zzo(zzfvc.zzm(zzfut.zzv(this.e.zza(this.a, this.d)), zzett.zza, this.c), ((long)(((Long)zzay.zzc().zzb(zzbhz.zzaP)))), TimeUnit.MILLISECONDS, this.b);
            zzetu zzetu0 = new zzetu(this);
            return zzfvc.zzf(zzfut0, Throwable.class, zzetu0, this.c);
        }
        return zzfvc.zzh(new Exception("Did not ad Ad ID into query param."));
    }
}

