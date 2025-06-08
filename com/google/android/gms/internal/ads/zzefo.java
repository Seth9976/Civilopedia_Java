package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzefo implements zzfuj {
    public final zzefq zza;
    public final zzfbl zzb;
    public final zzfbx zzc;
    public final zzdtt zzd;

    public zzefo(zzefq zzefq0, zzfbl zzfbl0, zzfbx zzfbx0, zzdtt zzdtt0) {
        this.zza = zzefq0;
        this.zzb = zzfbl0;
        this.zzc = zzfbx0;
        this.zzd = zzdtt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzcli zzcli0 = this.zza.c.zza(this.zza.d.zze, this.zzb, this.zzc.zzb.zzb);
        zzcli0.zzab(this.zzb.zzX);
        this.zzd.zza(this.zza.b, ((View)zzcli0));
        zzcga zzcga0 = new zzcga();
        zzcym zzcym0 = new zzcym(this.zzc, this.zzb, null);
        zzdkd zzdkd0 = new zzdkd(new k5(this.zza.f, zzcga0, this.zzb, zzcli0, this.zza.d, this.zza.h, this.zza.g), zzcli0);
        zzcvh zzcvh0 = new zzcvh(this.zzb.zzab);
        zzcvg zzcvg0 = this.zza.a.zza(zzcym0, zzdkd0, zzcvh0);
        zzcvg0.zzj().zzi(zzcli0, false, (this.zza.h ? this.zza.g : null));
        zzcga0.zzd(zzcvg0);
        zzcvg0.zzc().zzj(new zzefm(zzcli0), zzcfv.zzf);
        zzcvg0.zzj();
        return zzfvc.zzm(zzdto.zzj(zzcli0, this.zzb.zzt.zzb, this.zzb.zzt.zza), new zzefn(this.zza, zzcli0, this.zzb, zzcvg0), this.zza.e);
    }
}

