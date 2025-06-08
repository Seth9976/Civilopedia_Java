package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import i3.e;

public final class zzclh extends WebChromeClient {
    public final zzcli a;

    public zzclh(zzcli zzcli0) {
        this.a = zzcli0;
    }

    public final boolean a(Context context0, String s, String s1, String s2, String s3, JsResult jsResult0, JsPromptResult jsPromptResult0, boolean z) {
        try {
            zzcli zzcli0 = this.a;
            if(zzcli0 != null && (zzcli0.zzP() != null && zzcli0.zzP().zzd() != null)) {
                zzb zzb0 = zzcli0.zzP().zzd();
                if(zzb0 != null && !zzb0.zzc()) {
                    zzb0.zzb("window." + s + "(\'" + s2 + "\')");
                    return false;
                }
            }
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0);
            alertDialog$Builder0.setTitle(s1);
            if(z) {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                linearLayout0.setOrientation(1);
                TextView textView0 = new TextView(context0);
                textView0.setText(s2);
                EditText editText0 = new EditText(context0);
                editText0.setText(s3);
                linearLayout0.addView(textView0);
                linearLayout0.addView(editText0);
                alertDialog$Builder0.setView(linearLayout0).setPositiveButton(0x104000A, new k3(jsPromptResult0, editText0)).setNegativeButton(0x1040000, new i2(jsPromptResult0, 1)).setOnCancelListener(new i3(jsPromptResult0, 1)).create().show();
                return true;
            }
            alertDialog$Builder0.setMessage(s2).setPositiveButton(0x104000A, new j3(jsResult0, 1)).setNegativeButton(0x1040000, new j3(jsResult0, 0)).setOnCancelListener(new i3(jsResult0, 0)).create().show();
            return true;
        }
        catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
        }
        zzcfi.zzk("Fail to display Dialog.", windowManager$BadTokenException0);
        return true;
    }

    public static final Context b(WebView webView0) {
        if(!(webView0 instanceof zzcli)) {
            return webView0.getContext();
        }
        Context context0 = ((zzcli)webView0).zzk();
        return context0 == null ? ((zzcli)webView0).getContext() : context0;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView0) {
        if(!(webView0 instanceof zzcli)) {
            zzcfi.zzj("Tried to close a WebView that wasn\'t an AdWebView.");
            return;
        }
        zzl zzl0 = ((zzcli)webView0).zzN();
        if(zzl0 == null) {
            zzcfi.zzj("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        zzl0.zzb();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        String s = consoleMessage0.message();
        String s1 = consoleMessage0.sourceId();
        int v = consoleMessage0.lineNumber();
        String s2 = e.g(e.j("JS: ", s, " (", s1, ":"), v, ")");
        if(s2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage0);
        }
        switch(l3.a[consoleMessage0.messageLevel().ordinal()]) {
            case 1: {
                zzcfi.zzg(s2);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 2: {
                zzcfi.zzj(s2);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 3: 
            case 4: {
                zzcfi.zzi(s2);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 5: {
                zzcfi.zze(s2);
                return super.onConsoleMessage(consoleMessage0);
            }
            default: {
                zzcfi.zzi(s2);
                return super.onConsoleMessage(consoleMessage0);
            }
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        WebView.WebViewTransport webView$WebViewTransport0 = (WebView.WebViewTransport)message0.obj;
        WebView webView1 = new WebView(webView0.getContext());
        zzcli zzcli0 = this.a;
        if(zzcli0.zzJ() != null) {
            webView1.setWebViewClient(zzcli0.zzJ());
        }
        webView$WebViewTransport0.setWebView(webView1);
        message0.sendToTarget();
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String s, String s1, long v, long v1, long v2, WebStorage.QuotaUpdater webStorage$QuotaUpdater0) {
        if(0x500000L - v2 <= 0L) {
            webStorage$QuotaUpdater0.updateQuota(v);
            return;
        }
        if(v != 0L) {
            if(v1 == 0L) {
                v1 = Math.min(Math.min(0x20000L, 0x500000L - v2) + v, 0x100000L);
            }
            else {
                if(v1 <= Math.min(0x100000L - v, 0x500000L - v2)) {
                    v += v1;
                }
                v1 = v;
            }
        }
        else if(v1 > 0x500000L - v2 || v1 > 0x100000L) {
            v1 = 0L;
        }
        webStorage$QuotaUpdater0.updateQuota(v1);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissions.Callback geolocationPermissions$Callback0) {
        if(geolocationPermissions$Callback0 != null) {
            geolocationPermissions$Callback0.invoke(s, zzs.zzx(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION") || zzs.zzx(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzl zzl0 = this.a.zzN();
        if(zzl0 == null) {
            zzcfi.zzj("Could not get ad overlay when hiding custom view.");
            return;
        }
        zzl0.zzf();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.a(zzclh.b(webView0), "alert", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.a(zzclh.b(webView0), "onBeforeUnload", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.a(zzclh.b(webView0), "confirm", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView0, String s, String s1, String s2, JsPromptResult jsPromptResult0) {
        return this.a(zzclh.b(webView0), "prompt", s, s1, s2, null, jsPromptResult0, true);
    }

    @Override  // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view0, int v, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        zzl zzl0 = this.a.zzN();
        if(zzl0 == null) {
            zzcfi.zzj("Could not get ad overlay when showing custom view.");
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            return;
        }
        zzl0.zzA(view0, webChromeClient$CustomViewCallback0);
        zzl0.zzy(v);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        this.onShowCustomView(view0, -1, webChromeClient$CustomViewCallback0);
    }
}

