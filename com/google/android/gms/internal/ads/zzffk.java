package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzffk implements zzfvl {
    public final Object i;
    public final String j;
    public final zzfvl k;

    public zzffk(Object object0, String s, zzfvl zzfvl0) {
        this.i = object0;
        this.j = s;
        this.k = zzfvl0;
    }

    @Override
    public final boolean cancel(boolean z) {
        return this.k.cancel(z);
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        return this.k.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.k.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.k.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.k.isDone();
    }

    @Override
    public final String toString() {
        return this.j + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.i;
    }

    public final String zzb() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable0, Executor executor0) {
        this.k.zzc(runnable0, executor0);
    }
}

