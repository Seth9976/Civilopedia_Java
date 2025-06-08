package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class zzfux extends zzfuv implements zzfvl {
    @Override  // com.google.android.gms.internal.ads.zzfuv
    public Future c() {
        throw null;
    }

    public abstract zzfvl d();

    @Override  // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable0, Executor executor0) {
        this.d().zzc(runnable0, executor0);
    }
}

