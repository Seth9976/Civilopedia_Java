package com.google.android.gms.internal.ads;

public final class zzdqt implements zzcmt {
    public final zzdqz zza;
    public final zzcli zzb;
    public final zzcfz zzc;

    public zzdqt(zzdqz zzdqz0, zzcli zzcli0, zzcfz zzcfz0) {
        this.zza = zzdqz0;
        this.zzb = zzcli0;
        this.zzc = zzcfz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        zzdqz zzdqz0 = this.zza;
        zzcli zzcli0 = this.zzb;
        zzcfz zzcfz0 = this.zzc;
        if(z) {
            zzfcd zzfcd0 = zzdqz0.a;
            if(zzfcd0.zza != null && zzcli0.zzs() != null) {
                zzcli0.zzs().zzs(zzfcd0.zza);
            }
            zzcfz0.zzb();
            return;
        }
        zzdqz0.getClass();
        zzcfz0.zze(new zzeit(1, "Html video Web View failed to load."));
    }
}

