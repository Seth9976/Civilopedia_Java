package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuk implements zzetf {
    public final String a;
    public final int b;

    public zzeuk(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        String s = this.a;
        if(!TextUtils.isEmpty(s)) {
            int v = this.b;
            if(v != -1) {
                try {
                    JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
                    jSONObject1.put("pvid", s);
                    jSONObject1.put("pvid_s", v);
                }
                catch(JSONException jSONException0) {
                    zze.zzb("Failed putting gms core app set ID info.", jSONException0);
                }
            }
        }
    }
}

