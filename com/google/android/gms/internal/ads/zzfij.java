package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfij implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzfij(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = ((zzcnl)this.a).zza();
        zzgrc.zzb(zzcfv.zza);
        zzcfn zzcfn0 = (zzcfn)this.c.zzb();
        zzfhu zzfhu0 = (zzfhu)this.d.zzb();
        return new zzfii(context0, zzcfv.zza, zzcfn0, zzfhu0);
    }
}

