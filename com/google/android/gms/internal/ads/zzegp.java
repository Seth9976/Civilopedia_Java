package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzegp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzegp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzego zza() {
        return new zzego(((Context)this.a.zzb()), ((zzcws)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

