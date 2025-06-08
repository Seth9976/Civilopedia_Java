package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfvc {
    public static zzfvb zza(Iterable iterable0) {
        return new zzfvb(false, zzfrj.zzl(iterable0));
    }

    @SafeVarargs
    public static zzfvb zzb(zzfvl[] arr_zzfvl) {
        return new zzfvb(false, zzfrj.zzn(arr_zzfvl));
    }

    public static zzfvb zzc(Iterable iterable0) {
        return new zzfvb(true, zzfrj.zzl(iterable0));
    }

    @SafeVarargs
    public static zzfvb zzd(zzfvl[] arr_zzfvl) {
        return new zzfvb(true, zzfrj.zzn(arr_zzfvl));
    }

    public static zzfvl zze(Iterable iterable0) {
        zzfrj zzfrj0 = zzfrj.zzl(iterable0);
        zzfvl zzfvl0 = new f8(zzfrj0, true, true);  // 初始化器: Lcom/google/android/gms/internal/ads/b8;-><init>(Lcom/google/android/gms/internal/ads/zzfre;ZZ)V
        List list0 = zzfrj0.isEmpty() ? Collections.emptyList() : zzfrx.zza(zzfrj0.size());
        for(int v = 0; v < zzfrj0.size(); ++v) {
            list0.add(null);
        }
        zzfvl0.x = list0;
        ((b8)zzfvl0).t();
        return zzfvl0;
    }

    public static zzfvl zzf(zzfvl zzfvl0, Class class0, zzfok zzfok0, Executor executor0) {
        zzfvl zzfvl1 = new J7(zzfvl0, class0, zzfok0);  // 初始化器: Lcom/google/android/gms/internal/ads/K7;-><init>(Lcom/google/android/gms/internal/ads/zzfvl;Ljava/lang/Class;Ljava/lang/Object;)V
        zzfvl0.zzc(((Runnable)zzfvl1), zzfvs.a(executor0, ((k8)zzfvl1)));
        return zzfvl1;
    }

    public static zzfvl zzg(zzfvl zzfvl0, Class class0, zzfuj zzfuj0, Executor executor0) {
        zzfvl zzfvl1 = new I7(zzfvl0, class0, zzfuj0);  // 初始化器: Lcom/google/android/gms/internal/ads/K7;-><init>(Lcom/google/android/gms/internal/ads/zzfvl;Ljava/lang/Class;Ljava/lang/Object;)V
        zzfvl0.zzc(((Runnable)zzfvl1), zzfvs.a(executor0, ((k8)zzfvl1)));
        return zzfvl1;
    }

    public static zzfvl zzh(Throwable throwable0) {
        throwable0.getClass();
        zzfvl zzfvl0 = new m8();  // 初始化器: Ljava/lang/Object;-><init>()V
        ((zzftt)zzfvl0).zze(throwable0);
        return zzfvl0;
    }

    public static zzfvl zzi(Object object0) {
        return object0 == null ? n8.j : new n8(object0);
    }

    public static zzfvl zzj() {
        return n8.j;
    }

    public static zzfvl zzk(Callable callable0, Executor executor0) {
        zzfvl zzfvl0 = new x8(callable0);
        executor0.execute(((Runnable)zzfvl0));
        return zzfvl0;
    }

    public static zzfvl zzl(zzfui zzfui0, Executor executor0) {
        zzfvl zzfvl0 = new x8();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzfvl0.p = new w8(((x8)zzfvl0), zzfui0);
        executor0.execute(((Runnable)zzfvl0));
        return zzfvl0;
    }

    public static zzfvl zzm(zzfvl zzfvl0, zzfok zzfok0, Executor executor0) {
        zzfok0.getClass();
        zzfvl zzfvl1 = new Z7(zzfok0, zzfvl0);  // 初始化器: Lcom/google/android/gms/internal/ads/a8;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfvl;)V
        zzfvl0.zzc(((Runnable)zzfvl1), zzfvs.a(executor0, ((k8)zzfvl1)));
        return zzfvl1;
    }

    public static zzfvl zzn(zzfvl zzfvl0, zzfuj zzfuj0, Executor executor0) {
        executor0.getClass();
        zzfvl zzfvl1 = new Y7(zzfuj0, zzfvl0);  // 初始化器: Lcom/google/android/gms/internal/ads/a8;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfvl;)V
        zzfvl0.zzc(((Runnable)zzfvl1), zzfvs.a(executor0, ((k8)zzfvl1)));
        return zzfvl1;
    }

    public static zzfvl zzo(zzfvl zzfvl0, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        if(zzfvl0.isDone()) {
            return zzfvl0;
        }
        zzfvl zzfvl1 = new v8();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzfvl1.p = zzfvl0;
        A0 a00 = new A0();
        a00.j = zzfvl1;
        zzfvl1.q = scheduledExecutorService0.schedule(a00, v, timeUnit0);
        zzfvl0.zzc(a00, j8.i);
        return zzfvl1;
    }

    public static Object zzp(Future future0) throws ExecutionException {
        if(!future0.isDone()) {
            throw new IllegalStateException(zzfpi.zzb("Future was expected to be done: %s", new Object[]{future0}));
        }
        return zzfwc.zza(future0);
    }

    public static Object zzq(Future future0) {
        try {
            return zzfwc.zza(future0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof Error) {
                throw new zzfur(((Error)throwable0));
            }
            throw new zzfwb(throwable0);
        }
    }

    public static void zzr(zzfvl zzfvl0, zzfuy zzfuy0, Executor executor0) {
        zzfuy0.getClass();
        zzfvl0.zzc(new m0(zzfvl0, zzfuy0, 10, false), executor0);
    }
}

