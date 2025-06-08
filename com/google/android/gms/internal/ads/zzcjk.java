package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzcjk implements Callable {
    public final zzcjm zza;

    public zzcjk(zzcjm zzcjm0) {
        this.zza = zzcjm0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.zza.c.zzs(this.zza.d, this.zza.e, this.zza));
    }
}

