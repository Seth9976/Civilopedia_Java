package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfjt {
    public static WindowManager a;
    public static final String[] b;
    public static float c;

    static {
        zzfjt.b = new String[]{"x", "y", "width", "height"};
        zzfjt.c = Resources.getSystem().getDisplayMetrics().density;
    }

    public static JSONObject zza(int v, int v1, int v2, int v3) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("x", ((double)(((float)v) / zzfjt.c)));
            jSONObject0.put("y", ((double)(((float)v1) / zzfjt.c)));
            jSONObject0.put("width", ((double)(((float)v2) / zzfjt.c)));
            jSONObject0.put("height", ((double)(((float)v3) / zzfjt.c)));
        }
        catch(JSONException jSONException0) {
            zzfju.zza("Error with creating viewStateObject", jSONException0);
        }
        return jSONObject0;
    }

    public static void zzb(JSONObject jSONObject0, String s) {
        try {
            jSONObject0.put("adSessionId", s);
        }
        catch(JSONException jSONException0) {
            zzfju.zza("Error with setting ad session id", jSONException0);
        }
    }

    public static void zzc(JSONObject jSONObject0, JSONObject jSONObject1) {
        try {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("childViews");
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
                jSONObject0.put("childViews", jSONArray0);
            }
            jSONArray0.put(jSONObject1);
            return;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
    }

    public static void zzd(JSONObject jSONObject0, zzfjx zzfjx0) {
        zzfjf zzfjf0 = zzfjx0.zza();
        JSONArray jSONArray0 = new JSONArray();
        ArrayList arrayList0 = zzfjx0.zzb();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jSONArray0.put(((String)arrayList0.get(v1)));
        }
        try {
            jSONObject0.put("isFriendlyObstructionFor", jSONArray0);
            jSONObject0.put("friendlyObstructionClass", zzfjf0.zzd());
            jSONObject0.put("friendlyObstructionPurpose", zzfjf0.zza());
            jSONObject0.put("friendlyObstructionReason", zzfjf0.zzc());
        }
        catch(JSONException jSONException0) {
            zzfju.zza("Error with setting friendly obstruction", jSONException0);
        }
    }

    public static void zze(JSONObject jSONObject0, String s) {
        try {
            jSONObject0.put("notVisibleReason", s);
        }
        catch(JSONException jSONException0) {
            zzfju.zza("Error with setting not visible reason", jSONException0);
        }
    }

    public static void zzf(Context context0) {
        if(context0 != null) {
            zzfjt.c = context0.getResources().getDisplayMetrics().density;
            zzfjt.a = (WindowManager)context0.getSystemService("window");
        }
    }

    public static void zzg(JSONObject jSONObject0, String s, Object object0) {
        try {
            jSONObject0.put(s, object0);
        }
        catch(JSONException jSONException0) {
            zzfju.zza(("JSONException during JSONObject.put for name [" + s + "]"), jSONException0);
        }
    }

    public static void zzh(JSONObject jSONObject0) {
        float f2;
        float f1;
        if(zzfjt.a == null) {
            f1 = 0.0f;
            f2 = 0.0f;
        }
        else {
            Point point0 = new Point(0, 0);
            zzfjt.a.getDefaultDisplay().getRealSize(point0);
            float f = zzfjt.c;
            f1 = ((float)point0.x) / f;
            f2 = ((float)point0.y) / f;
        }
        try {
            jSONObject0.put("width", ((double)f1));
            jSONObject0.put("height", ((double)f2));
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    public static boolean zzi(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 == null && jSONObject1 == null) {
            return true;
        }
        if(jSONObject0 != null && jSONObject1 != null) {
            String[] arr_s = zzfjt.b;
            for(int v = 0; v < 4; ++v) {
                String s = arr_s[v];
                if(jSONObject0.optDouble(s) != jSONObject1.optDouble(s)) {
                    return false;
                }
            }
            if(jSONObject0.optString("adSessionId", "").equals(jSONObject1.optString("adSessionId", ""))) {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArray1 = jSONObject1.optJSONArray("isFriendlyObstructionFor");
                if(jSONArray0 == null && jSONArray1 == null) {
                label_20:
                    JSONArray jSONArray2 = jSONObject0.optJSONArray("childViews");
                    JSONArray jSONArray3 = jSONObject1.optJSONArray("childViews");
                    if(jSONArray2 == null && jSONArray3 == null) {
                        return true;
                    }
                    if(jSONArray2 == null && jSONArray3 == null || jSONArray2 != null && jSONArray3 != null && jSONArray2.length() == jSONArray3.length()) {
                        for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                            if(!zzfjt.zzi(jSONArray2.optJSONObject(v2), jSONArray3.optJSONObject(v2))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                else if(jSONArray0 == null && jSONArray1 == null || jSONArray0 != null && jSONArray1 != null && jSONArray0.length() == jSONArray1.length()) {
                    int v1 = 0;
                    while(true) {
                        if(v1 >= jSONArray0.length()) {
                            goto label_20;
                        }
                        if(!jSONArray0.optString(v1, "").equals(jSONArray1.optString(v1, ""))) {
                            break;
                        }
                        ++v1;
                    }
                }
            }
        }
        return false;
    }
}

