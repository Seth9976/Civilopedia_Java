package com.google.android.gms.internal.ads;

public final class zzedp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzedp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzedo zza() {
        return new zzedo(((zzedl)this.a).zza(), ((zzfvm)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

