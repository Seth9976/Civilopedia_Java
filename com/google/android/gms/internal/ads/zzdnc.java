package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p.b;

public final class zzdnc extends zzcxx {
    public final Context A;
    public final zzdne B;
    public final zzemk C;
    public final HashMap D;
    public final ArrayList E;
    public final Executor i;
    public final zzdnh j;
    public final zzdnp k;
    public final zzdoh l;
    public final zzdnm m;
    public final zzdns n;
    public final zzgqo o;
    public final zzgqo p;
    public final zzgqo q;
    public final zzgqo r;
    public final zzgqo s;
    public zzdpc t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final zzccv x;
    public final zzaoc y;
    public final zzcfo z;
    public static final zzfrj zzc;

    static {
        zzdnc.zzc = zzfrj.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdnc(zzcxw zzcxw0, Executor executor0, zzdnh zzdnh0, zzdnp zzdnp0, zzdoh zzdoh0, zzdnm zzdnm0, zzdns zzdns0, zzgqo zzgqo0, zzgqo zzgqo1, zzgqo zzgqo2, zzgqo zzgqo3, zzgqo zzgqo4, zzccv zzccv0, zzaoc zzaoc0, zzcfo zzcfo0, Context context0, zzdne zzdne0, zzemk zzemk0, zzbap zzbap0) {
        super(zzcxw0);
        this.i = executor0;
        this.j = zzdnh0;
        this.k = zzdnp0;
        this.l = zzdoh0;
        this.m = zzdnm0;
        this.n = zzdns0;
        this.o = zzgqo0;
        this.p = zzgqo1;
        this.q = zzgqo2;
        this.r = zzgqo3;
        this.s = zzgqo4;
        this.x = zzccv0;
        this.y = zzaoc0;
        this.z = zzcfo0;
        this.A = context0;
        this.B = zzdne0;
        this.C = zzemk0;
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public final View a(Map map0) {
        synchronized(this) {
            if(map0 == null) {
                return null;
            }
            zzfrj zzfrj0 = zzdnc.zzc;
            int v1 = zzfrj0.size();
            int v2 = 0;
            while(v2 < v1) {
                WeakReference weakReference0 = (WeakReference)map0.get(((String)zzfrj0.get(v2)));
                ++v2;
                if(weakReference0 != null) {
                    return (View)weakReference0.get();
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    public final void b(View view0, Map map0, Map map1) {
        synchronized(this) {
            this.l.zzd(this.t);
            this.k.zzp(view0, map0, map1);
            this.v = true;
        }
    }

    // 检测为 lambda 实现。
    public final void c(zzdpc zzdpc0) {
        synchronized(this) {
            if(this.u) {
                return;
            }
            this.t = zzdpc0;
            this.l.zze(zzdpc0);
            View view0 = zzdpc0.zzf();
            Map map0 = zzdpc0.zzm();
            Map map1 = zzdpc0.zzn();
            this.k.zzx(view0, map0, map1, zzdpc0, zzdpc0);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcf)).booleanValue()) {
                zzany zzany0 = this.y.zzc();
                if(zzany0 != null) {
                    zzany0.zzn(zzdpc0.zzf());
                }
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbw)).booleanValue()) {
                zzfbl zzfbl0 = this.b;
                if(zzfbl0.zzam) {
                    Iterator iterator0 = zzfbl0.zzal.keys();
                    if(iterator0 != null) {
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s = (String)object0;
                            WeakReference weakReference0 = (WeakReference)this.t.zzl().get(s);
                            this.D.put(s, Boolean.FALSE);
                            if(weakReference0 != null) {
                                View view1 = (View)weakReference0.get();
                                if(view1 != null) {
                                    zzbao zzbao0 = new zzbao(this.A, view1);
                                    this.E.add(zzbao0);
                                    zzbao0.zzc(new w4(this, s));
                                }
                            }
                        }
                    }
                }
            }
            if(zzdpc0.zzi() != null) {
                zzdpc0.zzi().zzc(this.x);
            }
        }
    }

    // 检测为 lambda 实现。
    public final void d(zzdpc zzdpc0) {
        View view0 = zzdpc0.zzf();
        Map map0 = zzdpc0.zzl();
        this.k.zzy(view0, map0);
        if(zzdpc0.zzh() != null) {
            zzdpc0.zzh().setClickable(false);
            zzdpc0.zzh().removeAllViews();
        }
        if(zzdpc0.zzi() != null) {
            zzdpc0.zzi().zze(this.x);
        }
        this.t = null;
    }

