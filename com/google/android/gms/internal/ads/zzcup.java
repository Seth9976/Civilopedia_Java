package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcup implements zzbbg {
    public final ScheduledExecutorService a;
    public final Clock b;
    public ScheduledFuture c;
    public long d;
    public long e;
    public Runnable f;
    public boolean g;

    public zzcup(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        this.d = -1L;
        this.e = -1L;
        this.f = null;
        this.g = false;
        this.a = scheduledExecutorService0;
        this.b = clock0;
        zzt.zzb().zzc(this);
    }

    public final void a() {
        synchronized(this) {
            if(!this.g) {
                if(this.c == null || this.c.isDone()) {
                    this.e = -1L;
                }
                else {
                    this.c.cancel(true);
                    this.e = this.d - this.b.elapsedRealtime();
                }
                this.g = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbbg
    public final void zza(boolean z) {
        if(z) {
            synchronized(this) {
                if(this.g) {
                    if(this.e > 0L && (this.c != null && this.c.isCancelled())) {
                        this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                    }
                    this.g = false;
                }
            }
            return;
        }
        this.a();
    }

    public final void zzd(int v, Runnable runnable0) {
        synchronized(this) {
            this.f = runnable0;
            this.d = this.b.elapsedRealtime() + ((long)v);
            this.c = this.a.schedule(runnable0, ((long)v), TimeUnit.MILLISECONDS);
        }
    }
}

