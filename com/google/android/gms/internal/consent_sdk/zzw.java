package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import d1.i;
import d1.j;
import d1.k;

public final class zzw implements zzch {
    public final zzcl i;
    public final zzcl j;
    public final zzcl k;
    public final zzcl l;
    public final zzcl m;
    public final zzcl n;
    public final zzcl o;
    public final zzcl p;
    public final zzcl q;

    public zzw(zzcl zzcl0, zzcl zzcl1, zzcl zzcl2, zzcl zzcl3, zzcl zzcl4, zzcl zzcl5, zzcl zzcl6, zzcl zzcl7, zzcl zzcl8) {
        this.i = zzcl0;
        this.j = zzcl1;
        this.k = zzcl2;
        this.l = zzcl3;
        this.m = zzcl4;
        this.n = zzcl5;
        this.o = zzcl6;
        this.p = zzcl7;
        this.q = zzcl8;
    }

    public final j zza() {
        Object object0 = this.i.zzb();
        zzac zzac0 = (zzac)this.j.zzb();
        zzck.zza(zzcd.zza);
        zzck.zza(zzcd.zzb);
        Object object1 = this.m.zzb();
        Object object2 = this.n.zzb();
        i i0 = ((zzp)this.o).zza();
        k k0 = ((zzab)this.p).zza();
        Object object3 = this.q.zzb();
        return new j(((Application)object0), zzcd.zza, zzcd.zzb, ((zzam)object1), ((zzba)object2), i0, k0, ((zzh)object3));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        return this.zza();
    }
}

