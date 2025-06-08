package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuw implements zzetf {
    public final F5 zza;

    public zzeuw(F5 f50) {
        this.zza = f50;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        this.zza.getClass();
        try {
            jSONObject0.put("gms_sdk_env", this.zza.a);
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting version constants.");
        }
    }
}

