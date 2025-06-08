package com.google.android.gms.internal.ads;

public final class zzckm implements zzep {
    public final zzckv zza;
    public final String zzb;
    public final boolean zzc;

    public zzckm(zzckv zzckv0, String s, boolean z) {
        this.zza = zzckv0;
        this.zzb = s;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzep
    public final zzeq zza() {
        this.zza.getClass();
        return this.zzc ? new h3(this.zzb, this.zza, this.zza.n.zzd, this.zza.n.zzf, this.zza.n.zzp, this.zza.n.zzq) : new h3(this.zzb, null, this.zza.n.zzd, this.zza.n.zzf, this.zza.n.zzp, this.zza.n.zzq);
    }
}

