package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzehp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzehp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzeho zza() {
        return new zzeho(((Context)this.a.zzb()), ((zzdky)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

