package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcty {
    public final String a;
    public final zzbtj b;
    public final Executor c;
    public zzcud d;
    public final Y3 e;
    public final Z3 f;

    public zzcty(String s, zzbtj zzbtj0, Executor executor0) {
        this.e = new Y3(this);
        this.f = new Z3(this);
        this.a = s;
        this.b = zzbtj0;
        this.c = executor0;
    }

    public final void zzc(zzcud zzcud0) {
        this.b.zzb("/updateActiveView", this.e);
        this.b.zzb("/untrackActiveViewUnit", this.f);
        this.d = zzcud0;
    }

    public final void zzd(zzcli zzcli0) {
        zzcli0.zzaf("/updateActiveView", this.e);
        zzcli0.zzaf("/untrackActiveViewUnit", this.f);
    }

    public final void zze() {
        this.b.zzc("/updateActiveView", this.e);
        this.b.zzc("/untrackActiveViewUnit", this.f);
    }

    public final void zzf(zzcli zzcli0) {
        zzcli0.zzaw("/updateActiveView", this.e);
        zzcli0.zzaw("/untrackActiveViewUnit", this.f);
    }
}

