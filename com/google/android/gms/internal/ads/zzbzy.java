package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzbzy {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final JSONObject h;
    public final String i;

    public zzbzy(JSONObject jSONObject0) {
        this.f = jSONObject0.optString("url");
        this.b = jSONObject0.optString("base_uri");
        this.c = jSONObject0.optString("post_parameters");
        String s = jSONObject0.optString("drt_include");
        int v = 1;
        this.d = s != null && (s.equals("1") || s.equals("true"));
        String s1 = jSONObject0.optString("cookies_include", "true");
        this.e = s1 != null && (s1.equals("1") || s1.equals("true"));
        jSONObject0.optString("request_id");
        jSONObject0.optString("type");
        String s2 = jSONObject0.optString("errors");
        this.a = s2 == null ? null : Arrays.asList(s2.split(","));
        if(jSONObject0.optInt("valid", 0) == 1) {
            v = -2;
        }
        this.g = v;
        jSONObject0.optString("fetched_ad");
        jSONObject0.optBoolean("render_test_ad_label");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("preprocessor_flags");
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        this.h = jSONObject1;
        jSONObject0.optString("analytics_query_ad_event_id");
        jSONObject0.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject0.optString("pool_key");
    }

    public final int zza() {
        return this.g;
    }

    public final String zzb() {
        return this.b;
    }

    public final String zzc() {
        return this.i;
    }

    public final String zzd() {
        return this.c;
    }

    public final String zze() {
        return this.f;
    }

    public final List zzf() {
        return this.a;
    }

    public final JSONObject zzg() {
        return this.h;
    }

    public final boolean zzh() {
        return this.e;
    }

    public final boolean zzi() {
        return this.d;
    }
}

