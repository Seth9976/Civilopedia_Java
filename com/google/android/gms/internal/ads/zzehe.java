package com.google.android.gms.internal.ads;

public final class zzehe implements zzfok {
    public final zzehg zza;
    public final zzcli zzb;
    public final zzfbl zzc;
    public final zzdka zzd;

    public zzehe(zzehg zzehg0, zzcli zzcli0, zzfbl zzfbl0, zzdka zzdka0) {
        this.zza = zzehg0;
        this.zzb = zzcli0;
        this.zzc = zzfbl0;
        this.zzd = zzdka0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzcli zzcli0 = this.zzb;
        zzdka zzdka0 = this.zzd;
        if(this.zzc.zzN) {
            zzcli0.zzag();
        }
        zzcli0.zzaa();
        zzcli0.onPause();
        return zzdka0.zzg();
    }
}

