package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzt;
import java.util.concurrent.Callable;

public final class zzfr implements Callable {
    public final zzfv zza;

    public zzfr(zzfv zzfv0) {
        this.zza = zzfv0;
    }

    @Override
    public final Object call() {
        return new zzt(this.zza.k);
    }
}

