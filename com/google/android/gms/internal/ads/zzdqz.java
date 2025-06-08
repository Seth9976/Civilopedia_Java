package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdqz {
    public final zzfcd a;
    public final Executor b;
    public final zzdtp c;
    public final zzdsk d;
    public final Context e;
    public final zzdwh f;
    public final zzfgp g;
    public final zzfii h;
    public final zzees i;

    public zzdqz(zzfcd zzfcd0, Executor executor0, zzdtp zzdtp0, Context context0, zzdwh zzdwh0, zzfgp zzfgp0, zzfii zzfii0, zzees zzees0, zzdsk zzdsk0) {
        this.a = zzfcd0;
        this.b = executor0;
        this.c = zzdtp0;
        this.e = context0;
        this.f = zzdwh0;
        this.g = zzfgp0;
        this.h = zzfii0;
        this.i = zzees0;
        this.d = zzdsk0;
    }

    public final void a(zzcli zzcli0) {
        zzdqz.b(zzcli0);
        zzcli0.zzaf("/video", zzbol.zzl);
        zzcli0.zzaf("/videoMeta", zzbol.zzm);
        zzcli0.zzaf("/precache", new zzcjv());
        zzcli0.zzaf("/delayPageLoaded", zzbol.zzp);
        zzcli0.zzaf("/instrument", zzbol.zzn);
        zzcli0.zzaf("/log", zzbol.zzg);
        zzcli0.zzaf("/click", zzbol.zza(null));
        if(this.a.zzb == null) {
            zzcli0.zzP().zzC(false);
        }
        else {
            zzcli0.zzP().zzC(true);
            zzcli0.zzaf("/open", new zzbox(null, null, null, null, null));
        }
        if(zzt.zzn().zzu(zzcli0.getContext())) {
            zzcli0.zzaf("/logScionEvent", new zzbos(zzcli0.getContext()));
        }
    }

    public static final void b(zzcli zzcli0) {
        zzcli0.zzaf("/videoClicked", zzbol.zzh);
        zzcli0.zzP().zzE(true);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zzcli0.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zzcli0.zzaf("/getNativeClickMeta", zzbol.zzt);
    }

    public final zzfvl zza(JSONObject jSONObject0) {
        return zzfvc.zzn(zzfvc.zzn(zzfvc.zzi(null), new zzdqp(this), this.b), new zzdqq(this, jSONObject0), this.b);
    }

    public final zzfvl zzb(String s, String s1, zzfbl zzfbl0, zzfbo zzfbo0, zzq zzq0) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzdqs(this, zzq0, zzfbl0, zzfbo0, s, s1), this.b);
    }
}

