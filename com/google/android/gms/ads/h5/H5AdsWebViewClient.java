package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpq;

public final class H5AdsWebViewClient extends zzbpd {
    public final zzbpq a;

    public H5AdsWebViewClient(Context context0, WebView webView0) {
        this.a = new zzbpq(context0, webView0);
    }

    public void clearAdObjects() {
        this.a.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpd
    public final WebViewClient getDelegate() {
        return this.a;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.a.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient0) {
        this.a.zzb(webViewClient0);
    }
}

