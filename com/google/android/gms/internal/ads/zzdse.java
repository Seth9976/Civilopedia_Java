package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zza;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdse {
    public final A4 a;
    public final zza b;
    public final Context c;
    public final zzdwh d;
    public final zzfgp e;
    public final Executor f;
    public final zzaoc g;
    public final zzcfo h;
    public final zzbpa i;
    public final zzees j;
    public final zzfii k;
    public zzfvl l;

    public zzdse(zzdsb zzdsb0) {
        this.c = zzdsb0.b;
        this.f = zzdsb0.f;
        this.g = zzdsb0.g;
        this.h = zzdsb0.h;
        this.b = zzdsb0.a;
        this.a = new A4();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.i = new zzbpa();
        this.j = zzdsb0.e;
        this.k = zzdsb0.i;
        this.d = zzdsb0.c;
        this.e = zzdsb0.d;
    }

    public final zzfvl zzd(String s, JSONObject jSONObject0) {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            return zzfvl0 == null ? zzfvc.zzi(null) : zzfvc.zzn(zzfvl0, new zzdrq(this, s, jSONObject0), this.f);
        }
    }

    public final void zze(zzfbl zzfbl0, zzfbo zzfbo0) {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            if(zzfvl0 == null) {
                return;
            }
            zzfvc.zzr(zzfvl0, new Q(11, zzfbl0, zzfbo0), this.f);
        }
    }

    public final void zzf() {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            if(zzfvl0 == null) {
                return;
            }
            zzfvc.zzr(zzfvl0, new S(14), this.f);
            this.l = null;
        }
    }

    public final void zzg(String s, Map map0) {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            if(zzfvl0 == null) {
                return;
            }
            zzfvc.zzr(zzfvl0, new E9(map0, 18), this.f);
        }
    }

    public final void zzh() {
        synchronized(this) {
            Object object0 = zzay.zzc().zzb(zzbhz.zzcN);
            zzfvl zzfvl0 = zzfvc.zzm(zzfvc.zzl(new zzclr(this.c, this.g, this.h, this.b, ((String)object0)), zzcfv.zze), new zzdrr(this), this.f);
            this.l = zzfvl0;
            zzcfy.zza(zzfvl0, "NativeJavascriptExecutor.initializeEngine");
        }
    }

    public final void zzi(String s, zzbom zzbom0) {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            if(zzfvl0 == null) {
                return;
            }
            zzfvc.zzr(zzfvl0, new z4(s, zzbom0, 0), this.f);
        }
    }

    public final void zzj(WeakReference weakReference0, String s, zzbom zzbom0) {
        this.zzi(s, new B4(this, weakReference0, s, zzbom0));
    }

    public final void zzk(String s, zzbom zzbom0) {
        synchronized(this) {
            zzfvl zzfvl0 = this.l;
            if(zzfvl0 == null) {
                return;
            }
            zzfvc.zzr(zzfvl0, new z4(s, zzbom0, 1), this.f);
        }
    }
}

