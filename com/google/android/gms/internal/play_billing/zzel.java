package com.google.android.gms.internal.play_billing;

import B.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzel {
    public static zzeu zza(Object object0) {
        return new N(object0);
    }

    public static zzeu zzb(zzeu zzeu0, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        if(zzeu0.isDone()) {
            return zzeu0;
        }
        X x0 = new X();  // 初始化器: Ljava/lang/Object;-><init>()V
        x0.p = zzeu0;
        W w0 = new W();  // 初始化器: Ljava/lang/Object;-><init>()V
        w0.i = x0;
        x0.q = scheduledExecutorService0.schedule(w0, 28500L, timeUnit0);
        zzeu0.zzb(w0, L.i);
        return x0;
    }

    public static void zzc(zzeu zzeu0, zzej zzej0, Executor executor0) {
        zzeu0.zzb(new a(6, zzeu0, zzej0), executor0);
    }
}

