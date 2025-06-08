package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzftw extends AbstractExecutorService implements zzfvm {
    @Override
    public final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return new x8(Executors.callable(runnable0, object0));
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable0) {
        return new x8(callable0);
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return (zzfvl)super.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return (zzfvl)super.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return (zzfvl)super.submit(callable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfvm
    public final zzfvl zza(Runnable runnable0) {
        return (zzfvl)super.submit(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfvm
    public final zzfvl zzb(Callable callable0) {
        return (zzfvl)super.submit(callable0);
    }
}

