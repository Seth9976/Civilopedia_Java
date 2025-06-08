package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdqm {
    public final Executor a;
    public final zzdqh b;

    public zzdqm(Executor executor0, zzdqh zzdqh0) {
        this.a = executor0;
        this.b = zzdqh0;
    }

    public final zzfvl zza(JSONObject jSONObject0, String s) {
        zzfvl zzfvl0;
        Executor executor0;
        JSONArray jSONArray0 = jSONObject0.optJSONArray("custom_assets");
        if(jSONArray0 == null) {
            return zzfvc.zzi(Collections.emptyList());
        }
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; true; ++v1) {
            executor0 = this.a;
            if(v1 >= v) {
                break;
            }
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
            if(jSONObject1 == null) {
                zzfvl0 = zzfvc.zzi(null);
            }
            else {
                String s1 = jSONObject1.optString("name");
                if(s1 == null) {
                    zzfvl0 = zzfvc.zzi(null);
                }
                else {
                    String s2 = jSONObject1.optString("type");
                    if("string".equals(s2)) {
                        zzfvl0 = zzfvc.zzi(new zzdql(s1, jSONObject1.optString("string_value")));
                    }
                    else {
                        zzfvl0 = "image".equals(s2) ? zzfvc.zzm(this.b.zze(jSONObject1, "image_value"), new zzdqj(s1), executor0) : zzfvc.zzi(null);
                    }
                }
            }
            arrayList0.add(zzfvl0);
        }
        return zzfvc.zzm(zzfvc.zze(arrayList0), zzdqk.zza, executor0);
    }
}

