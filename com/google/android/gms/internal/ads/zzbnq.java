package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbnq implements zzbom {
    public static final zzbnq zza;

    static {
        zzbnq.zza = new zzbnq();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        Intent intent0;
        JSONObject jSONObject2;
        JSONArray jSONArray0;
        JSONObject jSONObject0;
        PackageManager packageManager0 = ((zzcmj)object0).getContext().getPackageManager();
        String s = (String)map0.get("data");
        try {
            jSONObject0 = new JSONObject(s);
        }
        catch(JSONException unused_ex) {
            ((zzbrd)(((zzcmj)object0))).zze("openableIntents", new JSONObject());
            return;
        }
        try {
            jSONArray0 = jSONObject0.getJSONArray("intents");
        }
        catch(JSONException unused_ex) {
            ((zzbrd)(((zzcmj)object0))).zze("openableIntents", new JSONObject());
            return;
        }
        JSONObject jSONObject1 = new JSONObject();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                jSONObject2 = jSONArray0.getJSONObject(v);
            }
            catch(JSONException jSONException0) {
                zzcfi.zzh("Error parsing the intent data.", jSONException0);
                continue;
            }
            String s1 = jSONObject2.optString("id");
            String s2 = jSONObject2.optString("u");
            String s3 = jSONObject2.optString("i");
            String s4 = jSONObject2.optString("m");
            String s5 = jSONObject2.optString("p");
            String s6 = jSONObject2.optString("c");
            String s7 = jSONObject2.optString("intent_url");
            ResolveInfo resolveInfo0 = null;
            if(TextUtils.isEmpty(s7)) {
                intent0 = null;
            }
            else {
                try {
                    intent0 = Intent.parseUri(s7, 0);
                }
                catch(URISyntaxException uRISyntaxException0) {
                    zzcfi.zzh(("Error parsing the url: " + s7), uRISyntaxException0);
                    intent0 = null;
                }
            }
            if(intent0 == null) {
                intent0 = new Intent();
                if(!TextUtils.isEmpty(s2)) {
                    intent0.setData(Uri.parse(s2));
                }
                if(!TextUtils.isEmpty(s3)) {
                    intent0.setAction(s3);
                }
                if(!TextUtils.isEmpty(s4)) {
                    intent0.setType(s4);
                }
                if(!TextUtils.isEmpty(s5)) {
                    intent0.setPackage(s5);
                }
                if(!TextUtils.isEmpty(s6)) {
                    String[] arr_s = s6.split("/", 2);
                    if(arr_s.length == 2) {
                        intent0.setComponent(new ComponentName(arr_s[0], arr_s[1]));
                    }
                }
            }
            try {
                resolveInfo0 = packageManager0.resolveActivity(intent0, 0x10000);
            }
            catch(NullPointerException nullPointerException0) {
                zzt.zzo().zzt(nullPointerException0, intent0.toString());
            }
            try {
                jSONObject1.put(s1, resolveInfo0 != null);
            }
            catch(JSONException jSONException1) {
                zzcfi.zzh("Error constructing openable urls response.", jSONException1);
            }
        }
        ((zzbrd)(((zzcmj)object0))).zze("openableIntents", jSONObject1);
    }
}

