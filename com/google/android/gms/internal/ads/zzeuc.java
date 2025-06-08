package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuc implements zzetf {
    public final String a;

    public zzeuc(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("ms", this.a);
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed putting Ad ID.", jSONException0);
        }
    }
}

