package com.google.android.gms.ads.internal.overlay;

import E0.a;
import E0.b;
import E0.c;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzcmv;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzefa;
import java.util.Collections;

public class zzl extends zzbxu implements zzaa {
    public boolean A;
    public int B;
    public static final int C;
    public final Activity i;
    public AdOverlayInfoParcel j;
    public zzcli k;
    public zzh l;
    public zzr m;
    public boolean n;
    public FrameLayout o;
    public WebChromeClient.CustomViewCallback p;
    public boolean q;
    public boolean r;
    public b s;
    public boolean t;
    public final Object u;
    public zze v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        zzl.C = 0;
    }

    public zzl(Activity activity0) {
        this.n = false;
        this.q = false;
        this.r = false;
        this.t = false;
        this.B = 1;
        this.u = new Object();
        this.y = false;
        this.z = false;
        this.A = true;
        this.i = activity0;
    }

    public final void b(boolean z) {
        zzcli zzcli4;
        Activity activity0 = this.i;
        if(!this.x) {
            activity0.requestWindowFeature(1);
        }
        Window window0 = activity0.getWindow();
        if(window0 == null) {
            throw new a("Invalid activity, no window available.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        zzcli zzcli0 = this.j.zzd;
        zzb zzb0 = null;
        zzcmv zzcmv0 = zzcli0 == null ? null : zzcli0.zzP();
        boolean z1 = false;
        boolean z2 = zzcmv0 != null && zzcmv0.zzJ();
        this.t = false;
        if(z2) {
            int v = this.j.zzj;
            if(v == 6) {
                if(activity0.getResources().getConfiguration().orientation == 1) {
                    z1 = true;
                }
                this.t = z1;
            }
            else if(v == 7) {
                if(activity0.getResources().getConfiguration().orientation == 2) {
                    z1 = true;
                }
                this.t = z1;
            }
        }
        zzcfi.zze(("Delay onShow to next orientation change: " + z1));
        this.zzy(this.j.zzj);
        window0.setFlags(0x1000000, 0x1000000);
        zzcfi.zze("Hardware acceleration on the AdActivity window enabled.");
        if(this.r) {
            this.s.setBackgroundColor(zzl.C);
        }
        else {
            this.s.setBackgroundColor(0xFF000000);
        }
        activity0.setContentView(this.s);
        this.x = true;
        if(z) {
            try {
                zzcli zzcli1 = this.j.zzd;
                zzcmx zzcmx0 = zzcli1 == null ? null : zzcli1.zzQ();
                zzcli zzcli2 = this.j.zzd;
                String s = zzcli2 == null ? null : zzcli2.zzU();
                zzcli zzcli3 = this.j.zzd;
                zzcli4 = zzclu.zza(this.i, zzcmx0, s, true, z2, null, null, this.j.zzm, null, null, (zzcli3 == null ? null : zzcli3.zzm()), zzbdm.zza(), null, null);
                this.k = zzcli4;
            }
            catch(Exception exception0) {
                zzcfi.zzh("Error obtaining webview.", exception0);
                throw new a("Could not obtain webview for the overlay.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            zzcmv zzcmv1 = zzcli4.zzP();
            zzbnm zzbnm0 = this.j.zzp;
            zzbno zzbno0 = this.j.zze;
            zzw zzw0 = this.j.zzi;
            zzcli zzcli5 = this.j.zzd;
            if(zzcli5 != null) {
                zzb0 = zzcli5.zzP().zzd();
            }
            zzcmv1.zzL(null, zzbnm0, null, zzbno0, zzw0, true, null, zzb0, null, null, null, null, null, null, null, null);
            this.k.zzP().zzz(new zzd(this));
            AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
            String s1 = adOverlayInfoParcel0.zzl;
            if(s1 == null) {
                String s2 = adOverlayInfoParcel0.zzh;
                if(s2 == null) {
                    throw new a("No URL or HTML to display in ad overlay.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                this.k.loadDataWithBaseURL(adOverlayInfoParcel0.zzf, s2, "text/html", "UTF-8", null);
            }
            else {
                this.k.loadUrl(s1);
            }
            zzcli zzcli6 = this.j.zzd;
            if(zzcli6 != null) {
                zzcli6.zzat(this);
            }
        }
        else {
            this.k = this.j.zzd;
            this.j.zzd.zzam(activity0);
        }
        this.k.zzah(this);
        zzcli zzcli7 = this.j.zzd;
        if(zzcli7 != null) {
            IObjectWrapper iObjectWrapper0 = zzcli7.zzS();
            b b0 = this.s;
            if(iObjectWrapper0 != null && b0 != null) {
                zzt.zzh().zzc(iObjectWrapper0, b0);
            }
        }
        if(this.j.zzk != 5) {
            ViewParent viewParent0 = this.k.getParent();
            if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.k.zzH());
            }
            if(this.r) {
                this.k.zzal();
            }
            this.s.addView(this.k.zzH(), -1, -1);
        }
        if(!z && !this.t) {
            this.k.zzZ();
        }
        AdOverlayInfoParcel adOverlayInfoParcel1 = this.j;
        if(adOverlayInfoParcel1.zzk != 5) {
            this.zzu(z2);
            if(this.k.zzay()) {
                this.zzw(z2, true);
            }
            return;
        }
        zzefa.zzh(this.i, this, adOverlayInfoParcel1.zzu, adOverlayInfoParcel1.zzr, adOverlayInfoParcel1.zzs, adOverlayInfoParcel1.zzt, adOverlayInfoParcel1.zzq, adOverlayInfoParcel1.zzv);
    }

    public final void c(Configuration configuration0) {
        int v;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = this.j != null && (this.j.zzo != null && this.j.zzo.zzb);
        Activity activity0 = this.i;
        boolean z3 = zzt.zzq().zze(activity0, configuration0);
        if(this.r && !z2) {
            z = false;
        }
        else if(z3) {
            z = false;
        }
        else if(this.j != null && (this.j.zzo != null && this.j.zzo.zzg)) {
            z1 = true;
        }
        Window window0 = activity0.getWindow();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaY)).booleanValue()) {
            View view0 = window0.getDecorView();
            if(!z) {
                v = 0x100;
            }
            else if(z1) {
                v = 0x1706;
            }
            else {
                v = 5380;
            }
            view0.setSystemUiVisibility(v);
            return;
        }
        if(z) {
            window0.addFlags(0x400);
            window0.clearFlags(0x800);
            if(z1) {
                window0.getDecorView().setSystemUiVisibility(0x1002);
            }
            return;
        }
        window0.addFlags(0x800);
        window0.clearFlags(0x400);
    }

    public final void zzA(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        FrameLayout frameLayout0 = new FrameLayout(this.i);
        this.o = frameLayout0;
        frameLayout0.setBackgroundColor(0xFF000000);
        this.o.addView(view0, -1, -1);
        this.i.setContentView(this.o);
        this.x = true;
        this.p = webChromeClient$CustomViewCallback0;
        this.n = true;
    }

    public final void zzC() {
        synchronized(this.u) {
            this.w = true;
            zze zze0 = this.v;
            if(zze0 != null) {
                zzs.zza.removeCallbacks(zze0);
                zzs.zza.post(this.v);
            }
        }
    }

    public final void zzD() {
        if(this.i.isFinishing() && !this.y) {
            this.y = true;
            zzcli zzcli0 = this.k;
            if(zzcli0 != null) {
                zzcli0.zzY(this.B - 1);
                Object object0 = this.u;
                synchronized(object0) {
                    if(!this.w && this.k.zzaz()) {
                        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdQ)).booleanValue() && !this.z) {
                            AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
                            if(adOverlayInfoParcel0 != null) {
                                zzo zzo0 = adOverlayInfoParcel0.zzc;
                                if(zzo0 != null) {
                                    zzo0.zzbC();
                                }
                            }
                        }
                        zze zze0 = () -> {
                            if(this.z) {
                                return;
                            }
                            this.z = true;
                            zzcli zzcli0 = this.k;
                            if(zzcli0 != null) {
                                this.s.removeView(zzcli0.zzH());
                                zzh zzh0 = this.l;
                                if(zzh0 == null) {
                                    Activity activity0 = this.i;
                                    if(activity0.getApplicationContext() != null) {
                                        this.k.zzam(activity0.getApplicationContext());
                                    }
                                }
                                else {
                                    this.k.zzam(zzh0.zzd);
                                    this.k.zzap(false);
                                    this.l.zzc.addView(this.k.zzH(), this.l.zza, this.l.zzb);
                                    this.l = null;
                                }
                                this.k = null;
                            }
                            AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
                            if(adOverlayInfoParcel0 != null) {
                                zzo zzo0 = adOverlayInfoParcel0.zzc;
                                if(zzo0 != null) {
                                    zzo0.zzf(this.B);
                                }
                            }
                            AdOverlayInfoParcel adOverlayInfoParcel1 = this.j;
                            if(adOverlayInfoParcel1 != null) {
                                zzcli zzcli1 = adOverlayInfoParcel1.zzd;
                                if(zzcli1 != null) {
                                    IObjectWrapper iObjectWrapper0 = zzcli1.zzS();
                                    View view0 = this.j.zzd.zzH();
                                    if(iObjectWrapper0 != null && view0 != null) {
                                        zzt.zzh().zzc(iObjectWrapper0, view0);
                                    }
                                }
                            }
                        };
                        this.v = zze0;
                        long v1 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzaR)));
                        zzs.zza.postDelayed(zze0, v1);
                        return;
                    }
                }
            }
            this.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() {
        this.B = 1;
        if(this.k == null) {
            return true;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && this.k.canGoBack()) {
            this.k.goBack();
            return false;
        }
        boolean z = this.k.zzaE();
        if(!z) {
            this.k.zzd("onbackblocked", Collections.emptyMap());
        }
        return z;
    }

    public final void zzb() {
        this.B = 3;
        Activity activity0 = this.i;
        activity0.finish();
        if(this.j != null && this.j.zzk == 5) {
            activity0.overridePendingTransition(0, 0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        this.B = 2;
        this.i.finish();
    }

    // 检测为 lambda 实现。
    public final void zzc() {
        if(this.z) {
            return;
        }
        this.z = true;
        zzcli zzcli0 = this.k;
        if(zzcli0 != null) {
            this.s.removeView(zzcli0.zzH());
            zzh zzh0 = this.l;
            if(zzh0 == null) {
                Activity activity0 = this.i;
                if(activity0.getApplicationContext() != null) {
                    this.k.zzam(activity0.getApplicationContext());
                }
            }
            else {
                this.k.zzam(zzh0.zzd);
                this.k.zzap(false);
                this.l.zzc.addView(this.k.zzH(), this.l.zza, this.l.zzb);
                this.l = null;
            }
            this.k = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzf(this.B);
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel1 = this.j;
        if(adOverlayInfoParcel1 != null) {
            zzcli zzcli1 = adOverlayInfoParcel1.zzd;
            if(zzcli1 != null) {
                IObjectWrapper iObjectWrapper0 = zzcli1.zzS();
                View view0 = this.j.zzd.zzH();
                if(iObjectWrapper0 != null && view0 != null) {
                    zzt.zzh().zzc(iObjectWrapper0, view0);
                }
            }
        }
    }

    public final void zzd() {
        this.s.j = true;
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
        if(adOverlayInfoParcel0 != null && this.n) {
            this.zzy(adOverlayInfoParcel0.zzj);
        }
        if(this.o != null) {
            this.i.setContentView(this.s);
            this.x = true;
            this.o.removeAllViews();
            this.o = null;
        }
        WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.p;
        if(webChromeClient$CustomViewCallback0 != null) {
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            this.p = null;
        }
        this.n = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int v, int v1, Intent intent0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() {
        this.B = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.c(((Configuration)ObjectWrapper.unwrap(iObjectWrapper0)));
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public void zzk(Bundle bundle0) {
        Activity activity0 = this.i;
        activity0.requestWindowFeature(1);
        boolean z = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.q = z;
            AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(activity0.getIntent());
            this.j = adOverlayInfoParcel0;
            if(adOverlayInfoParcel0 != null) {
                if(adOverlayInfoParcel0.zzm.zzc > 7500000) {
                    this.B = 4;
                }
                if(activity0.getIntent() != null) {
                    this.A = activity0.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel1 = this.j;
                zzj zzj0 = adOverlayInfoParcel1.zzo;
                if(zzj0 != null) {
                    this.r = zzj0.zza;
                    if(zzj0.zza) {
                        goto label_19;
                    }
                }
                else if(adOverlayInfoParcel1.zzk == 5) {
                    this.r = true;
                label_19:
                    if(adOverlayInfoParcel1.zzk != 5 && zzj0.zzf != -1) {
                        new c(this).zzb();
                    }
                }
                else {
                    this.r = false;
                }
                if(bundle0 == null) {
                    if(this.A) {
                        zzdcg zzdcg0 = this.j.zzx;
                        if(zzdcg0 != null) {
                            zzdcg0.zzd();
                        }
                        zzo zzo0 = this.j.zzc;
                        if(zzo0 != null) {
                            zzo0.zzb();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.j;
                    if(adOverlayInfoParcel2.zzk != 1) {
                        zza zza0 = adOverlayInfoParcel2.zzb;
                        if(zza0 != null) {
                            zza0.onAdClicked();
                        }
                        zzdjg zzdjg0 = this.j.zzy;
                        if(zzdjg0 != null) {
                            zzdjg0.zzq();
                        }
                    }
                }
                b b0 = new b(activity0, this.j.zzn, this.j.zzm.zza, this.j.zzw);
                this.s = b0;
                b0.setId(1000);
                zzt.zzq().zzj(activity0);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.j;
                switch(adOverlayInfoParcel3.zzk) {
                    case 1: {
                        this.b(false);
                        return;
                    }
                    case 2: {
                        this.l = new zzh(adOverlayInfoParcel3.zzd);
                        this.b(false);
                        return;
                    }
                    case 3: {
                        this.b(true);
                        return;
                    }
                    case 5: {
                        this.b(false);
                        return;
                    }
                    default: {
                        throw new a("Could not determine ad overlay type.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                }
            }
            throw new a("Could not get info for ad overlay.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        catch(a a0) {
        }
        zzcfi.zzj(a0.getMessage());
        this.B = 4;
        activity0.finish();
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() {
        zzcli zzcli0 = this.k;
        if(zzcli0 != null) {
            try {
                this.s.removeView(zzcli0.zzH());
            }
            catch(NullPointerException unused_ex) {
            }
        }
        this.zzD();
    }

    public final void zzm() {
        if(this.t) {
            this.t = false;
            this.k.zzZ();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() {
        this.zzf();
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzbr();
            }
        }
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.k != null && (!this.i.isFinishing() || this.l == null)) {
            this.k.onPause();
        }
        this.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzbK();
            }
        }
        this.c(this.i.getResources().getConfiguration());
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            if(this.k != null && !this.k.zzaB()) {
                this.k.onResume();
                return;
            }
            zzcfi.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle0) {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.q);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            if(this.k != null && !this.k.zzaB()) {
                this.k.onResume();
                return;
            }
            zzcfi.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.k != null && (!this.i.isFinishing() || this.l == null)) {
            this.k.onPause();
        }
        this.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.j;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zze();
            }
        }
    }

    public final void zzu(boolean z) {
        int v = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzdU)));
        int v1 = 0;
        int v2 = !((Boolean)zzay.zzc().zzb(zzbhz.zzaU)).booleanValue() && !z ? 0 : 1;
        zzq zzq0 = new zzq();
        zzq0.zzd = 50;
        zzq0.zza = 1 == v2 ? v : 0;
        if(1 != v2) {
            v1 = v;
        }
        zzq0.zzb = v1;
        zzq0.zzc = v;
        this.m = new zzr(this.i, zzq0, this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule((1 == v2 ? 11 : 9));
        this.zzw(z, this.j.zzg);
        this.s.addView(this.m, relativeLayout$LayoutParams0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() {
        this.x = true;
    }

    public final void zzw(boolean z, boolean z1) {
        boolean z2 = true;
        boolean z3 = ((Boolean)zzay.zzc().zzb(zzbhz.zzaS)).booleanValue() && (this.j != null && (this.j.zzo != null && this.j.zzo.zzh));
        boolean z4 = ((Boolean)zzay.zzc().zzb(zzbhz.zzaT)).booleanValue() && (this.j != null && (this.j.zzo != null && this.j.zzo.zzi));
        if(z && z1 && z3 && !z4) {
            new zzbwv(this.k, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzr0 = this.m;
        if(zzr0 != null) {
            if(!z4 && (!z1 || z3)) {
                z2 = false;
            }
            zzr0.zzb(z2);
        }
    }

    public final void zzx() {
        this.s.removeView(this.m);
        this.zzu(true);
    }

    public final void zzy(int v) {
        Activity activity0 = this.i;
        if(35 >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzeV)))) && 35 <= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzeW))))) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzeX)))) && v1 <= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzeY))))) {
                return;
            }
        }
        try {
            activity0.setRequestedOrientation(v);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzs(throwable0, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if(z) {
            this.s.setBackgroundColor(0);
            return;
        }
        this.s.setBackgroundColor(0xFF000000);
    }
}

