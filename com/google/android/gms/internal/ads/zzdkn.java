package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdkn implements zzgqu {
    public final zzdkd a;
    public final zzgrh b;

    public zzdkn(zzdkd zzdkd0, zzgrh zzgrh0) {
        this.a = zzdkd0;
        this.b = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzdat zzdat0 = (zzdat)this.b.zzb();
        Set set0 = this.a.zzf(zzdat0);
        zzgrc.zzb(set0);
        return set0;
    }
}

