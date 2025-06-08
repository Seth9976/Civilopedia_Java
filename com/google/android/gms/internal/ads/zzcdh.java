package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzcdh implements Callable {
    public final zzcdn zza;

    public zzcdh(zzcdn zzcdn0) {
        this.zza = zzcdn0;
    }

    @Override
    public final Object call() {
        return (String)this.zza.g("getAppInstanceId", null, zzcdg.zza);
    }
}

