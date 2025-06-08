package com.google.android.gms.internal.consent_sdk;

import C0.a;
import d1.e;
import java.util.concurrent.atomic.AtomicReference;
import m1.f;
import m1.g;

public final class zzba {
    public final zzcl a;
    public final AtomicReference b;

    public zzba(zzcl zzcl0) {
        this.b = new AtomicReference();
        this.a = zzcl0;
    }

    public final void zza(g g0, f f0) {
        zzcd.zza();
        zzbc zzbc0 = (zzbc)this.b.get();
        if(zzbc0 == null) {
            ((e)f0).a(new zzj(3, "No available form can be built.").zza());
            return;
        }
        Object object0 = this.a.zzb();
        ((zzas)object0).zza(zzbc0);
        zzay zzay0 = ((zzas)object0).zzb().zza();
        zzbg zzbg0 = ((zzbh)zzay0.d).zza();
        zzay0.f = zzbg0;
        zzbg0.setBackgroundColor(0);
        zzbg0.getSettings().setJavaScriptEnabled(true);
        zzbg0.setWebViewClient(new a(zzbg0, 1));
        e e0 = new e(g0, f0);
        zzay0.h.set(e0);
        zzay0.f.loadDataWithBaseURL(zzay0.c.zza(), zzay0.c.zzb(), "text/html", "UTF-8", null);
        zzau zzau0 = new zzau(zzay0);
        zzcd.zza.postDelayed(zzau0, 10000L);
    }

    public final void zzb(zzbc zzbc0) {
        this.b.set(zzbc0);
    }

    public final boolean zzc() {
        return this.b.get() != null;
    }
}

