package com.google.android.gms.internal.consent_sdk;

import D3.b;
import android.app.Application;
import d1.a;
import d1.c;

public final class zzaj extends zzd {
    public final zzaj b;
    public final zzch c;
    public final zzcl d;
    public final zzcl e;
    public final zzcl f;
    public final zzcl g;
    public final zzal h;
    public final zzcl i;

    public zzaj(Application application0) {
        this.b = this;
        zzch zzch0 = zzci.zza(application0);
        this.c = zzch0;
        zzcl zzcl0 = zzcg.zza(new zzan(zzch0));
        this.d = zzcl0;
        zzcl zzcl1 = zzcg.zza(a.a);
        this.e = zzcl1;
        zzcl zzcl2 = zzcg.zza(new zzbb(new b(this, 16)));
        this.f = zzcl2;
        zzp zzp0 = new zzp(zzch0, new zzc(zzch0), zzcl0);
        zzcl zzcl3 = zzcg.zza(new zzi(c.a));
        this.g = zzcl3;
        zzal zzal0 = new zzal(zzch0, zzcl0, c.a);
        this.h = zzal0;
        zzab zzab0 = new zzab(zzcl3, zzal0, zzcl0);
        this.i = zzcg.zza(new zzl(zzcl0, new zzw(zzch0, zzcl1, d1.b.a, c.a, zzcl0, zzcl2, zzp0, zzab0, zzcl3), zzcl2));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzd
    public final zzk zzb() {
        return (zzk)this.i.zzb();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzd
    public final zzba zzc() {
        return (zzba)this.f.zzb();
    }
}

