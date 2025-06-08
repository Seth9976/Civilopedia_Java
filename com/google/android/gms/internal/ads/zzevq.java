package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzevq implements zzetf {
    public static final zzevq zza;

    static {
        zzevq.zza = new zzevq();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.getJSONObject("sdk_env").put("container_version", 12451000);
        }
        catch(JSONException unused_ex) {
        }
    }
}

