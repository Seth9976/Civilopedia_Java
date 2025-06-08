package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevb implements zzetf {
    public final String a;
    public final String b;

    public zzevb(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
            jSONObject1.put("doritos", this.a);
            jSONObject1.put("doritos_v2", this.b);
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting doritos string.");
        }
    }
}

