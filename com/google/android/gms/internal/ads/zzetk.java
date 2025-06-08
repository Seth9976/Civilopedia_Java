package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class zzetk implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzetk(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    public final zzetj zza() {
        Context context0 = ((zzcnl)this.a).zza();
        zzgrc.zzb(zzcfv.zza);
        Set set0 = ((zzgrf)this.c).zzc();
        Object object0 = this.d.zzb();
        Object object1 = this.e.zzb();
        return new zzetj(context0, zzcfv.zza, set0, ((zzfhs)object0), ((zzdwh)object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

