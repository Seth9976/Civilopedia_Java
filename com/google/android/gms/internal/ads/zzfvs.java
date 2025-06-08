package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfvs {
    public static Executor a(Executor executor0, k8 k80) {
        executor0.getClass();
        return executor0 == j8.i ? executor0 : new q8(executor0, k80);
    }

    public static zzfvm zza(ExecutorService executorService0) {
        if(executorService0 instanceof zzfvm) {
            return (zzfvm)executorService0;
        }
        return executorService0 instanceof ScheduledExecutorService ? new t8(((ScheduledExecutorService)executorService0)) : new H2(executorService0);
    }

    public static Executor zzb() {
        return j8.i;
    }
}

