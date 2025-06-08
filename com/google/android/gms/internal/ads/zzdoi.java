package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

public final class zzdoi implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;
    public final zzgrh i;

    public zzdoi(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
        this.i = zzgrh8;
    }

    public final zzdoh zza() {
        zzg zzg0 = ((zzcnj)this.a).zza();
        zzfcd zzfcd0 = ((zzdbk)this.b).zza();
        Object object0 = this.c.zzb();
        zzdnh zzdnh0 = ((zzdoa)this.d).zza();
        Object object1 = this.e.zzb();
        Object object2 = this.f.zzb();
        Object object3 = this.g.zzb();
        zzgrc.zzb(zzcfv.zza);
        Object object4 = this.i.zzb();
        return new zzdoh(zzg0, zzfcd0, ((zzdnm)object0), zzdnh0, ((zzdos)object1), ((zzdpa)object2), ((Executor)object3), zzcfv.zza, ((zzdne)object4));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

