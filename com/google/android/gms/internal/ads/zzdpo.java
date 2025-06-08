package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdpo implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzdpo(zzdph zzdph0, zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdiz(((zzdsp)this.a).zza(), ((Executor)this.b.zzb()));
    }
}

