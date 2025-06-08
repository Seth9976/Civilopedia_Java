package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzdrq implements zzfuj {
    public final zzdse zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzdrq(zzdse zzdse0, String s, JSONObject jSONObject0) {
        this.zza = zzdse0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        return this.zza.i.zzb(((zzcli)object0), this.zzb, this.zzc);
    }
}

