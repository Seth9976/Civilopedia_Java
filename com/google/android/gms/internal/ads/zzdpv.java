package com.google.android.gms.internal.ads;

public final class zzdpv implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdpv(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    public final zzdpu zza() {
        zzgrc.zzb(zzcfv.zza);
        zzdqh zzdqh0 = ((zzdqi)this.b).zza();
        zzdqm zzdqm0 = ((zzdqn)this.c).zza();
        return new zzdpu(zzcfv.zza, zzdqh0, zzdqm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

