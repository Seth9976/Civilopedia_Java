package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzehs implements Callable {
    public final zzehx zza;
    public final zzfvl zzb;
    public final zzfvl zzc;
    public final zzfbx zzd;
    public final zzfbl zze;
    public final JSONObject zzf;

    public zzehs(zzehx zzehx0, zzfvl zzfvl0, zzfvl zzfvl1, zzfbx zzfbx0, zzfbl zzfbl0, JSONObject jSONObject0) {
        this.zza = zzehx0;
        this.zzb = zzfvl0;
        this.zzc = zzfvl1;
        this.zzd = zzfbx0;
        this.zze = zzfbl0;
        this.zzf = jSONObject0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        zzdnh zzdnh0 = (zzdnh)this.zzb.get();
        zzdse zzdse0 = (zzdse)this.zzc.get();
        zzcym zzcym0 = new zzcym(this.zzd, this.zze, null);
        zzdnt zzdnt0 = new zzdnt(zzdnh0);
        zzdmj zzdmj0 = new zzdmj(this.zzf, zzdse0);
        zzdni zzdni0 = this.zza.a.zzd(zzcym0, zzdnt0, zzdmj0);
        zzdni0.zzj().zzb();
        zzdni0.zzk().zza(zzdse0);
        zzdni0.zzg().zza(zzdnh0.zzr());
        zzdni0.zzl().zza(this.zza.e);
        return zzdni0.zza();
    }
}

