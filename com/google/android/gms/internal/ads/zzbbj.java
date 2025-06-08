package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbbj implements ValueCallback {
    public final A1 zza;
    public final zzbbc zzb;
    public final WebView zzc;
    public final boolean zzd;

    public zzbbj(A1 a10, zzbbc zzbbc0, WebView webView0, boolean z) {
        this.zza = a10;
        this.zzb = zzbbc0;
        this.zzc = webView0;
        this.zzd = z;
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        zzbbc zzbbc0 = this.zzb;
        WebView webView0 = this.zzc;
        boolean z = this.zzd;
        String s = (String)object0;
        zzbbm zzbbm0 = this.zza.k;
        zzbbm0.getClass();
        zzbbc0.zzg();
        try {
            if(!TextUtils.isEmpty(s)) {
                String s1 = new JSONObject(s).optString("text");
                if(zzbbm0.v || TextUtils.isEmpty(webView0.getTitle())) {
                    zzbbc0.zzl(s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
                else {
                    zzbbc0.zzl(webView0.getTitle() + "\n" + s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
            }
            if(zzbbc0.zzo()) {
                zzbbm0.l.zzc(zzbbc0);
                return;
            }
            return;
        }
        catch(JSONException unused_ex) {
        }
        catch(Throwable throwable0) {
            zzcfi.zzf("Failed to get webview content.", throwable0);
            zzt.zzo().zzt(throwable0, "ContentFetchTask.processWebViewContent");
            return;
        }
        zzcfi.zze("Json string may be malformed.");
    }
}

