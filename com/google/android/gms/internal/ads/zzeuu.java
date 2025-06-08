package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuu implements zzetf {
    public final JSONObject a;

    public zzeuu(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("cache_state", this.a);
        }
        catch(JSONException unused_ex) {
            zze.zza("Unable to get cache_state");
        }
    }
}

