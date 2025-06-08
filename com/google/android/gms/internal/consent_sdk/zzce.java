package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;

public final class zzce {
    public static Boolean a;

    @TargetApi(19)
    public static void zza(WebView webView0, String s) {
        synchronized(zzce.class) {
            if(zzce.a == null) {
                try {
                    webView0.evaluateJavascript("(function(){})()", null);
                    zzce.a = Boolean.TRUE;
                }
                catch(IllegalStateException unused_ex) {
                    zzce.a = Boolean.FALSE;
                }
            }
            boolean z = zzce.a.booleanValue();
        }
        if(!z) {
            String s1 = String.valueOf(s);
            webView0.loadUrl((s1.length() == 0 ? new String("javascript:") : "javascript:" + s1));
            return;
        }
        webView0.evaluateJavascript(s, null);
    }
}

