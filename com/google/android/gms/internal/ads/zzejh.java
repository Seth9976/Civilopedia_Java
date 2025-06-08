package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzejh implements zzfuj {
    public final zzejo zza;
    public final zzfbl zzb;
    public final zzfbx zzc;
    public final zzdtt zzd;

    public zzejh(zzejo zzejo0, zzfbl zzfbl0, zzfbx zzfbx0, zzdtt zzdtt0) {
        this.zza = zzejo0;
        this.zzb = zzfbl0;
        this.zzc = zzfbx0;
        this.zzd = zzdtt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzcli zzcli0 = this.zza.b.zza(this.zza.d.zze, this.zzb, this.zzc.zzb.zzb);
        zzcli0.zzab(this.zzb.zzX);
        this.zzd.zza(this.zza.a, ((View)zzcli0));
        zzcga zzcga0 = new zzcga();
        zzcym zzcym0 = new zzcym(this.zzc, this.zzb, null);
        zzdsv zzdsv0 = new zzdsv(new s5(this.zza.a, this.zza.b, this.zza.d, this.zza.f, this.zzb, zzcga0, zzcli0, this.zza.g, this.zza.h), zzcli0);
        zzdsu zzdsu0 = this.zza.c.zze(zzcym0, zzdsv0);
        zzcga0.zzd(zzdsu0);
        zzbpc.zzb(zzcli0, zzdsu0.zzg());
        zzdsu0.zzc().zzj(new zzejj(zzcli0), zzcfv.zzf);
        zzdsu0.zzl().zzi(zzcli0, true, (this.zza.h ? this.zza.g : null));
        zzdsu0.zzl();
        return zzfvc.zzm(zzdto.zzj(zzcli0, this.zzb.zzt.zzb, this.zzb.zzt.zza), new zzejk(this.zza, zzcli0, this.zzb, zzdsu0), this.zza.e);
    }
}

