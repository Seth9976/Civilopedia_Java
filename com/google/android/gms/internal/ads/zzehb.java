package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzehb implements zzfuj {
    public final zzehg zza;
    public final zzfbl zzb;
    public final zzfbx zzc;
    public final zzdtt zzd;

    public zzehb(zzehg zzehg0, zzfbl zzfbl0, zzfbx zzfbx0, zzdtt zzdtt0) {
        this.zza = zzehg0;
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
        zzdkd zzdkd0 = new zzdkd(new n5(this.zza.a, this.zza.f, zzcga0, this.zzb, zzcli0, this.zza.d, this.zza.h, this.zza.g), zzcli0);
        zzdka zzdka0 = this.zza.c.zze(zzcym0, zzdkd0);
        zzcga0.zzd(zzdka0);
        zzdka0.zzc().zzj(new zzehd(zzcli0), zzcfv.zzf);
        zzdka0.zzk().zzi(zzcli0, true, (this.zza.h ? this.zza.g : null));
        zzdka0.zzk();
        return zzfvc.zzm(zzdto.zzj(zzcli0, this.zzb.zzt.zzb, this.zzb.zzt.zza), new zzehe(this.zza, zzcli0, this.zzb, zzdka0), this.zza.e);
    }
}

