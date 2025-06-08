package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
public final class zzcmm extends zzcml {
    public zzcmm(zzcli zzcli0, zzbdm zzbdm0, boolean z) {
        super(zzcli0, zzbdm0, z);
    }

    @Override  // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        return webResourceRequest0 == null || webResourceRequest0.getUrl() == null ? null : this.g(webView0, webResourceRequest0.getUrl().toString(), webResourceRequest0.getRequestHeaders());
    }
}

