package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzekz implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzekz(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzeky zza() {
        return new zzeky(((Context)this.a.zzb()), ((zzdky)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

