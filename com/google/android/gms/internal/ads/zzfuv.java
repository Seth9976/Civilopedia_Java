package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class zzfuv extends zzfra implements Future {
    @Override  // com.google.android.gms.internal.ads.zzfra
    public Object b() {
        throw null;
    }

    public abstract Future c();

    @Override
    public boolean cancel(boolean z) {
        return this.c().cancel(z);
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        return this.c().get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.c().get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.c().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.c().isDone();
    }
}

