package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class zzcga implements zzfvl {
    public final zzfvt i;

    public zzcga() {
        this.i = zzfvt.zzf();
    }

    @Override
    public boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        return this.i.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        return this.i.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.i.isDone();
    }

    public void zza(Object object0) {
        this.zzd(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable0, Executor executor0) {
        this.i.zzc(runnable0, executor0);
    }

    public final boolean zzd(Object object0) {
        boolean z = this.i.zzd(object0);
        if(!z) {
            zzt.zzo().zzs(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean zze(Throwable throwable0) {
        boolean z = this.i.zze(throwable0);
        if(!z) {
            zzt.zzo().zzs(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }
}

