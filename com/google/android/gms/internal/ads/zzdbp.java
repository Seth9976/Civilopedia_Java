package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdbp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdbp(zzdbo zzdbo0, zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object object0 = this.a.zzb();
        zzcfo zzcfo0 = ((zzcnv)this.b).zza();
        zzfbl zzfbl0 = ((zzcyn)this.c).zza();
        zzccf zzccf0 = new zzccf();
        return zzfbl0.zzB != null ? new zzcce(((Context)object0), zzcfo0, zzfbl0.zzB, zzfbl0.zzt.zzb, zzccf0, null) : null;
    }
}

