package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import d1.g;

public final class zzbn implements zzch {
    public final zzcl i;
    public final zzcl j;
    public final zzcl k;
    public final zzcl l;
    public final zzcl m;
    public final zzcl n;
    public final zzcl o;
    public final zzcl p;

    public zzbn(zzcl zzcl0, zzcl zzcl1, zzcl zzcl2, zzcl zzcl3, zzcl zzcl4, zzcl zzcl5, zzcl zzcl6, zzcl zzcl7) {
        this.i = zzcl0;
        this.j = zzcl1;
        this.k = zzcl2;
        this.l = zzcl3;
        this.m = zzcl4;
        this.n = zzcl5;
        this.o = zzcl6;
        this.p = zzcl7;
    }

    public final g zza() {
        Object object0 = this.i.zzb();
        Object object1 = this.j.zzb();
        zzck.zza(zzcd.zza);
        zzck.zza(zzcd.zzb);
        Object object2 = this.m.zzb();
        zzak zzak0 = ((zzal)this.n).zza();
        Object object3 = this.o.zzb();
        Object object4 = this.p.zzb();
        return new g(((Application)object0), ((zzbi)object1), zzcd.zza, zzcd.zzb, ((zzh)object2), zzak0, ((zzay)object3), ((zzam)object4));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        return this.zza();
    }
}

