package com.google.android.gms.internal.consent_sdk;

import d1.g;

public final class zzbh implements zzch {
    public final zzcl i;
    public final zzcl j;
    public final zzcl k;

    public zzbh(zzcl zzcl0, zzcl zzcl1, zzcl zzcl2) {
        this.i = zzcl0;
        this.j = zzcl1;
        this.k = zzcl2;
    }

    public final zzbg zza() {
        zzbi zzbi0 = (zzbi)this.i.zzb();
        zzck.zza(zzcd.zza);
        g g0 = ((zzbn)this.k).zza();
        return new zzbg(zzbi0, zzcd.zza, g0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        return this.zza();
    }
}

