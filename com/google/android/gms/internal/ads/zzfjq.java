package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public final class zzfjq extends zzfjp {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfjq(WebView webView0) {
        if(!webView0.getSettings().getJavaScriptEnabled()) {
            webView0.getSettings().setJavaScriptEnabled(true);
        }
        this.a = new zzfkn(webView0);
    }
}

