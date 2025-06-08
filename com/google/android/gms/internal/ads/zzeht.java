package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzeht implements zzfuj {
    public final zzehx zza;
    public final zzdse zzb;

    public zzeht(zzehx zzehx0, zzdse zzdse0) {
        this.zza = zzehx0;
        this.zzb = zzdse0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfvl zzfvl0 = zzfvc.zzi(this.zzb);
        this.zza.d.zzb(zzfvl0);
        if(!((JSONObject)object0).optBoolean("success")) {
            throw new zzbsp("process json failed");
        }
        return zzfvc.zzi(((JSONObject)object0).getJSONObject("json").getJSONArray("ads"));
    }
}

