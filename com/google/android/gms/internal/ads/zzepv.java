package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzepv implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzepv(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzepq(((zzepl)this.a).zza(), 10000L, ((Clock)this.b.zzb()));
    }
}

