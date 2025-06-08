package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbyb {
    public final boolean zza;
    public final String zzb;

    public zzbyb(boolean z, String s) {
        this.zza = z;
        this.zzb = s;
    }

    public static zzbyb zza(JSONObject jSONObject0) {
        return new zzbyb(jSONObject0.optBoolean("enable_prewarming", false), jSONObject0.optString("prefetch_url", ""));
    }
}

