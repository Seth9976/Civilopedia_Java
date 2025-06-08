package com.google.android.gms.ads.nonagon.signalgeneration;

import H0.a;
import java.util.concurrent.Callable;

public final class zzao implements Callable {
    public final a zza;
    public final String zzb;

    public zzao(a a0, String s) {
        this.zza = a0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return this.zza.getClickSignals(this.zzb);
    }
}

