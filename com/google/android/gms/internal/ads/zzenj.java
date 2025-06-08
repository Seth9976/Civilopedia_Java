package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class zzenj implements Callable {
    public final zzenk zza;

    public zzenj(zzenk zzenk0) {
        this.zza = zzenk0;
    }

    @Override
    public final Object call() {
        ArrayList arrayList0 = this.zza.a();
        return new zzenl(this.zza.c, this.zza.d.zze, arrayList0);
    }
}

