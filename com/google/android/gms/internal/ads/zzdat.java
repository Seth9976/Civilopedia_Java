package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzdat implements zzdbt, zzdcj, zzdgk, zzdiq {
    public final zzdcl i;
    public final zzfbl j;
    public final ScheduledExecutorService k;
    public final Executor l;
    public final zzfvt m;
    public ScheduledFuture n;

    public zzdat(zzdcl zzdcl0, zzfbl zzfbl0, ScheduledExecutorService scheduledExecutorService0, Executor executor0) {
        this.m = zzfvt.zzf();
        this.i = zzdcl0;
        this.j = zzfbl0;
        this.k = scheduledExecutorService0;
        this.l = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        synchronized(this) {
            if(this.m.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.n;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.m.zzd(Boolean.TRUE);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbp)).booleanValue()) {
            zzfbl zzfbl0 = this.j;
            if(zzfbl0.zzZ == 2) {
                if(zzfbl0.zzr == 0) {
                    this.i.zza();
                    return;
                }
                E9 e90 = new E9(this, 16);
                zzfvc.zzr(this.m, e90, this.l);
                zzdar zzdar0 = new zzdar(this);
                this.n = this.k.schedule(zzdar0, ((long)zzfbl0.zzr), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        synchronized(this) {
            if(this.m.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.n;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.m.zze(new Exception());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        if(this.j.zzZ != 0 && this.j.zzZ != 1) {
            return;
        }
        this.i.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcal0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}

