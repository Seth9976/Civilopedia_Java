package com.google.android.gms.internal.ads;

public final class zzfgy implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzfgy(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzfgx zza() {
        return new zzfgx(((zzcnl)this.a).zza(), ((zzcnv)this.b).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

