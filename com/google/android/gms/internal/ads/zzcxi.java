package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcxi implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzcxi(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzcxd(((zzczs)this.a).zza(), ((zzcxh)this.b).zza(), ((zzcxg)this.c).zza(), ((Executor)this.d.zzb()));
    }
}

