package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdau implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdau(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzdcl zzdcl0 = (zzdcl)this.a.zzb();
        zzfbl zzfbl0 = ((zzcyn)this.b).zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.c.zzb();
        zzgrc.zzb(zzcfv.zza);
        return new zzdat(zzdcl0, zzfbl0, scheduledExecutorService0, zzcfv.zza);
    }
}

