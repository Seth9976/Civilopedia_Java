package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import i3.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class o3 extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzcli {
    public boolean A;
    public boolean B;
    public boolean C;
    public Boolean D;
    public boolean E;
    public final String F;
    public zzcme G;
    public boolean H;
    public boolean I;
    public zzbko J;
    public zzbkm K;
    public zzbca L;
    public int M;
    public int N;
    public zzbil O;
    public final zzbil P;
    public zzbil Q;
    public final zzbim R;
    public int S;
    public int T;
    public int U;
    public zzl V;
    public boolean W;
    public final zzci a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public HashMap f0;
    public final WindowManager g0;
    public final zzbdm h0;
    public final zzcmw i;
    public static final int i0;
    public final zzaoc j;
    public final zzbiy k;
    public final zzcfo l;
    public com.google.android.gms.ads.internal.zzl m;
    public final zza n;
    public final DisplayMetrics o;
    public final float p;
    public zzfbl q;
    public zzfbo r;
    public boolean s;
    public boolean t;
    public zzclp u;
    public zzl v;
    public IObjectWrapper w;
    public zzcmx x;
    public final String y;
    public boolean z;

    public o3(zzcmw zzcmw0, zzcmx zzcmx0, String s, boolean z, zzaoc zzaoc0, zzbiy zzbiy0, zzcfo zzcfo0, com.google.android.gms.ads.internal.zzl zzl0, zza zza0, zzbdm zzbdm0, zzfbl zzfbl0, zzfbo zzfbo0) {
        super(zzcmw0);
        this.s = false;
        this.t = false;
        this.E = true;
        this.F = "";
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.i = zzcmw0;
        this.x = zzcmx0;
        this.y = s;
        this.B = z;
        this.j = zzaoc0;
        this.k = zzbiy0;
        this.l = zzcfo0;
        this.m = zzl0;
        this.n = zza0;
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        this.g0 = windowManager0;
        DisplayMetrics displayMetrics0 = zzs.zzr(windowManager0);
        this.o = displayMetrics0;
        this.p = displayMetrics0.density;
        this.h0 = zzbdm0;
        this.q = zzfbl0;
        this.r = zzfbo0;
        this.a0 = new zzci(zzcmw0.zza(), this, this, null);
        this.setBackgroundColor(0);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccess(false);
        try {
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(NullPointerException nullPointerException0) {
            zzcfi.zzh("Unable to enable Javascript.", nullPointerException0);
        }
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings0.setMixedContentMode(2);
        webSettings0.setUserAgentString(zzt.zzp().zzc(zzcmw0, zzcfo0.zza));
        Context context0 = this.getContext();
        zzcb.zza(context0, new zzm(webSettings0, context0));
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        this.setDownloadListener(this);
        this.h();
        this.addJavascriptInterface(new zzcmi(this, new zzcmh(this), null), "googleAdsJsInterface");
        this.removeJavascriptInterface("accessibility");
        this.removeJavascriptInterface("accessibilityTraversal");
        zzbim zzbim0 = this.R;
        if(zzbim0 != null) {
            zzbio zzbio0 = zzbim0.zza();
            zzbie zzbie0 = zzt.zzo().zzf();
            if(zzbie0 != null) {
                zzbie0.zzf(zzbio0);
            }
        }
        zzbim zzbim1 = new zzbim(new zzbio(true, "make_wv", this.y));
        this.R = zzbim1;
        zzbim1.zza().zzc(null);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && (this.r != null && this.r.zzb != null)) {
            zzbim1.zza().zzd("gqi", this.r.zzb);
        }
        zzbil zzbil0 = zzbio.zzf();
        this.P = zzbil0;
        zzbim1.zzb("native:view_create", zzbil0);
        this.Q = null;
        this.O = null;
        zzce.zza().zzb(zzcmw0);
        zzt.zzo().zzq();
    }

    public final Boolean a() {
        synchronized(this) {
        }
        return this.D;
    }

    public final void c(String s) {
        synchronized(this) {
            if(!this.zzaB()) {
                this.evaluateJavascript(s, null);
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void d(String s) {
        if(this.a() == null) {
            synchronized(this) {
                Boolean boolean0 = zzt.zzo().zzk();
                this.D = boolean0;
                if(boolean0 == null) {
                    try {
                        this.evaluateJavascript("(function(){})()", null);
                        this.f(Boolean.TRUE);
                    }
                    catch(IllegalStateException unused_ex) {
                        this.f(Boolean.FALSE);
                    }
                }
            }
        }
        if(this.a().booleanValue()) {
            this.c(s);
            return;
        }
        this.e("javascript:" + s);
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void destroy() {
        synchronized(this) {
            zzbim zzbim0 = this.R;
            if(zzbim0 != null) {
                zzbio zzbio0 = zzbim0.zza();
                zzbie zzbie0 = zzt.zzo().zzf();
                if(zzbie0 != null) {
                    zzbie0.zzf(zzbio0);
                }
            }
            this.a0.zza();
            zzl zzl0 = this.v;
            if(zzl0 != null) {
                zzl0.zzb();
                this.v.zzl();
                this.v = null;
            }
            this.w = null;
            this.u.zzy();
            this.L = null;
            this.m = null;
            this.setOnClickListener(null);
            this.setOnTouchListener(null);
            if(this.A) {
                return;
            }
            zzt.zzy().zzd(this);
            this.n();
            this.A = true;
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzik)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                this.m();
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            this.zzW();
        }
    }

    public final void e(String s) {
        synchronized(this) {
            if(!this.zzaB()) {
                this.loadUrl(s);
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView
    public final void evaluateJavascript(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(this.zzaB()) {
                zzcfi.zzl("#004 The webview is destroyed. Ignoring action.", null);
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                    return;
                }
                return;
            }
            super.evaluateJavascript(s, valueCallback0);
        }
    }

    public final void f(Boolean boolean0) {
        synchronized(this) {
            this.D = boolean0;
        }
        zzt.zzo().zzu(boolean0);
    }

    @Override
    public final void finalize() {
        try {
            synchronized(this) {
                if(!this.A) {
                    this.u.zzy();
                    zzt.zzy().zzd(this);
                    this.n();
                    this.i();
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    public final boolean g() {
        int v3;
        int v2;
        boolean z = false;
        if(!this.u.zzJ() && !this.u.zzK()) {
            return false;
        }
        DisplayMetrics displayMetrics0 = this.o;
        int v = zzcfb.zzu(displayMetrics0, displayMetrics0.widthPixels);
        int v1 = zzcfb.zzu(displayMetrics0, displayMetrics0.heightPixels);
        Activity activity0 = this.i.zza();
        if(activity0 == null || activity0.getWindow() == null) {
            v2 = v;
            v3 = v1;
        }
        else {
            int[] arr_v = zzs.zzM(activity0);
            v2 = zzcfb.zzu(displayMetrics0, arr_v[0]);
            v3 = zzcfb.zzu(displayMetrics0, arr_v[1]);
        }
        int v4 = this.c0;
        if(v4 == v && this.b0 == v1 && this.d0 == v2 && this.e0 == v3) {
            return false;
        }
        if(v4 != v || this.b0 != v1) {
            z = true;
        }
        this.c0 = v;
        this.b0 = v1;
        this.d0 = v2;
        this.e0 = v3;
        new zzbwv(this, "").zzi(v, v1, v2, v3, displayMetrics0.density, this.g0.getDefaultDisplay().getRotation());
        return z;
    }

    public final void h() {
        synchronized(this) {
            if(this.q != null && this.q.zzao) {
                zzcfi.zze("Disabling hardware acceleration on an overlay.");
                this.j();
                return;
            }
            if(!this.B && !this.x.zzi()) {
                zzcfi.zze("Enabling hardware acceleration on an AdView.");
                this.l();
                return;
            }
            zzcfi.zze("Enabling hardware acceleration on an overlay.");
            this.l();
        }
    }

    public final void i() {
        synchronized(this) {
            if(!this.W) {
                this.W = true;
                zzt.zzo().zzp();
            }
        }
    }

    public final void j() {
        synchronized(this) {
            if(!this.C) {
                this.setLayerType(1, null);
            }
            this.C = true;
        }
    }

    public final void k(boolean z) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (z ? "1" : "0"));
        this.zzd("onAdVisibilityChanged", hashMap0);
    }

    public final void l() {
        synchronized(this) {
            if(this.C) {
                this.setLayerType(0, null);
            }
            this.C = false;
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void loadData(String s, String s1, String s2) {
        synchronized(this) {
            if(!this.zzaB()) {
                super.loadData(s, s1, s2);
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            if(!this.zzaB()) {
                super.loadDataWithBaseURL(s, s1, s2, s3, s4);
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void loadUrl(String s) {
        synchronized(this) {
            if(!this.zzaB()) {
                try {
                    super.loadUrl(s);
                }
                catch(Throwable throwable0) {
                    zzt.zzo().zzt(throwable0, "AdWebViewImpl.loadUrl");
                    zzcfi.zzk("Could not call loadUrl. ", throwable0);
                    return;
                }
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void m() {
        synchronized(this) {
            try {
                super.loadUrl("about:blank");
            }
            catch(Throwable throwable0) {
                zzt.zzo().zzt(throwable0, "AdWebViewImpl.loadUrlUnsafe");
                zzcfi.zzk("Could not call loadUrl in destroy(). ", throwable0);
            }
        }
    }

    public final void n() {
        synchronized(this) {
            HashMap hashMap0 = this.f0;
            if(hashMap0 != null) {
                for(Object object0: hashMap0.values()) {
                    ((zzcju)object0).release();
                }
            }
            this.f0 = null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclp zzclp0 = this.u;
        if(zzclp0 != null) {
            zzclp0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebView
    public final void onAttachedToWindow() {
        synchronized(this) {
            super.onAttachedToWindow();
            if(!this.zzaB()) {
                this.a0.zzc();
            }
            boolean z = this.H;
            if(this.u != null && this.u.zzK()) {
                if(!this.I) {
                    this.I = true;
                }
                this.g();
                z = true;
            }
            this.k(z);
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        synchronized(this) {
            if(!this.zzaB()) {
                this.a0.zzd();
            }
            super.onDetachedFromWindow();
            if(this.I && (this.u != null && this.u.zzK() && this.getViewTreeObserver() != null && this.getViewTreeObserver().isAlive())) {
                this.I = false;
            }
        }
        this.k(false);
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(Uri.parse(s), s3);
            zzs.zzI(this.getContext(), intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            zzcfi.zze(("Couldn\'t find an Activity to view url/mimetype: " + s + " / " + s3));
        }
    }

    @Override  // android.webkit.WebView
    public final void onDraw(Canvas canvas0) {
        if(this.zzaB()) {
            return;
        }
        if(Build.VERSION.SDK_INT == 21 && canvas0.isHardwareAccelerated() && !this.isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas0);
    }

    @Override  // android.webkit.WebView
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f = motionEvent0.getAxisValue(9);
        float f1 = motionEvent0.getAxisValue(10);
        return motionEvent0.getActionMasked() != 8 || (f <= 0.0f || this.canScrollVertically(-1)) && (f >= 0.0f || this.canScrollVertically(1)) && (f1 <= 0.0f || this.canScrollHorizontally(-1)) && (f1 >= 0.0f || this.canScrollHorizontally(1)) ? super.onGenericMotionEvent(motionEvent0) : false;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = this.g();
        zzl zzl0 = this.zzN();
        if(zzl0 != null && z) {
            zzl0.zzm();
        }
    }

    @Override  // android.webkit.WebView
    public final void onMeasure(int v, int v1) {
        int v2 = 0;
        synchronized(this) {
            if(this.zzaB()) {
                this.setMeasuredDimension(0, 0);
                return;
            }
            if(!this.isInEditMode() && !this.B && !this.x.zzf()) {
                if(this.x.zzh()) {
                    super.onMeasure(v, v1);
                    return;
                }
                if(this.x.zzj()) {
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzcT)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    zzcme zzcme0 = this.zzs();
                    float f = zzcme0 == null ? 0.0f : zzcme0.zze();
                    if(f == 0.0f) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    int v4 = View.MeasureSpec.getSize(v);
                    int v5 = View.MeasureSpec.getSize(v1);
                    int v6 = (int)(((float)v5) * f);
                    int v7 = (int)(((float)v4) / f);
                    if(v5 != 0) {
                    label_36:
                        if(v4 != 0) {
                            v2 = v4;
                        }
                        else if(v6 != 0) {
                            v7 = (int)(((float)v6) / f);
                            v2 = v6;
                        }
                    }
                    else if(v7 != 0) {
                        v6 = (int)(((float)v7) * f);
                        v2 = v4;
                        v5 = v7;
                    }
                    else {
                        v5 = 0;
                        goto label_36;
                    }
                    this.setMeasuredDimension(Math.min(v6, v2), Math.min(v7, v5));
                    return;
                }
                if(this.x.zzg()) {
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzcZ)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    this.zzaf("/contentHeight", new v4(this));
                    this.d("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f1 = this.o.density;
                    int v8 = View.MeasureSpec.getSize(v);
                    int v9 = this.N;
                    this.setMeasuredDimension(v8, (v9 == -1 ? View.MeasureSpec.getSize(v1) : ((int)(((float)v9) * f1))));
                    return;
                }
                if(this.x.zzi()) {
                    this.setMeasuredDimension(this.o.widthPixels, this.o.heightPixels);
                    return;
                }
                int v10 = View.MeasureSpec.getMode(v);
                int v11 = View.MeasureSpec.getSize(v);
                int v12 = View.MeasureSpec.getMode(v1);
                int v13 = View.MeasureSpec.getSize(v1);
                int v14 = 0x7FFFFFFF;
                int v15 = v10 == 0x80000000 || v10 == 0x40000000 ? v11 : 0x7FFFFFFF;
                if(v12 == 0x80000000 || v12 == 0x40000000) {
                    v14 = v13;
                }
                int v16 = this.x.zzb <= v15 && this.x.zza <= v14 ? 0 : 1;
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzet)).booleanValue()) {
                    v16 &= (((float)this.x.zzb) / this.p > ((float)v15) / this.p || ((float)this.x.zza) / this.p > ((float)v14) / this.p ? 0 : 1);
                }
                if(v16 != 0) {
                    zzcfi.zzj(("Not enough space to show ad. Needs " + ((int)(((float)this.x.zzb) / this.p)) + "x" + ((int)(((float)this.x.zza) / this.p)) + " dp, but only has " + ((int)(((float)v11) / this.p)) + "x" + ((int)(((float)v13) / this.p)) + " dp."));
                    if(this.getVisibility() != 8) {
                        this.setVisibility(4);
                    }
                    this.setMeasuredDimension(0, 0);
                    if(!this.s) {
                        this.h0.zzc(10001);
                        this.s = true;
                        return;
                    }
                    return;
                }
                if(this.getVisibility() != 8) {
                    this.setVisibility(0);
                }
                if(!this.t) {
                    this.h0.zzc(10002);
                    this.t = true;
                }
                this.setMeasuredDimension(this.x.zzb, this.x.zza);
                return;
            }
            super.onMeasure(v, v1);
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onPause() {
        if(this.zzaB()) {
            return;
        }
        try {
            super.onPause();
        }
        catch(Exception exception0) {
            zzcfi.zzh("Could not pause webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onResume() {
        if(this.zzaB()) {
            return;
        }
        try {
            super.onResume();
        }
        catch(Exception exception0) {
            zzcfi.zzh("Could not resume webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.u.zzK() && !this.u.zzI()) {
            synchronized(this) {
                zzbko zzbko0 = this.J;
                if(zzbko0 != null) {
                    zzbko0.zzd(motionEvent0);
                }
            }
            return this.zzaB() ? false : super.onTouchEvent(motionEvent0);
        }
        zzaoc zzaoc0 = this.j;
        if(zzaoc0 != null) {
            zzaoc0.zzd(motionEvent0);
        }
        zzbiy zzbiy0 = this.k;
        if(zzbiy0 != null) {
            zzbiy0.zzb(motionEvent0);
        }
        return this.zzaB() ? false : super.onTouchEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void setWebViewClient(WebViewClient webViewClient0) {
        super.setWebViewClient(webViewClient0);
        if(webViewClient0 instanceof zzclp) {
            this.u = (zzclp)webViewClient0;
        }
    }

    @Override  // android.webkit.WebView
    public final void stopLoading() {
        if(this.zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        }
        catch(Exception exception0) {
            zzcfi.zzh("Could not stop loading webview.", exception0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzA(int v) {
        this.T = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzB(boolean z) {
        this.u.zzB(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzC(int v) {
        synchronized(this) {
            this.S = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzD(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzE(zzcme zzcme0) {
        synchronized(this) {
            if(this.G != null) {
                zzcfi.zzg("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.G = zzcme0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfbl zzF() {
        return this.q;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final Context zzG() {
        return this.i.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final View zzH() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final WebView zzI() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final WebViewClient zzJ() {
        return this.u;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzaoc zzK() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbca zzL() {
        synchronized(this) {
        }
        return this.L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbko zzM() {
        synchronized(this) {
        }
        return this.J;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzl zzN() {
        synchronized(this) {
        }
        return this.v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzl zzO() {
        synchronized(this) {
        }
        return this.V;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcmv zzP() {
        return this.u;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcmx zzQ() {
        synchronized(this) {
        }
        return this.x;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfbo zzR() {
        return this.r;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final IObjectWrapper zzS() {
        synchronized(this) {
        }
        return this.w;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfvl zzT() {
        return this.k == null ? zzfvc.zzi(null) : this.k.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final String zzU() {
        synchronized(this) {
        }
        return this.y;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzV(zzfbl zzfbl0, zzfbo zzfbo0) {
        this.q = zzfbl0;
        this.r = zzfbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzW() {
        synchronized(this) {
            zze.zza("Destroying WebView!");
            this.i();
            A0 a00 = new A0(this, 8);
            zzs.zza.post(a00);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzX() {
        zzbig.zza(this.R.zza(), this.P, new String[]{"aeh2"});
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.l.zza);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzY(int v) {
        zzbil zzbil0 = this.P;
        zzbim zzbim0 = this.R;
        if(v == 0) {
            zzbig.zza(zzbim0.zza(), zzbil0, new String[]{"aebb2"});
        }
        zzbig.zza(zzbim0.zza(), zzbil0, new String[]{"aeh2"});
        zzbim0.zza().zzd("close_type", String.valueOf(v));
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("closetype", String.valueOf(v));
        hashMap0.put("version", this.l.zza);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzZ() {
        if(this.O == null) {
            zzbig.zza(this.R.zza(), this.P, new String[]{"aes2"});
            zzbil zzbil0 = zzbio.zzf();
            this.O = zzbil0;
            this.R.zzb("native:view_show", zzbil0);
        }
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.l.zza);
        this.zzd("onshow", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zza(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaA(boolean z, int v) {
        this.destroy();
        zzcly zzcly0 = new zzcly(z, v);
        this.h0.zzb(zzcly0);
        this.h0.zzc(10003);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaB() {
        synchronized(this) {
        }
        return this.A;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaC() {
        synchronized(this) {
        }
        return this.B;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaD() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaE() {
        synchronized(this) {
        }
        return this.E;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaF(zzc zzc0, boolean z) {
        this.u.zzr(zzc0, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaG(zzbr zzbr0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0, String s, String s1, int v) {
        this.u.zzs(zzbr0, zzees0, zzdwh0, zzfgp0, s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaH(boolean z, int v, boolean z1) {
        this.u.zzt(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaI(boolean z, int v, String s, boolean z1) {
        this.u.zzv(z, v, s, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaJ(boolean z, int v, String s, String s1, boolean z1) {
        this.u.zzw(z, v, s, s1, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaa() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzab(boolean z) {
        this.u.zzh(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzac() {
        this.a0.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzad(String s, String s1, String s2) {
        String s4;
        synchronized(this) {
            if(!this.zzaB()) {
                String s3 = (String)zzay.zzc().zzb(zzbhz.zzN);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("version", s3);
                    jSONObject0.put("sdk", "Google Mobile Ads");
                    jSONObject0.put("sdkVersion", "12.4.51-000");
                    s4 = "<script>Object.defineProperty(window,\'MRAID_ENV\',{get:function(){return " + jSONObject0.toString() + "}});</script>";
                }
                catch(JSONException jSONException0) {
                    zzcfi.zzk("Unable to build MRAID_ENV", jSONException0);
                    s4 = null;
                }
                super.loadDataWithBaseURL(s, zzcmo.zza(s1, new String[]{s4}), "text/html", "UTF-8", null);
                return;
            }
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzae() {
        if(this.Q == null) {
            zzbil zzbil0 = zzbio.zzf();
            this.Q = zzbil0;
            this.R.zzb("native:view_load", zzbil0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaf(String s, zzbom zzbom0) {
        zzclp zzclp0 = this.u;
        if(zzclp0 != null) {
            zzclp0.zzx(s, zzbom0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzag() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzah(zzl zzl0) {
        synchronized(this) {
            this.v = zzl0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzai(zzcmx zzcmx0) {
        synchronized(this) {
            this.x = zzcmx0;
            this.requestLayout();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaj(zzbca zzbca0) {
        synchronized(this) {
            this.L = zzbca0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzak(boolean z) {
        synchronized(this) {
            this.E = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzal() {
        this.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzam(Context context0) {
        this.i.setBaseContext(context0);
        this.a0.zze(this.i.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzan(boolean z) {
        synchronized(this) {
            zzl zzl0 = this.v;
            if(zzl0 != null) {
                zzl0.zzw(this.u.zzJ(), z);
                return;
            }
            this.z = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzao(zzbkm zzbkm0) {
        synchronized(this) {
            this.K = zzbkm0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzap(boolean z) {
        synchronized(this) {
            boolean z1 = this.B;
            this.B = z;
            this.h();
            if(z != z1 && (!((Boolean)zzay.zzc().zzb(zzbhz.zzO)).booleanValue() || !this.x.zzi())) {
                new zzbwv(this, "").zzk((z ? "expanded" : "default"));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaq(zzbko zzbko0) {
        synchronized(this) {
            this.J = zzbko0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzar(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.w = iObjectWrapper0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzas(int v) {
        synchronized(this) {
            zzl zzl0 = this.v;
            if(zzl0 != null) {
                zzl0.zzy(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzat(zzl zzl0) {
        synchronized(this) {
            this.V = zzl0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzau(boolean z) {
        synchronized(this) {
            int v1 = this.M + (z ? 1 : -1);
            this.M = v1;
            if(v1 <= 0) {
                zzl zzl0 = this.v;
                if(zzl0 != null) {
                    zzl0.zzC();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzav(boolean z) {
        synchronized(this) {
            if(z) {
                this.setBackgroundColor(0);
            }
            zzl zzl0 = this.v;
            if(zzl0 != null) {
                zzl0.zzz(z);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaw(String s, zzbom zzbom0) {
        zzclp zzclp0 = this.u;
        if(zzclp0 != null) {
            zzclp0.zzG(s, zzbom0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzax(String s, Predicate predicate0) {
        zzclp zzclp0 = this.u;
        if(zzclp0 != null) {
            zzclp0.zzH(s, predicate0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzay() {
        synchronized(this) {
        }
        return this.z;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaz() {
        synchronized(this) {
        }
        return this.M > 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzb(String s, String s1) {
        this.d(s + "(" + s1 + ");");
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        synchronized(this) {
            com.google.android.gms.ads.internal.zzl zzl0 = this.m;
            if(zzl0 != null) {
                zzl0.zzbn();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        synchronized(this) {
            com.google.android.gms.ads.internal.zzl zzl0 = this.m;
            if(zzl0 != null) {
                zzl0.zzbo();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzchg zzbp() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        synchronized(this) {
            this.H = zzbam0.zzj;
        }
        this.k(zzbam0.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzaw.zzb().zzi(map0);
        }
        catch(JSONException unused_ex) {
            zzcfi.zzj("Could not convert parameters to JSON.");
            return;
        }
        this.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        StringBuilder stringBuilder0 = e.j("(window.AFMA_ReceiveMessage || function() {})(\'", s, "\',", jSONObject0.toString(), ");");
        zzcfi.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        this.d(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzf() {
        return this.U;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzg() {
        return this.T;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzh() {
        synchronized(this) {
        }
        return this.S;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzi() {
        return this.getMeasuredHeight();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzj() {
        return this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final Activity zzk() {
        return this.i.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzl(String s, JSONObject jSONObject0) {
        this.zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zza zzm() {
        return this.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzbil zzn() {
        return this.P;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbim zzo() {
        return this.R;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcfo zzp() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzclp zzclp0 = this.u;
        if(zzclp0 != null) {
            zzclp0.zzq();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzcju zzr(String s) {
        synchronized(this) {
            HashMap hashMap0 = this.f0;
            return hashMap0 == null ? null : ((zzcju)hashMap0.get(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcme zzs() {
        synchronized(this) {
        }
        return this.G;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final String zzt() {
        synchronized(this) {
            zzfbo zzfbo0 = this.r;
            if(zzfbo0 != null) {
                return zzfbo0.zzb;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final String zzu() {
        synchronized(this) {
        }
        return this.F;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzv(String s, zzcju zzcju0) {
        synchronized(this) {
            if(this.f0 == null) {
                this.f0 = new HashMap();
            }
            this.f0.put(s, zzcju0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzw() {
        zzl zzl0 = this.zzN();
        if(zzl0 != null) {
            zzl0.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzx(boolean z, long v) {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("success", (z ? "1" : "0"));
        hashMap0.put("duration", Long.toString(v));
        this.zzd("onCacheAccessComplete", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzy() {
        synchronized(this) {
            zzbkm zzbkm0 = this.K;
            if(zzbkm0 != null) {
                zzdrc zzdrc0 = new zzdrc(((zzdre)zzbkm0));
                zzs.zza.post(zzdrc0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzz(int v) {
        this.U = v;
    }
}

