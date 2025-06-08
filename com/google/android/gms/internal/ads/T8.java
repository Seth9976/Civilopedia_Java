package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class t8 extends H2 implements ScheduledExecutorService {
    public final ScheduledExecutorService k;

    public t8(ScheduledExecutorService scheduledExecutorService0) {
        super(scheduledExecutorService0);
        this.k = scheduledExecutorService0;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        x8 x80 = new x8(Executors.callable(runnable0, null));
        return new r8(x80, this.k.schedule(x80, v, timeUnit0));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        x8 x80 = new x8(callable0);
        return new r8(x80, this.k.schedule(x80, v, timeUnit0));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        s8 s80 = new s8(runnable0);
        return new r8(s80, this.k.scheduleAtFixedRate(s80, v, v1, timeUnit0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        s8 s80 = new s8(runnable0);
        return new r8(s80, this.k.scheduleWithFixedDelay(s80, v, v1, timeUnit0));
    }
}

