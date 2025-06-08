package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzdei extends zzdhc {
    public final ScheduledExecutorService j;
    public final Clock k;
    public long l;
    public long m;
    public boolean n;
    public ScheduledFuture o;

    public zzdei(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        super(Collections.emptySet());
        this.l = -1L;
        this.m = -1L;
        this.n = false;
        this.j = scheduledExecutorService0;
        this.k = clock0;
    }

    public final void b(long v) {
        synchronized(this) {
            if(this.o != null && !this.o.isDone()) {
                this.o.cancel(true);
            }
            this.l = this.k.elapsedRealtime() + v;
            A0 a00 = new A0(this);
            this.o = this.j.schedule(a00, v, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        synchronized(this) {
            this.n = false;
            this.b(0L);
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!this.n) {
                if(this.o == null || this.o.isCancelled()) {
                    this.m = -1L;
                }
                else {
                    this.o.cancel(true);
                    this.m = this.l - this.k.elapsedRealtime();
                }
                this.n = true;
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            if(this.n) {
                if(this.m > 0L && this.o.isCancelled()) {
                    this.b(this.m);
                }
                this.n = false;
            }
        }
    }

    public final void zzd(int v) {
        synchronized(this) {
            if(v <= 0) {
                return;
            }
            long v2 = TimeUnit.SECONDS.toMillis(((long)v));
            if(this.n) {
                long v3 = this.m;
                if(v3 <= 0L || v2 >= v3) {
                    v2 = v3;
                }
                this.m = v2;
                return;
            }
            if(this.k.elapsedRealtime() <= this.l && this.l - this.k.elapsedRealtime() <= v2) {
                return;
            }
            this.b(v2);
        }
    }
}

