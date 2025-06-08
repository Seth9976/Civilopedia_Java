package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

public final class zzenm implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzenm(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object object0 = this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        Context context0 = ((zzcnl)this.c).zza();
        zzfcd zzfcd0 = ((zzdbk)this.d).zza();
        ViewGroup viewGroup0 = ((zzcvt)this.e).zza();
        return new zzenk(((zzfvm)object0), zzcfv.zza, context0, zzfcd0, viewGroup0);
    }
}

