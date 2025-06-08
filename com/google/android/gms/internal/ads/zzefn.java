package com.google.android.gms.internal.ads;

public final class zzefn implements zzfok {
    public final zzefq zza;
    public final zzcli zzb;
    public final zzfbl zzc;
    public final zzcvg zzd;

    public zzefn(zzefq zzefq0, zzcli zzcli0, zzfbl zzfbl0, zzcvg zzcvg0) {
        this.zza = zzefq0;
        this.zzb = zzcli0;
        this.zzc = zzfbl0;
        this.zzd = zzcvg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzcli zzcli0 = this.zzb;
        zzcvg zzcvg0 = this.zzd;
        if(this.zzc.zzN) {
            zzcli0.zzag();
        }
        zzcli0.zzaa();
        zzcli0.onPause();
        return zzcvg0.zza();
    }
}

