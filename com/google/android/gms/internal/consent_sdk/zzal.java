package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzal implements zzch {
    public final zzcl i;
    public final zzcl j;
    public final zzcl k;

    public zzal(zzcl zzcl0, zzcl zzcl1, zzcl zzcl2) {
        this.i = zzcl0;
        this.j = zzcl1;
        this.k = zzcl2;
    }

    public final zzak zza() {
        Application application0 = (Application)this.i.zzb();
        zzam zzam0 = (zzam)this.j.zzb();
        zzck.zza(zzcd.zzb);
        return new zzak(application0, zzam0, zzcd.zzb);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        return this.zza();
    }
}

