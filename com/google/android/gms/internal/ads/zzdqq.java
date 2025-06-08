package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzdqq implements zzfuj {
    public final zzdqz zza;
    public final JSONObject zzb;

    public zzdqq(zzdqz zzdqz0, JSONObject jSONObject0) {
        this.zza = zzdqz0;
        this.zzb = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzdqz zzdqz0 = this.zza;
        JSONObject jSONObject0 = this.zzb;
        zzdqz0.getClass();
        zzfvl zzfvl0 = zzcfz.zza(((zzcli)object0));
        if(zzdqz0.a.zzb == null) {
            ((zzcli)object0).zzai(zzcmx.zze());
        }
        else {
            ((zzcli)object0).zzai(zzcmx.zzd());
        }
        ((zzcli)object0).zzP().zzz(new zzdqo(zzdqz0, ((zzcli)object0), ((zzcfz)zzfvl0)));
        ((zzcli)object0).zzl("google.afma.nativeAds.renderVideo", jSONObject0);
        return zzfvl0;
    }
}

