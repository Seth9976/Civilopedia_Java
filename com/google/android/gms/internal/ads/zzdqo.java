package com.google.android.gms.internal.ads;

public final class zzdqo implements zzcmt {
    public final zzdqz zza;
    public final zzcli zzb;
    public final zzcfz zzc;

    public zzdqo(zzdqz zzdqz0, zzcli zzcli0, zzcfz zzcfz0) {
        this.zza = zzdqz0;
        this.zzb = zzcli0;
        this.zzc = zzcfz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        zzcli zzcli0 = this.zzb;
        zzcfz zzcfz0 = this.zzc;
        zzfcd zzfcd0 = this.zza.a;
        if(zzfcd0.zza != null && zzcli0.zzs() != null) {
            zzcli0.zzs().zzs(zzfcd0.zza);
        }
        zzcfz0.zzb();
    }
}

