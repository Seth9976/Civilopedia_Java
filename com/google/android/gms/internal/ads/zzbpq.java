package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;

public final class zzbpq extends zzbpd {
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;
    public static final int zza;

    public zzbpq(Context context0, WebView webView0) {
        context0.getClass();
        webView0.getClass();
        zzfou.zzf(webView0.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.c = webView0;
        this.b = new H5AdsRequestHandler(context0, new zzbpp(webView0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbpd
    public final WebViewClient getDelegate() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpd
    public final void onLoadResource(WebView webView0, String s) {
        if(this.c.equals(webView0)) {
            if(!this.b.handleH5AdsRequest(s)) {
                super.onLoadResource(webView0, s);
            }
            return;
        }
        zzcfi.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpd
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        if(this.c.equals(this.c)) {
            String s = webResourceRequest0.getUrl().toString();
            return this.b.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
        }
        zzcfi.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpd
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(this.c.equals(webView0)) {
            return this.b.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, s);
        }
        zzcfi.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final void zza() {
        this.b.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient0) {
        zzfou.zzf(webViewClient0 != this, "Delegate cannot be itself.");
        this.a = webViewClient0;
    }
}

