package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzu;
import java.util.concurrent.Callable;

public final class zzfq implements Callable {
    public final zzfv zza;
    public final String zzb;

    public zzfq(zzfv zzfv0, String s) {
        this.zza = zzfv0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzu("internal.appMetadata", new zzfo(this.zza, this.zzb));
    }
}

