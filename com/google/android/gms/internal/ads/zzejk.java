package com.google.android.gms.internal.ads;

public final class zzejk implements zzfok {
    public final zzejo zza;
    public final zzcli zzb;
    public final zzfbl zzc;
    public final zzdsu zzd;

    public zzejk(zzejo zzejo0, zzcli zzcli0, zzfbl zzfbl0, zzdsu zzdsu0) {
        this.zza = zzejo0;
        this.zzb = zzcli0;
        this.zzc = zzfbl0;
        this.zzd = zzdsu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzcli zzcli0 = this.zzb;
        zzdsu zzdsu0 = this.zzd;
        if(this.zzc.zzN) {
            zzcli0.zzag();
        }
        zzcli0.zzaa();
        zzcli0.onPause();
        return zzdsu0.zzk();
    }
}

