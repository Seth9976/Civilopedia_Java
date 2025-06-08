package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class n8 implements zzfvl {
    public final Object i;
    public static final n8 j;
    public static final Logger k;

    static {
        n8.j = new n8(null);
        n8.k = Logger.getLogger("com.google.android.gms.internal.ads.n8");
    }

    public n8(Object object0) {
        this.i = object0;
    }

    @Override
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override
    public final Object get() {
        return this.i;
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        timeUnit0.getClass();
        return this.i;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    @Override
    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.i + "]]";
    }

    @Override  // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable0, Executor executor0) {
        zzfou.zzc(runnable0, "Runnable was null.");
        zzfou.zzc(executor0, "Executor was null.");
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            n8.k.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }
}