    public final void zzA() {
        synchronized(this) {
            zzdpc zzdpc0 = this.t;
            if(zzdpc0 == null) {
                zzcfi.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                return;
            }
            zzdmy zzdmy0 = new zzdmy(this, zzdpc0 instanceof zzdob);
            this.i.execute(zzdmy0);
        }
    }

    public final void zzB() {
        synchronized(this) {
            if(this.v) {
                return;
            }
            this.k.zzq();
        }
    }

    public final void zzC(View view0) {
        IObjectWrapper iObjectWrapper0 = this.j.zzu();
        zzcli zzcli0 = this.j.zzq();
        if(this.m.zzd() && iObjectWrapper0 != null && zzcli0 != null && view0 != null) {
            zzt.zzh().zzc(iObjectWrapper0, view0);
        }
    }

    public final void zzD(View view0, MotionEvent motionEvent0, View view1) {
        synchronized(this) {
            this.k.zzr(view0, motionEvent0, view1);
        }
    }

    public final void zzE(Bundle bundle0) {
        synchronized(this) {
            this.k.zzs(bundle0);
        }
    }

    public final void zzF(View view0) {
        synchronized(this) {
            this.k.zzt(view0);
        }
    }

    public final void zzG() {
        synchronized(this) {
            this.k.zzu();
        }
    }

    public final void zzH(zzcq zzcq0) {
        synchronized(this) {
            this.k.zzv(zzcq0);
        }
    }

    public final void zzI(zzde zzde0) {
        synchronized(this) {
            this.C.zza(zzde0);
        }
    }

    public final void zzJ(zzbmv zzbmv0) {
        synchronized(this) {
            this.k.zzw(zzbmv0);
        }
    }

