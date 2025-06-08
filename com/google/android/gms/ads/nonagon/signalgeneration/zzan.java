package com.google.android.gms.ads.nonagon.signalgeneration;

import H0.a;
import java.util.concurrent.Callable;

public final class zzan implements Callable {
    public final a zza;

    public zzan(a a0) {
        this.zza = a0;
    }

    @Override
    public final Object call() {
        return this.zza.getViewSignals();
    }
}

