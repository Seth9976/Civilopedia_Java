package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdlo implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzdlo(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Map map0 = ((zzgqy)this.a).zzd();
        Map map1 = ((zzgqy)this.b).zzd();
        Map map2 = ((zzgqy)this.c).zzd();
        zzdns zzdns0 = ((zzdls)this.e).zza();
        return new s4(map0, map1, map2, this.d, zzdns0);
    }
}

