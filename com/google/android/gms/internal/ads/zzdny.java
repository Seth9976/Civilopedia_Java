package com.google.android.gms.internal.ads;

public final class zzdny implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzdny(zzdnt zzdnt0, zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzccv zza() {
        return new zzccv(((zzcnl)this.a).zza(), ((zzdbk)this.b).zza().zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

