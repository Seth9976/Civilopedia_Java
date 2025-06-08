package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzesi implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;

    public zzesi(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        Object object0 = this.b.zzb();
        Object object1 = this.c.zzb();
        Object object2 = this.d.zzb();
        Object object3 = this.e.zzb();
        zzfcd zzfcd0 = ((zzdbk)this.f).zza();
        Object object4 = this.g.zzb();
        Object object5 = this.h.zzb();
        return new zzesg(zzcfv.zza, ((ScheduledExecutorService)object0), ((String)object1), ((zzele)object2), ((Context)object3), zzfcd0, ((zzela)object4), ((zzduc)object5));
    }
}

