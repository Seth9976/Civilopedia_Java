package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzcfv {
    public static final zzfvm zza;
    public static final zzfvm zzb;
    public static final zzfvm zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfvm zze;
    public static final zzfvm zzf;

    static {
        zzcfv.zza = new H2(new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new D2("Default", 1)));
        ExecutorService executorService0 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new D2("Loader", 1));
        ((ThreadPoolExecutor)executorService0).allowCoreThreadTimeOut(true);
        zzcfv.zzb = new H2(executorService0);
        ExecutorService executorService1 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new D2("Activeview", 1));
        ((ThreadPoolExecutor)executorService1).allowCoreThreadTimeOut(true);
        zzcfv.zzc = new H2(executorService1);
        zzcfv.zzd = new G2(3, new D2("Schedule", 1));  // 初始化器: Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V
        zzcfv.zze = new H2(new n0());
        zzcfv.zzf = new H2(zzfvs.zzb());
    }
}

