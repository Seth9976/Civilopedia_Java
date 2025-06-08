package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import g1.n;
import java.util.concurrent.Callable;

public final class zzfp implements Callable {
    public final zzfv zza;
    public final String zzb;

    public zzfp(zzfv zzfv0, String s) {
        this.zza = zzfv0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzn("internal.remoteConfig", new n(11, this.zza, this.zzb));
    }
}

