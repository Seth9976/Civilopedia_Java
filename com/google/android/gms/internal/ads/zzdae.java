package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdae implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzdae(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdiz(((zzdfz)this.a.zzb()), ((Executor)this.b.zzb()));
    }
}

