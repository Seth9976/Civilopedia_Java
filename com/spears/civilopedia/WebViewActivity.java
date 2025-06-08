package com.spears.civilopedia;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import f2.M;
import f2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spears/civilopedia/WebViewActivity;", "Lf2/j;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class WebViewActivity extends j {
    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTitle(0x7F0E001B);  // string:PRIVACY_POLICY "Privacy Policy"
        this.setContentView(0x7F0A0028);  // layout:activity_web_view
        View view0 = this.findViewById(0x7F070127);  // id:webview
        J2.j.e(view0, "findViewById(...)");
        ((WebView)view0).setWebViewClient(new M());  // 初始化器: Landroid/webkit/WebViewClient;-><init>()V
        ((WebView)view0).getSettings().setJavaScriptEnabled(true);
        String s = this.getIntent().getStringExtra("url");
        if(s != null) {
            ((WebView)view0).loadUrl(s);
        }
    }
}