    public final void zzK(zzdpc zzdpc0) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbu)).booleanValue()) {
                zzdmz zzdmz0 = () -> synchronized(this) {
                    if(this.u) {
                        return;
                    }
                    this.t = zzdpc0;
                    this.l.zze(zzdpc0);
                    View view0 = zzdpc0.zzf();
                    Map map0 = zzdpc0.zzm();
                    Map map1 = zzdpc0.zzn();
                    this.k.zzx(view0, map0, map1, zzdpc0, zzdpc0);
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzcf)).booleanValue()) {
                        zzany zzany0 = this.y.zzc();
                        if(zzany0 != null) {
                            zzany0.zzn(zzdpc0.zzf());
                        }
                    }
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzbw)).booleanValue()) {
                        zzfbl zzfbl0 = this.b;
                        if(zzfbl0.zzam) {
                            Iterator iterator0 = zzfbl0.zzal.keys();
                            if(iterator0 != null) {
                                while(iterator0.hasNext()) {
                                    Object object0 = iterator0.next();
                                    String s = (String)object0;
                                    WeakReference weakReference0 = (WeakReference)this.t.zzl().get(s);
                                    this.D.put(s, Boolean.FALSE);
                                    if(weakReference0 != null) {
                                        View view1 = (View)weakReference0.get();
                                        if(view1 != null) {
                                            zzbao zzbao0 = new zzbao(this.A, view1);
                                            this.E.add(zzbao0);
                                            zzbao0.zzc(new w4(this, s));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(zzdpc0.zzi() != null) {
                        zzdpc0.zzi().zzc(this.x);
                    }
                };
                zzs.zza.post(zzdmz0);
                return;
            }
            this.c(zzdpc0);
        }
    }

    public final void zzL(zzdpc zzdpc0) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbu)).booleanValue()) {
                zzdmv zzdmv0 = () -> {
                    View view0 = zzdpc0.zzf();
                    Map map0 = zzdpc0.zzl();
                    this.k.zzy(view0, map0);
                    if(zzdpc0.zzh() != null) {
                        zzdpc0.zzh().setClickable(false);
                        zzdpc0.zzh().removeAllViews();
                    }
                    if(zzdpc0.zzi() != null) {
                        zzdpc0.zzi().zze(this.x);
                    }
                    this.t = null;
                };
                zzs.zza.post(zzdmv0);
                return;
            }
            this.d(zzdpc0);
        }
    }

    public final boolean zzM() {
        return this.m.zze();
    }

    public final boolean zzN() {
        synchronized(this) {
            return this.k.zzz();
        }
    }

    public final boolean zzO() {
        return this.m.zzd();
    }

    public static boolean zzP(View view0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzib)).booleanValue()) {
            long v = zzs.zzt(view0);
            return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), null) && v >= ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic))))));
        }
        return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzQ(Bundle bundle0) {
        synchronized(this) {
            if(this.v) {
                return true;
            }
            boolean z = this.k.zzA(bundle0);
            this.v = z;
            return z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxx
    public final void zzV() {
        synchronized(this) {
            this.u = true;
            zzdna zzdna0 = new zzdna(this);
            this.i.execute(zzdna0);
            super.zzV();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        zzdmw zzdmw0 = () -> {
            try {
                zzdnh zzdnh0 = this.j;
                zzdnh zzdnh1 = this.j;
                int v = zzdnh0.zzc();
                zzdns zzdns0 = this.n;
                switch(v) {
                    case 1: {
                        if(zzdns0.zzb() != null) {
                            this.zzq("Google", true);
                            zzdns0.zzb().zze(((zzbls)this.o.zzb()));
                        }
                        break;
                    }
                    case 2: {
                        if(zzdns0.zza() != null) {
                            this.zzq("Google", true);
                            zzdns0.zza().zze(((zzblq)this.p.zzb()));
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if(zzdns0.zzd(zzdnh0.zzy()) != null) {
                            if(zzdnh1.zzr() != null) {
                                this.zzq("Google", true);
                            }
                            zzdns0.zzd(zzdnh1.zzy()).zze(((zzblv)this.s.zzb()));
                            return;
                        }
                        break;
                    }
                    case 6: {
                        if(zzdns0.zzf() != null) {
                            this.zzq("Google", true);
                            zzdns0.zzf().zze(((zzbmy)this.q.zzb()));
                            return;
                        }
                        break;
                    }
                    case 7: {
                        if(zzdns0.zzg() != null) {
                            zzdns0.zzg().zzg(((zzbqv)this.r.zzb()));
                            return;
                        }
                        break;
                    }
                    default: {
                        zzcfi.zzg("Wrong native template id!");
                        return;
                    }
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzcfi.zzh("RemoteException when notifyAdLoad is called", remoteException0);
        };
        Executor executor0 = this.i;
        executor0.execute(zzdmw0);
        if(this.j.zzc() != 7) {
            this.k.getClass();
            executor0.execute(new zzdmx(this.k));
        }
        super.zzW();
    }

    public final zzdne zza() {
        return this.B;
    }

    // 去混淆评级： 低(20)
    public final String zzd() {
        return "";
    }

    public final JSONObject zzf(View view0, Map map0, Map map1) {
        synchronized(this) {
            return this.k.zzd(view0, map0, map1);
        }
    }

    public final JSONObject zzg(View view0, Map map0, Map map1) {
        synchronized(this) {
            return this.k.zze(view0, map0, map1);
        }
    }

    public final void zzi(View view0) {
        IObjectWrapper iObjectWrapper0 = this.j.zzu();
        if(this.m.zzd() && iObjectWrapper0 != null && view0 != null && ((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(object0 instanceof zzfin) {
                ((zzfin)object0).zzb(view0, zzfit.zzc, "Ad overlay");
            }
        }
    }

    public final void zzk() {
        synchronized(this) {
            this.k.zzg();
        }
    }

    public final void zzq(String s, boolean z) {
        zzbxr zzbxr0;
        zzbxq zzbxq0;
        String s2;
        String s1;
        zzdnm zzdnm0 = this.m;
        if(zzdnm0.zzd() && !TextUtils.isEmpty(s)) {
            int v = 0;
            zzdnh zzdnh0 = this.j;
            zzcli zzcli0 = zzdnh0.zzq();
            zzcli zzcli1 = zzdnh0.zzr();
            if(zzcli0 == null && zzcli1 == null) {
                zzcfi.zzj("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z1 = zzcli1 != null;
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzef)).booleanValue()) {
                zzdnm0.zza();
                int v1 = zzdnm0.zza().zzb();
                switch(v1 - 1) {
                    case 0: {
                        if(zzcli1 != null) {
                            z1 = true;
                            break;
                        }
                        zzcfi.zzj("Omid media type was video but there was no video webview.");
                        return;
                    }
                    case 1: {
                        if(zzcli0 != null) {
                            v = 1;
                            z1 = false;
                            break;
                        }
                        zzcfi.zzj("Omid media type was display but there was no display webview.");
                        return;
                    }
                    default: {
                        switch(v1) {
                            case 1: {
                                s1 = "VIDEO";
                                break;
                            }
                            case 2: {
                                s1 = "DISPLAY";
                                break;
                            }
                            default: {
                                s1 = "UNKNOWN";
                            }
                        }
                        zzcfi.zzj(("Unknown omid media type: " + s1 + ". Not initializing Omid."));
                        return;
                    }
                }
            }
            else {
                v = zzcli0 == null ? 0 : 1;
            }
            if(v == 0) {
                s2 = "javascript";
                zzcli0 = zzcli1;
            }
            else {
                s2 = null;
            }
            zzcli0.zzI();
            if(!zzt.zzh().zze(this.A)) {
                zzcfi.zzj("Failed to initialize omid in InternalNativeAd");
                return;
            }
            String s3 = this.z.zzb + "." + this.z.zzc;
            if(z1) {
                zzbxq0 = zzbxq.zzc;
                zzbxr0 = zzbxr.zzb;
            }
            else {
                zzbxq0 = zzbxq.zzb;
                zzbxr0 = zzdnh0.zzc() == 3 ? zzbxr.zzd : zzbxr.zzc;
            }
            IObjectWrapper iObjectWrapper0 = zzt.zzh().zzb(s3, zzcli0.zzI(), "", "javascript", s2, s, zzbxr0, zzbxq0, this.b.zzan);
            if(iObjectWrapper0 == null) {
                zzcfi.zzj("Failed to create omid session in InternalNativeAd");
                return;
            }
            zzdnh0.zzaa(iObjectWrapper0);
            zzcli0.zzar(iObjectWrapper0);
            if(z1) {
                zzt.zzh().zzc(iObjectWrapper0, zzcli1.zzH());
                this.w = true;
            }
            if(z) {
                zzt.zzh().zzd(iObjectWrapper0);
                zzcli0.zzd("onSdkLoaded", new b());  // 初始化器: Lp/k;-><init>()V
            }
        }
    }

    public final void zzv(View view0, Map map0, Map map1, boolean z) {
        synchronized(this) {
            if(this.v) {
                return;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbw)).booleanValue() && this.b.zzam) {
                for(Object object0: this.D.keySet()) {
                    if(!((Boolean)this.D.get(((String)object0))).booleanValue()) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(!z) {
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzcV)).booleanValue() && map0 != null) {
                    for(Object object1: map0.entrySet()) {
                        View view1 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                        if(view1 != null && zzdnc.zzP(view1)) {
                            this.b(view0, map0, map1);
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            View view2 = this.a(map0);
            if(view2 == null) {
                this.b(view0, map0, map1);
                return;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcW)).booleanValue()) {
                if(zzdnc.zzP(view2)) {
                    this.b(view0, map0, map1);
                    return;
                }
                return;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcX)).booleanValue()) {
                Rect rect0 = new Rect();
                if(view2.getGlobalVisibleRect(rect0, null) && view2.getHeight() == rect0.height() && view2.getWidth() == rect0.width()) {
                    this.b(view0, map0, map1);
                    return;
                }
                return;
            }
            this.b(view0, map0, map1);
        }
    }

    public final void zzw(zzcu zzcu0) {
        synchronized(this) {
            this.k.zzi(zzcu0);
        }
    }

    public final void zzx(View view0, View view1, Map map0, Map map1, boolean z) {
        synchronized(this) {
            this.l.zzc(this.t);
            this.k.zzj(view0, view1, map0, map1, z);
            if(this.w) {
                zzdnh zzdnh0 = this.j;
                if(zzdnh0.zzr() != null) {
                    zzdnh0.zzr().zzd("onSdkAdUserInteractionClick", new b());  // 初始化器: Lp/k;-><init>()V
                }
            }
        }
    }

    public final void zzy(String s) {
        synchronized(this) {
            this.k.zzk(s);
        }
    }

    public final void zzz(Bundle bundle0) {
        synchronized(this) {
            this.k.zzl(bundle0);
        }
    }
}

