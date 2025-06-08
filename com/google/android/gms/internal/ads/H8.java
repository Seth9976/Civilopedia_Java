package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class h8 extends p8 {
    public final Executor k;
    public final i8 l;
    public final Callable m;
    public final i8 n;

    public h8(i8 i80, Callable callable0, Executor executor0) {
        this.n = i80;
        this.l = i80;
        super();
        executor0.getClass();
        this.k = executor0;
        callable0.getClass();
        this.m = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final Object a() {
        return this.m.call();
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final String b() {
        return this.m.toString();
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final void d(Throwable throwable0) {
        i8 i80 = this.l;
        i80.x = null;
        if(throwable0 instanceof ExecutionException) {
            i80.zze(((ExecutionException)throwable0).getCause());
            return;
        }
        if(throwable0 instanceof CancellationException) {
            i80.cancel(false);
            return;
        }
        i80.zze(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final void e(Object object0) {
        this.l.x = null;
        this.n.zzd(object0);
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final boolean f() {
        return this.l.isDone();
    }
}

