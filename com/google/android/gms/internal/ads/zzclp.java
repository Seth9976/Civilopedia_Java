package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import f0.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@VisibleForTesting
@ParametersAreNonnullByDefault
public class zzclp extends WebViewClient implements zzcmv {
    public zzb A;
    public zzbwp B;
    public zzccj C;
    public zzfii D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final HashSet I;
    public m3 J;
    public final zzcli i;
    public final zzbdm j;
    public final HashMap k;
    public final Object l;
    public zza m;
    public zzo n;
    public zzcmt o;
    public zzcmu p;
    public zzbnm q;
    public zzbno r;
    public zzdjg s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public zzw y;
    public zzbwu z;
    public static final int zzb;

    public zzclp(zzcli zzcli0, zzbdm zzbdm0, boolean z) {
        zzbwu zzbwu0 = new zzbwu(zzcli0, zzcli0.zzG(), new zzbhj(zzcli0.getContext()));
        super();
        this.k = new HashMap();
        this.l = new Object();
        this.j = zzbdm0;
        this.i = zzcli0;
        this.v = z;
        this.z = zzbwu0;
        this.B = null;
        this.I = new HashSet(Arrays.asList(((String)zzay.zzc().zzb(zzbhz.zzeD)).split(",")));
    }

    // 去混淆评级： 低(20)
    public static WebResourceResponse a() {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzaD)).booleanValue() ? new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0])) : null;
    }

    public final WebResourceResponse b(String s, Map map0) {
        WebResourceResponse webResourceResponse2;
        WebResourceResponse webResourceResponse1;
        WebResourceResponse webResourceResponse0;
        String s2;
        URLConnection uRLConnection0;
        zzcli zzcli0 = this.i;
        URL uRL0 = new URL(s);
        try {
            TrafficStats.setThreadStatsTag(0x108);
            int v = 0;
            while(true) {
                ++v;
                if(v > 20) {
                    goto label_51;
                }
                uRLConnection0 = uRL0.openConnection();
                uRLConnection0.setConnectTimeout(10000);
                uRLConnection0.setReadTimeout(10000);
                for(Object object0: map0.entrySet()) {
                    uRLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(!(uRLConnection0 instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                zzt.zzp().zze(zzcli0.getContext(), zzcli0.zzp().zza, false, ((HttpURLConnection)uRLConnection0), false, 60000);
                zzcfh zzcfh0 = new zzcfh(null);
                zzcfh0.zzc(((HttpURLConnection)uRLConnection0), null);
                int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                zzcfh0.zze(((HttpURLConnection)uRLConnection0), v1);
                if(v1 >= 300 && v1 < 400) {
                    String s1 = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
                    if(s1 == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if(!s1.startsWith("tel:")) {
                        URL uRL1 = new URL(uRL0, s1);
                        s2 = uRL1.getProtocol();
                        if(s2 != null) {
                            if(!s2.equals("http") && !s2.equals("https")) {
                                break;
                            }
                            zzcfi.zze(("Redirecting to " + s1));
                            ((HttpURLConnection)uRLConnection0).disconnect();
                            uRL0 = uRL1;
                            continue;
                        }
                        goto label_38;
                    }
                    goto label_42;
                }
                webResourceResponse2 = zzs.zzL(((HttpURLConnection)uRLConnection0));
                goto label_49;
            }
            zzcfi.zzj(("Unsupported scheme: " + s2));
            webResourceResponse0 = zzclp.a();
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse0;
        try {
        label_38:
            zzcfi.zzj("Protocol is null");
            webResourceResponse1 = zzclp.a();
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse1;
    label_42:
        TrafficStats.clearThreadStatsTag();
        return null;
        try {
            webResourceResponse2 = zzs.zzL(((HttpURLConnection)uRLConnection0));
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
    label_49:
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse2;
    label_51:
        TrafficStats.clearThreadStatsTag();
        throw new IOException("Too many redirects (20)");
    }

    public final void c(Map map0, List list0, String s) {
        if(zze.zzc()) {
            zze.zza(("Received GMSG: " + s));
            for(Object object0: map0.keySet()) {
                zze.zza(("  " + ((String)object0) + ": " + ((String)map0.get(((String)object0)))));
            }
        }
        for(Object object1: list0) {
            ((zzbom)object1).zza(this.i, map0);
        }
    }

    // 检测为 lambda 实现。
    public final void d(View view0, zzccj zzccj0, int v) {
        if(zzccj0.zzi() && v > 0) {
            zzccj0.zzg(view0);
            if(zzccj0.zzi()) {
                zzcll zzcll0 = new zzcll(this, view0, zzccj0, v);
                zzs.zza.postDelayed(zzcll0, 100L);
            }
        }
    }

    // 去混淆评级： 低(30)
    public static final boolean e(boolean z, zzcli zzcli0) {
        return z && !zzcli0.zzQ().zzi() && !zzcli0.zzU().equals("interstitial_mb");
    }

    public final WebResourceResponse f(String s, Map map0) {
        try {
            if(((Boolean)zzbjq.zza.zze()).booleanValue() && (this.D != null && "oda".equals(Uri.parse(s).getScheme()))) {
                this.D.zzc(s, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String s1 = zzcdp.zzc(s, this.i.getContext(), this.H);
            if(!s1.equals(s)) {
                return this.b(s1, map0);
            }
            zzbcy zzbcy0 = zzbcy.zza(Uri.parse(s));
            if(zzbcy0 != null) {
                zzbcv zzbcv0 = zzt.zzc().zzb(zzbcy0);
                if(zzbcv0 != null && zzbcv0.zze()) {
                    return new WebResourceResponse("", "", zzbcv0.zzc());
                }
            }
            return !zzcfh.zzl() || !((Boolean)zzbjl.zzb.zze()).booleanValue() ? null : this.b(s, map0);
        }
        catch(Exception | NoClassDefFoundError exception0) {
        }
        zzt.zzo().zzt(exception0, "AdWebViewClient.interceptRequest");
        return zzclp.a();
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zza0 = this.m;
        if(zza0 != null) {
            zza0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        zze.zza(("Loading resource: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzi(uri0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        synchronized(this.l) {
            if(this.i.zzaB()) {
                zze.zza("Blank page loaded, 1...");
                this.i.zzW();
                return;
            }
        }
        this.E = true;
        zzcmu zzcmu0 = this.p;
        if(zzcmu0 != null) {
            zzcmu0.zza();
            this.p = null;
        }
        this.zzg();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.u = true;
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        boolean z = renderProcessGoneDetail0.didCrash();
        int v = renderProcessGoneDetail0.rendererPriorityAtExit();
        return this.i.zzaA(z, v);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.f(s, Collections.emptyMap());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        if(v != 0x4F && v != 0xDE) {
            switch(v) {
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                case 91: {
                    break;
                }
                default: {
                    return v == 0x7E || v == 0x7F || v == 0x80 || v == 0x81 || v == 130;
                }
            }
        }
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        zze.zza(("AdWebView shouldOverrideUrlLoading: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzi(uri0);
            return true;
        }
        zzcli zzcli0 = this.i;
        if(this.t && webView0 == zzcli0.zzI()) {
            String s1 = uri0.getScheme();
            if("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1)) {
                zza zza0 = this.m;
                if(zza0 != null) {
                    zza0.onAdClicked();
                    zzccj zzccj0 = this.C;
                    if(zzccj0 != null) {
                        zzccj0.zzh(s);
                    }
                    this.m = null;
                }
                zzdjg zzdjg0 = this.s;
                if(zzdjg0 != null) {
                    zzdjg0.zzq();
                    this.s = null;
                }
                return super.shouldOverrideUrlLoading(webView0, s);
            }
        }
        if(!zzcli0.zzI().willNotDraw()) {
            try {
                zzaoc zzaoc0 = zzcli0.zzK();
                if(zzaoc0 != null && zzaoc0.zzf(uri0)) {
                    uri0 = zzaoc0.zza(uri0, zzcli0.getContext(), ((View)zzcli0), zzcli0.zzk());
                }
            }
            catch(zzaod unused_ex) {
                zzcfi.zzj(("Unable to append parameter to URL: " + s));
            }
            if(this.A != null && !this.A.zzc()) {
                this.A.zzb(s);
                return true;
            }
            this.zzr(new zzc("android.intent.action.VIEW", uri0.toString(), null, null, null, null, null, null), true);
            return true;
        }
        zzcfi.zzj(("AdWebView unable to handle URL: " + s));
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzA(int v, int v1) {
        zzbwp zzbwp0 = this.B;
        if(zzbwp0 != null) {
            zzbwp0.zzd(v, v1);
        }
    }

    public final void zzB(boolean z) {
        this.t = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzC(boolean z) {
        synchronized(this.l) {
            this.x = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzD() {
        synchronized(this.l) {
            this.t = false;
            this.v = true;
            zzclk zzclk0 = new zzclk(this);
            zzcfv.zze.execute(zzclk0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzE(boolean z) {
        synchronized(this.l) {
            this.w = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzF(zzcmu zzcmu0) {
        this.p = zzcmu0;
    }

    public final void zzG(String s, zzbom zzbom0) {
        synchronized(this.l) {
            List list0 = (List)this.k.get(s);
            if(list0 == null) {
                return;
            }
            list0.remove(zzbom0);
        }
    }

    public final void zzH(String s, Predicate predicate0) {
        synchronized(this.l) {
            List list0 = (List)this.k.get(s);
            if(list0 == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                zzbom zzbom0 = (zzbom)object1;
                if(predicate0.apply(zzbom0)) {
                    arrayList0.add(zzbom0);
                }
            }
            list0.removeAll(arrayList0);
        }
    }

    public final boolean zzI() {
        synchronized(this.l) {
        }
        return this.x;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final boolean zzJ() {
        synchronized(this.l) {
        }
        return this.v;
    }

    public final boolean zzK() {
        synchronized(this.l) {
        }
        return this.w;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzL(zza zza0, zzbnm zzbnm0, zzo zzo0, zzbno zzbno0, zzw zzw0, boolean z, zzbop zzbop0, zzb zzb0, zzbww zzbww0, zzccj zzccj0, zzees zzees0, zzfii zzfii0, zzdwh zzdwh0, zzfgp zzfgp0, zzbon zzbon0, zzdjg zzdjg0) {
        zzcli zzcli0 = this.i;
        zzb zzb1 = zzb0 == null ? new zzb(zzcli0.getContext(), zzccj0, null) : zzb0;
        this.B = new zzbwp(zzcli0, zzbww0);
        this.C = zzccj0;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaL)).booleanValue()) {
            this.zzx("/adMetadata", new zzbnl(zzbnm0));
        }
        if(zzbno0 != null) {
            this.zzx("/appEvent", new zzbnn(zzbno0));
        }
        this.zzx("/backButton", zzbol.zzj);
        this.zzx("/refresh", zzbol.zzk);
        this.zzx("/canOpenApp", zzbol.zzb);
        this.zzx("/canOpenURLs", zzbol.zza);
        this.zzx("/canOpenIntents", zzbol.zzc);
        this.zzx("/close", zzbol.zzd);
        this.zzx("/customClose", zzbol.zze);
        this.zzx("/instrument", zzbol.zzn);
        this.zzx("/delayPageLoaded", zzbol.zzp);
        this.zzx("/delayPageClosed", zzbol.zzq);
        this.zzx("/getLocationInfo", zzbol.zzr);
        this.zzx("/log", zzbol.zzg);
        this.zzx("/mraid", new zzbot(zzb1, this.B, zzbww0));
        zzbwu zzbwu0 = this.z;
        if(zzbwu0 != null) {
            this.zzx("/mraidLoaded", zzbwu0);
        }
        this.zzx("/open", new zzbox(zzb1, this.B, zzees0, zzdwh0, zzfgp0));
        this.zzx("/precache", new zzcjv());
        this.zzx("/touch", zzbol.zzi);
        this.zzx("/video", zzbol.zzl);
        this.zzx("/videoMeta", zzbol.zzm);
        if(zzees0 == null || zzfii0 == null) {
            this.zzx("/click", zzbol.zza(zzdjg0));
            this.zzx("/httpTrack", zzbol.zzf);
        }
        else {
            this.zzx("/click", new zzfck(zzdjg0, zzfii0, zzees0));
            this.zzx("/httpTrack", new zzfcj(zzfii0, zzees0));
        }
        if(zzt.zzn().zzu(zzcli0.getContext())) {
            this.zzx("/logScionEvent", new zzbos(zzcli0.getContext()));
        }
        if(zzbop0 != null) {
            this.zzx("/setInterstitialProperties", new zzboo(zzbop0, null));
        }
        if(zzbon0 != null && ((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            this.zzx("/inspectorNetworkExtras", zzbon0);
        }
        this.m = zza0;
        this.n = zzo0;
        this.q = zzbnm0;
        this.r = zzbno0;
        this.y = zzw0;
        this.A = zzb1;
        this.s = zzdjg0;
        this.t = z;
        this.D = zzfii0;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized(this.l) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized(this.l) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final zzb zzd() {
        return this.A;
    }

    public final void zzg() {
        zzcli zzcli0 = this.i;
        if(this.o != null && (this.E && this.G <= 0 || this.F || this.u)) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzcli0.zzo() != null) {
                zzbig.zza(zzcli0.zzo().zza(), zzcli0.zzn(), new String[]{"awfllc"});
            }
            this.o.zza(!this.F && !this.u);
            this.o = null;
        }
        zzcli0.zzae();
    }

    public final void zzh(boolean z) {
        this.H = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzi(Uri uri0) {
        String s = uri0.getPath();
        Object object0 = this.k.get(s);
        if(s != null && ((List)object0) != null) {
            String s1 = uri0.getEncodedQuery();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzeC)).booleanValue() && this.I.contains(s) && s1 != null && s1.length() >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzeE))))) {
                zze.zza(("Parsing gmsg query params on BG thread: " + s));
                zzfvc.zzr(zzt.zzp().zzb(uri0), new g(this, ((List)object0), s, uri0, 8, false), zzcfv.zze);
                return;
            }
            this.c(zzs.zzK(uri0), ((List)object0), s);
            return;
        }
        zze.zza(("No GMSG handler found for GMSG: " + uri0));
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfJ)).booleanValue() && zzt.zzo().zzf() != null) {
            zzclj zzclj0 = new zzclj((s == null || s.length() < 2 ? "null" : s.substring(1)));
            zzcfv.zza.execute(zzclj0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzj() {
        zzbdm zzbdm0 = this.j;
        if(zzbdm0 != null) {
            zzbdm0.zzc(10005);
        }
        this.F = true;
        this.zzg();
        this.i.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzk() {
        synchronized(this.l) {
        }
        ++this.G;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzl() {
        --this.G;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzo(int v, int v1, boolean z) {
        zzbwu zzbwu0 = this.z;
        if(zzbwu0 != null) {
            zzbwu0.zzb(v, v1);
        }
        zzbwp zzbwp0 = this.B;
        if(zzbwp0 != null) {
            zzbwp0.zzc(v, v1, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzp() {
        zzccj zzccj0 = this.C;
        if(zzccj0 != null) {
            zzcli zzcli0 = this.i;
            WebView webView0 = zzcli0.zzI();
            if(webView0.isAttachedToWindow()) {
                this.d(webView0, zzccj0, 10);
                return;
            }
            m3 m30 = this.J;
            if(m30 != null) {
                ((View)zzcli0).removeOnAttachStateChangeListener(m30);
            }
            m3 m31 = new m3(this, zzccj0);
            this.J = m31;
            ((View)zzcli0).addOnAttachStateChangeListener(m31);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzdjg zzdjg0 = this.s;
        if(zzdjg0 != null) {
            zzdjg0.zzq();
        }
    }

    // 去混淆评级： 低(20)
    public final void zzr(zzc zzc0, boolean z) {
        boolean z1 = this.i.zzaC();
        boolean z2 = zzclp.e(z1, this.i);
        this.zzu(new AdOverlayInfoParcel(zzc0, (z2 ? null : this.m), (z1 ? null : this.n), this.y, this.i.zzp(), this.i, (z2 || !z ? null : this.s)));
    }

    public final void zzs(zzbr zzbr0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0, String s, String s1, int v) {
        zzcfo zzcfo0 = this.i.zzp();
        this.zzu(new AdOverlayInfoParcel(this.i, zzcfo0, zzbr0, zzees0, zzdwh0, zzfgp0, s, s1, 14));
    }

    // 去混淆评级： 低(20)
    public final void zzt(boolean z, int v, boolean z1) {
        boolean z2 = zzclp.e(this.i.zzaC(), this.i);
        this.zzu(new AdOverlayInfoParcel((z2 ? null : this.m), this.n, this.y, this.i, z, v, this.i.zzp(), (z2 || !z1 ? null : this.s)));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel0) {
        boolean z = this.B == null ? false : this.B.zze();
        zzm.zza(this.i.getContext(), adOverlayInfoParcel0, !z);
        zzccj zzccj0 = this.C;
        if(zzccj0 != null) {
            String s = adOverlayInfoParcel0.zzl;
            if(s == null) {
                zzc zzc0 = adOverlayInfoParcel0.zza;
                if(zzc0 != null) {
                    s = zzc0.zzb;
                }
            }
            zzccj0.zzh(s);
        }
    }

    // 去混淆评级： 低(20)
    public final void zzv(boolean z, int v, String s, boolean z1) {
        boolean z2 = this.i.zzaC();
        boolean z3 = zzclp.e(z2, this.i);
        this.zzu(new AdOverlayInfoParcel((z3 ? null : this.m), (z2 ? null : new n3(this.i, this.n)), this.q, this.r, this.y, this.i, z, v, s, this.i.zzp(), (z3 || !z1 ? null : this.s)));
    }

    // 去混淆评级： 低(20)
    public final void zzw(boolean z, int v, String s, String s1, boolean z1) {
        boolean z2 = this.i.zzaC();
        boolean z3 = zzclp.e(z2, this.i);
        this.zzu(new AdOverlayInfoParcel((z3 ? null : this.m), (z2 ? null : new n3(this.i, this.n)), this.q, this.r, this.y, this.i, z, v, s, s1, this.i.zzp(), (z3 || !z1 ? null : this.s)));
    }

    public final void zzx(String s, zzbom zzbom0) {
        synchronized(this.l) {
            List list0 = (List)this.k.get(s);
            if(list0 == null) {
                list0 = new CopyOnWriteArrayList();
                this.k.put(s, list0);
            }
            list0.add(zzbom0);
        }
    }

    public final void zzy() {
        zzccj zzccj0 = this.C;
        if(zzccj0 != null) {
            zzccj0.zze();
            this.C = null;
        }
        m3 m30 = this.J;
        if(m30 != null) {
            ((View)this.i).removeOnAttachStateChangeListener(m30);
        }
        synchronized(this.l) {
            this.k.clear();
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.t = false;
            this.v = false;
            this.w = false;
            this.y = null;
            this.A = null;
            this.z = null;
            zzbwp zzbwp0 = this.B;
            if(zzbwp0 != null) {
                zzbwp0.zza(true);
                this.B = null;
            }
            this.D = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcmv
    public final void zzz(zzcmt zzcmt0) {
        this.o = zzcmt0;
    }
}

