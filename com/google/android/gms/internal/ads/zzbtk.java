package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbtk implements zzfuj {
    public final zzbtm zza;
    public final Object zzb;

    public zzbtk(zzbtm zzbtm0, Object object0) {
        this.zza = zzbtm0;
        this.zzb = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        this.zza.getClass();
        zzfvl zzfvl0 = new zzcga();
        R1 r10 = new R1(((zzcga)zzfvl0), 1);
        zzbol.zzo.zzc("a956116f-2512-4f8f-8313-0e688a6ea755", r10);
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("id", "a956116f-2512-4f8f-8313-0e688a6ea755");
        jSONObject0.put("args", ((JSONObject)this.zzb));
        ((zzbsn)object0).zzl("google.afma.activeView.handleUpdate", jSONObject0);
        return zzfvl0;
    }
}

