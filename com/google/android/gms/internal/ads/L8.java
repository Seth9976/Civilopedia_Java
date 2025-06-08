package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class l8 extends zzfut {
    public final zzfvl p;

    public l8(zzfvl zzfvl0) {
        zzfvl0.getClass();
        this.p = zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean cancel(boolean z) {
        return this.p.cancel(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final Object get() {
        return this.p.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.p.get(v, timeUnit0);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean isCancelled() {
        return this.p.isCancelled();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final boolean isDone() {
        return this.p.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String toString() {
        return this.p.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void zzc(Runnable runnable0, Executor executor0) {
        this.p.zzc(runnable0, executor0);
    }
}

