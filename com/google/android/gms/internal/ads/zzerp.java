package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class zzerp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzerp(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        Context context0 = ((zzcnl)this.b).zza();
        Set set0 = (Set)this.c.zzb();
        return new zzern(zzcfv.zza, context0, set0);
    }
}

