package com.google.android.gms.internal.ads;

public final class zzayf {
    public final zzaxq zza;
    public final zzayc zzb;
    public final Object zzc;
    public final zzasa[] zzd;

    public zzayf(zzaxq zzaxq0, zzayc zzayc0, Object object0, zzasa[] arr_zzasa) {
        this.zza = zzaxq0;
        this.zzb = zzayc0;
        this.zzc = object0;
        this.zzd = arr_zzasa;
    }

    // 去混淆评级： 低(30)
    public final boolean zza(zzayf zzayf0, int v) {
        return zzayf0 == null ? false : zzazo.zzo(this.zzb.zza(v), zzayf0.zzb.zza(v)) && zzazo.zzo(this.zzd[v], zzayf0.zzd[v]);
    }
}

