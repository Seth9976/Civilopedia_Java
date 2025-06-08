package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import d1.i;

public final class zzp implements zzch {
    public final zzcl i;
    public final zzcl j;
    public final zzcl k;

    public zzp(zzcl zzcl0, zzcl zzcl1, zzcl zzcl2) {
        this.i = zzcl0;
        this.j = zzcl1;
        this.k = zzcl2;
    }

    public final i zza() {
        Application application0 = (Application)this.i.zzb();
        ((zzc)this.j).zza();
        zzam zzam0 = (zzam)this.k.zzb();
        return new i();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        return this.zza();
    }
}

