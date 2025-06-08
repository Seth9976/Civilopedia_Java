package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

public final class zzfji {
    public static final zzfji a;

    static {
        zzfji.a = new zzfji();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(WebView webView0, String s, Object[] arr_object) {
        if(webView0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(0x80);
            stringBuilder0.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            stringBuilder0.append(s);
            stringBuilder0.append("(");
            if(arr_object.length > 0) {
                for(int v = 0; v < arr_object.length; ++v) {
                    Object object0 = arr_object[v];
                    if(object0 == null) {
                        stringBuilder0.append("\"\"");
                    }
                    else if(object0 instanceof String) {
                        String s1 = object0.toString();
                        if(s1.startsWith("{")) {
                            stringBuilder0.append(s1);
                        }
                        else {
                            stringBuilder0.append('\"');
                            stringBuilder0.append(s1);
                            stringBuilder0.append('\"');
                        }
                    }
                    else {
                        stringBuilder0.append(object0);
                    }
                    stringBuilder0.append(",");
                }
                stringBuilder0.setLength(stringBuilder0.length() - 1);
            }
            stringBuilder0.append(")}");
            String s2 = stringBuilder0.toString();
            Handler handler0 = webView0.getHandler();
            if(handler0 != null && Looper.myLooper() != handler0.getLooper()) {
                handler0.post(new m0(webView0, s2, 9, false));
                return;
            }
            webView0.loadUrl(s2);
            return;
        }
        if(zzfik.zza.booleanValue() && !TextUtils.isEmpty(("The WebView is null for " + s))) {
            Log.i("OMIDLIB", "The WebView is null for " + s);
        }
    }

    public static zzfji zza() {
        return zzfji.a;
    }

    public final void zzc(WebView webView0) {
        zzfji.a(webView0, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView0, JSONObject jSONObject0) {
        zzfji.a(webView0, "init", new Object[]{jSONObject0});
    }

    public final void zze(WebView webView0, float f) {
        zzfji.a(webView0, "setDeviceVolume", new Object[]{f});
    }

    public final void zzf(WebView webView0, String s) {
        zzfji.a(webView0, "setNativeViewHierarchy", new Object[]{s});
    }

    public final void zzg(WebView webView0, String s, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2) {
        zzfji.a(webView0, "startSession", new Object[]{s, jSONObject0, jSONObject1, jSONObject2});
    }
}

