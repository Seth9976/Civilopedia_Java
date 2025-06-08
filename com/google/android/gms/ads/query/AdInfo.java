package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
@Deprecated
public class AdInfo {
    public final QueryInfo a;
    public final String b;

    @KeepForSdk
    public AdInfo(QueryInfo queryInfo0, String s) {
        this.a = queryInfo0;
        this.b = s;
    }

    @KeepForSdk
    public String getAdString() {
        return this.b;
    }

    @KeepForSdk
    public QueryInfo getQueryInfo() {
        return this.a;
    }

    @KeepForSdk
    public static String getRequestId(String s) {
        if(s == null) {
            zzcfi.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(s).optString("request_id", "");
        }
        catch(JSONException unused_ex) {
            zzcfi.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }
}

