package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class zzeg extends zzcf implements Future {
    @Override  // com.google.android.gms.internal.play_billing.zzcf
    public Object a() {
        throw null;
    }

    public abstract Future b();

    @Override
    public boolean cancel(boolean z) {
        return this.b().cancel(z);
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        return this.b().get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.b().get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.b().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.b().isDone();
    }
}

