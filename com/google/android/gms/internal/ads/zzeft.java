package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzeft implements zzfuj {
    public final zzefw zza;
    public final zzfbx zzb;
    public final zzfbl zzc;

    public zzeft(zzefw zzefw0, zzfbx zzfbx0, zzfbl zzfbl0) {
        this.zza = zzefw0;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        this.zza.getClass();
        zzq zzq0 = zzfch.zza(this.zza.b, this.zzc.zzv);
        zzcli zzcli0 = this.zza.c.zza(zzq0, this.zzc, this.zzb.zzb.zzb);
        zzcym zzcym0 = new zzcym(this.zzb, this.zzc, null);
        zzcur zzcur0 = new zzcur(((View)zzcli0), zzcli0, zzfch.zzc(zzq0), this.zzc.zzab, this.zzc.zzaf, this.zzc.zzP);
        zzcuq zzcuq0 = this.zza.a.zza(zzcym0, zzcur0);
        zzcuq0.zzg().zzi(zzcli0, false, null);
        zzcuq0.zzc().zzj(new zzefu(zzcli0), zzcfv.zzf);
        zzcuq0.zzg();
        return zzfvc.zzm(zzdto.zzj(zzcli0, this.zzc.zzt.zzb, this.zzc.zzt.zza), new zzefv(zzcuq0), zzcfv.zzf);
    }
}

