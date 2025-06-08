package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfb {
    public static zzev zza(ExecutorService executorService0) {
        if(executorService0 instanceof zzev) {
            return (zzev)executorService0;
        }
        return executorService0 instanceof ScheduledExecutorService ? new V(((ScheduledExecutorService)executorService0)) : new S(executorService0);
    }

    public static zzew zzb(ScheduledExecutorService scheduledExecutorService0) {
        return scheduledExecutorService0 instanceof zzew ? ((zzew)scheduledExecutorService0) : new V(scheduledExecutorService0);
    }
}

