package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzdcg extends zzdhc implements zzdbx {
    public final ScheduledExecutorService j;
    public ScheduledFuture k;
    public boolean l;

    public zzdcg(zzdcf zzdcf0, Set set0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        super(set0);
        this.l = false;
        this.j = scheduledExecutorService0;
        this.zzj(zzdcf0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zza(zze zze0) {
        this.a(new zzdbz(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        this.a(zzdcb.zza);
    }

    public final void zzd() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.k;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlf0) {
        if(this.l) {
            return;
        }
        ScheduledFuture scheduledFuture0 = this.k;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        this.a(new zzdby(zzdlf0));
    }

    public final void zzf() {
        int v = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzig)));
        zzdca zzdca0 = new zzdca(this);
        this.k = this.j.schedule(zzdca0, ((long)v), TimeUnit.MILLISECONDS);
    }
}

