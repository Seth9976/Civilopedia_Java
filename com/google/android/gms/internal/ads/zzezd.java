package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzezd implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzezd(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    public final zzeza zza() {
        return zzezc.a(((Context)this.a.zzb()), ((zzfdk)this.b.zzb()), ((zzfec)this.c.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

