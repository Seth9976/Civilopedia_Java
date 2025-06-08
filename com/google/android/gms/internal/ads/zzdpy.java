package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

public final class zzdpy implements zzfok {
    public final zzdqh zza;
    public final JSONObject zzb;

    public zzdpy(zzdqh zzdqh0, JSONObject jSONObject0) {
        this.zza = zzdqh0;
        this.zzb = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzdqh zzdqh0 = this.zza;
        JSONObject jSONObject0 = this.zzb;
        zzdqh0.getClass();
        Integer integer0 = null;
        if(((List)object0) != null && !((List)object0).isEmpty()) {
            String s = jSONObject0.optString("text");
            Integer integer1 = zzdqh.d("bg_color", jSONObject0);
            Integer integer2 = zzdqh.d("text_color", jSONObject0);
            int v = jSONObject0.optInt("text_size", -1);
            boolean z = jSONObject0.optBoolean("allow_pub_rendering");
            int v1 = jSONObject0.optInt("animation_ms", 1000);
            int v2 = jSONObject0.optInt("presentation_ms", 4000);
            if(v > 0) {
                integer0 = v;
            }
            return new zzbkk(s, ((List)object0), integer1, integer2, integer0, v2 + v1, zzdqh0.h.zze, z);
        }
        return null;
    }
}

