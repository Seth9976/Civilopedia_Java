package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevf implements zzetf {
    public final List a;

    public zzevf(List list0) {
        this.a = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("eid", TextUtils.join(",", this.a));
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}

