package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzcex {
    public static final ThreadPoolExecutor zza;
    public static final ExecutorService zzb;

    static {
        zzcex.zza = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new D2("ClientDefault", 0));
        zzcex.zzb = Executors.newSingleThreadExecutor(new D2("ClientSingle", 0));
    }
}

