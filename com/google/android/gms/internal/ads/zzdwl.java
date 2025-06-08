package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzdwl implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdwl(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdwk(((zzdwc)this.a.zzb()), ((zzgrf)this.b).zzc(), ((Clock)this.c.zzb()));
    }
}

