package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class zzei extends zzeg implements zzeu {
    @Override  // com.google.android.gms.internal.play_billing.zzeg
    public Future b() {
        throw null;
    }

    public abstract zzeu c();

    @Override  // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable0, Executor executor0) {
        this.c().zzb(runnable0, executor0);
    }
}

