package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfcg {
    public final JSONObject a;

    public zzfcg(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }

    public final String zza() {
        return this.zzb() - 1 == 1 ? null : "javascript";
    }

    public final int zzb() {
        switch(this.a.optInt("media_type", -1)) {
            case 0: {
                return 2;
            }
            case 1: {
                return 1;
            }
            default: {
                return 3;
            }
        }
    }
}

