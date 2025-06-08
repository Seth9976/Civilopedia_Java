package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.File;
import java.util.Collections;
import java.util.Map;

public class zzcml extends zzclp {
    public zzcml(zzcli zzcli0, zzbdm zzbdm0, boolean z) {
        super(zzcli0, zzbdm0, z);
    }

    public final WebResourceResponse g(WebView webView0, String s, Map map0) {
        String s1;
        if(!(webView0 instanceof zzcli)) {
            zzcfi.zzj("Tried to intercept request from a WebView that wasn\'t an AdWebView.");
            return null;
        }
        zzccj zzccj0 = this.C;
        if(zzccj0 != null) {
            zzccj0.zzd(s, map0, 1);
        }
        if(!"mraid.js".equalsIgnoreCase(new File(s).getName())) {
            if(map0 == null) {
                map0 = Collections.emptyMap();
            }
            return this.f(s, map0);
        }
        if(((zzcli)webView0).zzP() != null) {
            ((zzcli)webView0).zzP().zzD();
        }
        if(((zzcli)webView0).zzQ().zzi()) {
            s1 = (String)zzay.zzc().zzb(zzbhz.zzM);
            return zzs.zzu(((zzcli)webView0).getContext(), ((zzcli)webView0).zzp().zza, s1);
        }
        if(((zzcli)webView0).zzaC()) {
            s1 = (String)zzay.zzc().zzb(zzbhz.zzL);
            return zzs.zzu(((zzcli)webView0).getContext(), ((zzcli)webView0).zzp().zza, s1);
        }
        s1 = (String)zzay.zzc().zzb(zzbhz.zzK);
        return zzs.zzu(((zzcli)webView0).getContext(), ((zzcli)webView0).zzp().zza, s1);
    }
}

