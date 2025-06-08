package com.google.android.gms.internal.play_billing;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzec extends AbstractExecutorService implements zzev {
    @Override
    public final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return new Z(Executors.callable(runnable0, object0));
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable0) {
        return new Z(callable0);
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return (zzeu)super.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return (zzeu)super.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return (zzeu)super.submit(callable0);
    }
}

