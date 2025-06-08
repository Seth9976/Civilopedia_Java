package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevv implements zzetf {
    public final String a;

    public zzevv(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = this.a;
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            if(!TextUtils.isEmpty(s)) {
                zzbu.zzf(jSONObject0, "pii").put("adsid", s);
            }
        }
        catch(JSONException jSONException0) {
            zzcfi.zzk("Failed putting trustless token.", jSONException0);
        }
    }
}

