package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class zzept implements zzetf {
    public final JSONObject a;
    public final JSONObject b;

    public zzept(@Nullable JSONObject jSONObject0, @Nullable JSONObject jSONObject1) {
        this.a = jSONObject0;
        this.b = jSONObject1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = this.a;
        if(jSONObject0 != null) {
            ((Bundle)object0).putString("fwd_cld", jSONObject0.toString());
        }
        JSONObject jSONObject1 = this.b;
        if(jSONObject1 != null) {
            ((Bundle)object0).putString("fwd_common_cld", jSONObject1.toString());
        }
    }
}

