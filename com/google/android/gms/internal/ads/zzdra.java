package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdra implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdra(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdqy(((Executor)this.a.zzb()), ((zzcun)this.b.zzb()), ((zzdjb)this.c.zzb()));
    }
}

