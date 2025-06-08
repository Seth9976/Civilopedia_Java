package com.google.android.gms.internal.ads;

public final class g implements zzzu {
    public final zzzu a;
    public final zzaaz b;

    public g(zzaaz zzaaz0, zzzu zzzu0) {
        this.b = zzaaz0;
        this.a = zzzu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        zzzs zzzs0 = this.a.zzg(v);
        return new zzzs(new zzzv(zzzs0.zza.zzb, zzzs0.zza.zzc + this.b.i), new zzzv(zzzs0.zzb.zzb, zzzs0.zzb.zzc + this.b.i));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.a.zzh();
    }
}

