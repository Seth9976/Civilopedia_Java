package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdkr implements zzgqu {
    public final zzdkd a;
    public final zzgrh b;

    public zzdkr(zzdkd zzdkd0, zzgrh zzgrh0) {
        this.a = zzdkd0;
        this.b = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Executor executor0 = (Executor)this.b.zzb();
        return this.a.zzd(executor0);
    }
}

