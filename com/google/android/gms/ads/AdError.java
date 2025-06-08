package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    public final int a;
    public final String b;
    public final String c;
    public final AdError d;

    public AdError(int v, String s, String s1) {
        this(v, s, s1, null);
    }

    public AdError(int v, String s, String s1, AdError adError0) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = adError0;
    }

    public AdError getCause() {
        return this.d;
    }

    public int getCode() {
        return this.a;
    }

    public String getDomain() {
        return this.c;
    }

    public String getMessage() {
        return this.b;
    }

    @Override
    public String toString() {
        try {
            return this.zzb().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    public final zze zza() {
        AdError adError0 = this.d;
        if(adError0 == null) {
            return new zze(this.a, this.b, this.c, null, null);
        }
        zze zze0 = new zze(adError0.a, adError0.b, adError0.c, null, null);
        return new zze(this.a, this.b, this.c, zze0, null);
    }

    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("Code", this.a);
        jSONObject0.put("Message", this.b);
        jSONObject0.put("Domain", this.c);
        AdError adError0 = this.d;
        if(adError0 == null) {
            jSONObject0.put("Cause", "null");
            return jSONObject0;
        }
        jSONObject0.put("Cause", adError0.zzb());
        return jSONObject0;
    }
}

