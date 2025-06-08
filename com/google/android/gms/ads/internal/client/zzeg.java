package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeg {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzeg(String s, Bundle bundle0, String s1) {
        this.a = s;
        this.b = bundle0;
        this.c = s1;
    }

    public final Bundle zza() {
        return this.b;
    }

    public final String zzb() {
        return this.a;
    }

    public final String zzd() {
        String s = this.c;
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            return new JSONObject(s).optString("request_id", "");
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }
}

