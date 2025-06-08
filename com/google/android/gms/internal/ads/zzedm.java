package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzedm implements Callable {
    public final zzedk zza;

    public zzedm(zzedk zzedk0) {
        this.zza = zzedk0;
    }

    @Override
    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}

