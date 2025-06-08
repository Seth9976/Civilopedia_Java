package com.google.android.gms.internal.ads;

public final class zzdbn implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdbn(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    public final zzdbm zza() {
        return new zzdbm(((zzcyn)this.a).zza(), ((zzcyo)this.b).zza(), ((zzefi)this.c.zzb()), ((zzcyp)this.d).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

