package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

public final class zzdpr implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdpr(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzbo zzbo0 = (zzbo)this.a.zzb();
        Clock clock0 = (Clock)this.b.zzb();
        zzgrc.zzb(zzcfv.zza);
        return new zzdpq(zzbo0, clock0, zzcfv.zza);
    }
}

