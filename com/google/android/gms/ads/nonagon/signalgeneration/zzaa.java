package com.google.android.gms.ads.nonagon.signalgeneration;

import A.f;
import H0.a;
import H0.d;
import H0.e;
import T1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdhd;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfcb;
import com.google.android.gms.internal.ads.zzfcz;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzfvm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaa extends zzcdy {
    public final String A;
    public final String B;
    public final AtomicInteger C;
    public final zzcfo D;
    public String E;
    public final String F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public static final ArrayList K;
    public static final ArrayList L;
    public static final ArrayList M;
    public static final ArrayList N;
    public final zzcnf i;
    public Context j;
    public final zzaoc k;
    public final zzfcz l;
    public zzdwc m;
    public final zzfvm n;
    public final ScheduledExecutorService o;
    public zzbyt p;
    public Point q;
    public Point r;
    public final Set s;
    public final zzc t;
    public final zzdwm u;
    public final zzfii v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    public static final int zze;

    static {
        zzaa.K = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
        zzaa.L = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
        zzaa.M = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
        zzaa.N = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    }

    public zzaa(zzcnf zzcnf0, Context context0, zzaoc zzaoc0, zzfcz zzfcz0, zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, zzdwm zzdwm0, zzfii zzfii0, zzcfo zzcfo0) {
        ArrayList arrayList0;
        this.m = null;
        this.q = new Point();
        this.r = new Point();
        this.s = Collections.newSetFromMap(new WeakHashMap());
        this.C = new AtomicInteger(0);
        this.i = zzcnf0;
        this.j = context0;
        this.k = zzaoc0;
        this.l = zzfcz0;
        this.n = zzfvm0;
        this.o = scheduledExecutorService0;
        this.t = zzcnf0.zzm();
        this.u = zzdwm0;
        this.v = zzfii0;
        this.D = zzcfo0;
        this.w = ((Boolean)zzay.zzc().zzb(zzbhz.zzgj)).booleanValue();
        this.x = ((Boolean)zzay.zzc().zzb(zzbhz.zzgi)).booleanValue();
        this.y = ((Boolean)zzay.zzc().zzb(zzbhz.zzgk)).booleanValue();
        this.z = ((Boolean)zzay.zzc().zzb(zzbhz.zzgm)).booleanValue();
        this.A = (String)zzay.zzc().zzb(zzbhz.zzgl);
        this.B = (String)zzay.zzc().zzb(zzbhz.zzgn);
        this.F = (String)zzay.zzc().zzb(zzbhz.zzgo);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgp)).booleanValue()) {
            this.G = zzaa.i(((String)zzay.zzc().zzb(zzbhz.zzgq)));
            this.H = zzaa.i(((String)zzay.zzc().zzb(zzbhz.zzgr)));
            this.I = zzaa.i(((String)zzay.zzc().zzb(zzbhz.zzgs)));
            arrayList0 = zzaa.i(((String)zzay.zzc().zzb(zzbhz.zzgt)));
        }
        else {
            this.G = zzaa.K;
            this.H = zzaa.L;
            this.I = zzaa.M;
            arrayList0 = zzaa.N;
        }
        this.J = arrayList0;
    }

    public static void b(zzaa zzaa0, String s, String s1, zzdwc zzdwc0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfU)).booleanValue()) {
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzga)).booleanValue()) {
            zzi zzi0 = new zzi(zzaa0, s, s1, zzdwc0);
            zzcfv.zza.execute(zzi0);
            return;
        }
        zzaa0.t.zzd(s, s1, zzdwc0);
    }

    // 检测为 lambda 实现。
    public final zzh c(Context context0, String s, String s1, zzq zzq0, zzl zzl0) {
        zzfcb zzfcb0 = new zzfcb();
        zzbhr zzbhr0 = zzbhz.zzgv;
        if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
            if("REWARDED".equals(s1)) {
                zzfcb0.zzo().zza(2);
            }
            else if("REWARDED_INTERSTITIAL".equals(s1)) {
                zzfcb0.zzo().zza(3);
            }
        }
        zzg zzg0 = this.i.zzn();
        zzdbd zzdbd0 = new zzdbd();
        zzdbd0.zzc(context0);
        if(s == null) {
            s = "adUnitId";
        }
        zzfcb0.zzs(s);
        if(zzl0 == null) {
            zzl0 = new zzm().zza();
        }
        zzfcb0.zzE(zzl0);
        if(zzq0 == null) {
            if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
                switch(s1) {
                    case "BANNER": {
                        zzq0 = new zzq(context0, AdSize.BANNER);
                        break;
                    }
                    case "NATIVE": {
                        zzq0 = zzq.zzc();
                        break;
                    }
                    case "REWARDED": {
                        zzq0 = zzq.zzd();
                        break;
                    }
                    case "REWARDED_INTERSTITIAL": {
                        zzq0 = zzq.zzd();
                        break;
                    }
                    default: {
                        zzq0 = new zzq();
                    }
                }
            }
            else {
                zzq0 = new zzq();
            }
        }
        zzfcb0.zzr(zzq0);
        zzfcb0.zzx(true);
        zzdbd0.zzf(zzfcb0.zzG());
        zzg0.zza(zzdbd0.zzg());
        zzac zzac0 = new zzac();
        zzac0.zza(s1);
        zzg0.zzb(new zzae(zzac0));
        new zzdhd();
        zzh zzh0 = zzg0.zzc();
        this.m = zzh0.zza();
        return zzh0;
    }

    public final zzfvl d(String s) {
        zzdse[] arr_zzdse = new zzdse[1];
        zzfvl zzfvl0 = zzfvc.zzn(this.l.zza(), new zzk(this, arr_zzdse, s), this.n);
        zzfvl0.zzc(new com.google.android.gms.ads.nonagon.signalgeneration.zzl(this, arr_zzdse), this.n);
        return zzfvc.zzf(zzfvc.zzm(((zzfut)zzfvc.zzo(zzfut.zzv(zzfvl0), ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzgy)))))), TimeUnit.MILLISECONDS, this.o)), zzv.zza, this.n), Exception.class, zzj.zza, this.n);
    }

    public final void e(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0, boolean z) {
        zzfvl zzfvl0;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            zzcfi.zzj("The updating URL feature is not enabled.");
            try {
                zzbyk0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("", remoteException0);
            }
            return;
        }
        Iterator iterator0 = list0.iterator();
        int v = 0;
        while(true) {
            boolean z1 = iterator0.hasNext();
            ArrayList arrayList0 = this.H;
            ArrayList arrayList1 = this.G;
            if(!z1) {
                break;
            }
            Object object0 = iterator0.next();
            if(zzaa.g(((Uri)object0), arrayList1, arrayList0)) {
                ++v;
            }
        }
        if(v > 1) {
            zzcfi.zzj(("Multiple google urls found: " + list0));
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: list0) {
            Uri uri0 = (Uri)object1;
            if(zzaa.g(uri0, arrayList1, arrayList0)) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzq0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzq(this, uri0, iObjectWrapper0);
                zzfvm zzfvm0 = this.n;
                zzfvl zzfvl1 = zzfvm0.zzb(zzq0);
                if(this.p == null || (this.p.zzb == null || this.p.zzb.isEmpty())) {
                    zzcfi.zzi("Asset view map is empty.");
                    zzfvl0 = zzfvl1;
                }
                else {
                    zzfvl0 = zzfvc.zzn(zzfvl1, (Uri uri0) -> zzfvc.zzm(this.d("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new com.google.android.gms.ads.nonagon.signalgeneration.zzm(this, uri0), this.n), zzfvm0);
                }
            }
            else {
                zzcfi.zzj(("Not a Google URL: " + uri0));
                zzfvl0 = zzfvc.zzi(uri0);
            }
            arrayList2.add(zzfvl0);
        }
        zzfvc.zzr(zzfvc.zze(arrayList2), new e(this, zzbyk0, z, 1), this.i.zzA());
    }

    public final void f(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0, boolean z) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            try {
                zzbyk0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("", remoteException0);
            }
            return;
        }
        zzs zzs0 = new zzs(this, list0, iObjectWrapper0);
        zzfvm zzfvm0 = this.n;
        zzfvl zzfvl0 = zzfvm0.zzb(zzs0);
        if(this.p == null || (this.p.zzb == null || this.p.zzb.isEmpty())) {
            zzcfi.zzi("Asset view map is empty.");
        }
        else {
            zzfvl0 = zzfvc.zzn(zzfvl0, new zzt(this), zzfvm0);
        }
        zzfvc.zzr(zzfvl0, new e(this, zzbyk0, z, 0), this.i.zzA());
    }

    public static boolean g(Uri uri0, ArrayList arrayList0, ArrayList arrayList1) {
        String s = uri0.getHost();
        String s1 = uri0.getPath();
        if(s != null && s1 != null) {
            for(Object object0: arrayList0) {
                if(s1.contains(((String)object0))) {
                    for(Object object1: arrayList1) {
                        if(s.endsWith(((String)object1))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static final Uri h(Uri uri0, String s, String s1) {
        String s2 = uri0.toString();
        int v = s2.indexOf("&adurl=");
        if(v == -1) {
            v = s2.indexOf("?adurl=");
        }
        if(v != -1) {
            StringBuilder stringBuilder0 = new StringBuilder(s2.substring(0, v + 1));
            f.t(stringBuilder0, s, "=", s1, "&");
            stringBuilder0.append(s2.substring(v + 1));
            return Uri.parse(stringBuilder0.toString());
        }
        return uri0.buildUpon().appendQueryParameter(s, s1).build();
    }

    public static final ArrayList i(String s) {
        String[] arr_s = TextUtils.split(s, ",");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!zzfpi.zzd(s1)) {
                arrayList0.add(s1);
            }
        }
        return arrayList0;
    }

    public static zzfhs j(zzfvl zzfvl0, zzced zzced0) {
        if(zzfhu.zza() && ((Boolean)zzbji.zze.zze()).booleanValue()) {
            try {
                zzfhs zzfhs0 = ((zzh)zzfvc.zzp(zzfvl0)).zzb();
                zzfhs0.zzd(new ArrayList(Collections.singletonList(zzced0.zzb)));
                zzfhs0.zzb((zzced0.zzd == null ? "" : zzced0.zzd.zzp));
                return zzfhs0;
            }
            catch(ExecutionException executionException0) {
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzt(executionException0, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper0, zzced zzced0, zzcdw zzcdw0) {
        zzfvl zzfvl1;
        zzfvl zzfvl0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        this.j = context0;
        zzfhh zzfhh0 = zzfhg.zza(context0, 22);
        zzfhh0.zzf();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzit)).booleanValue()) {
            zzo zzo0 = () -> {
                zzfcb zzfcb0 = new zzfcb();
                zzbhr zzbhr0 = zzbhz.zzgv;
                if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
                    if("REWARDED".equals(this.zzb.zzb)) {
                        zzfcb0.zzo().zza(2);
                    }
                    else if("REWARDED_INTERSTITIAL".equals(this.zzb.zzb)) {
                        zzfcb0.zzo().zza(3);
                    }
                }
                zzg zzg0 = this.i.zzn();
                zzdbd zzdbd0 = new zzdbd();
                zzdbd0.zzc(this.zza.j);
                if(this.zzb.zza == null) {
                    this.zzb.zza = "adUnitId";
                }
                zzfcb0.zzs(this.zzb.zza);
                if(this.zzb.zzd == null) {
                    this.zzb.zzd = new zzm().zza();
                }
                zzfcb0.zzE(this.zzb.zzd);
                if(this.zzb.zzc == null) {
                    if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
                        switch(this.zzb.zzb) {
                            case "BANNER": {
                                this.zzb.zzc = new zzq(this.zza.j, AdSize.BANNER);
                                break;
                            }
                            case "NATIVE": {
                                this.zzb.zzc = zzq.zzc();
                                break;
                            }
                            case "REWARDED": {
                                this.zzb.zzc = zzq.zzd();
                                break;
                            }
                            case "REWARDED_INTERSTITIAL": {
                                this.zzb.zzc = zzq.zzd();
                                break;
                            }
                            default: {
                                this.zzb.zzc = new zzq();
                            }
                        }
                    }
                    else {
                        this.zzb.zzc = new zzq();
                    }
                }
                zzfcb0.zzr(this.zzb.zzc);
                zzfcb0.zzx(true);
                zzdbd0.zzf(zzfcb0.zzG());
                zzg0.zza(zzdbd0.zzg());
                zzac zzac0 = new zzac();
                zzac0.zza(this.zzb.zzb);
                zzg0.zzb(new zzae(zzac0));
                new zzdhd();
                zzh zzh0 = zzg0.zzc();
                this.m = zzh0.zza();
                return zzh0;
            };
            zzfvl0 = zzcfv.zza.zzb(zzo0);
            zzfvl1 = zzfvc.zzn(zzfvl0, zzp.zza, zzcfv.zza);
        }
        else {
            zzh zzh0 = this.c(this.j, zzced0.zza, zzced0.zzb, zzced0.zzc, zzced0.zzd);
            zzfvl0 = zzfvc.zzi(zzh0);
            zzfvl1 = zzh0.zzc();
        }
        zzfvc.zzr(zzfvl1, new d(this, zzfvl0, zzced0, zzcdw0, zzfhh0, com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()), this.i.zzA());
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbyt zzbyt0) {
        this.p = zzbyt0;
        this.l.zzc(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) {
        this.e(list0, iObjectWrapper0, zzbyk0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) {
        this.f(list0, iObjectWrapper0, zzbyk0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhO)).booleanValue()) {
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhP)).booleanValue()) {
            zzfvc.zzr((((Boolean)zzay.zzc().zzb(zzbhz.zzit)).booleanValue() ? zzfvc.zzl(new zzu(this), zzcfv.zza) : this.c(this.j, null, AdFormat.BANNER.name(), null, null).zzc()), new c(this, 5), this.i.zzA());
        }
        WebView webView0 = (WebView)ObjectWrapper.unwrap(iObjectWrapper0);
        if(webView0 == null) {
            zzcfi.zzg("The webView cannot be null.");
            return;
        }
        Set set0 = this.s;
        if(set0.contains(webView0)) {
            zzcfi.zzi("This webview has already been registered.");
            return;
        }
        set0.add(webView0);
        webView0.addJavascriptInterface(new a(webView0, this.k, this.u), "gmaSdk");
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.q = zzbx.zza(motionEvent0, (this.p == null ? null : this.p.zza));
        if(motionEvent0.getAction() == 0) {
            this.r = this.q;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.q.x), ((float)this.q.y));
        this.k.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) {
        this.e(list0, iObjectWrapper0, zzbyk0, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) {
        this.f(list0, iObjectWrapper0, zzbyk0, false);
    }
}

