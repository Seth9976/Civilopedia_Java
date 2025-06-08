package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class zzdci implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdci(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzdcf zzdcf0 = ((zzdch)this.a).zza();
        Set set0 = ((zzgrf)this.b).zzc();
        zzgrc.zzb(zzcfv.zza);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.d.zzb();
        return new zzdcg(zzdcf0, set0, zzcfv.zza, scheduledExecutorService0);
    }
}

