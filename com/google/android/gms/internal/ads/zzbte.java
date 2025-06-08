package com.google.android.gms.internal.ads;

import f0.g;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbte implements zzbsq {
    public final zzbss a;
    public final zzbst b;
    public final zzbsm c;
    public final String d;

    public zzbte(zzbsm zzbsm0, String s, zzbst zzbst0, zzbss zzbss0) {
        this.c = zzbsm0;
        this.d = s;
        this.b = zzbst0;
        this.a = zzbss0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) throws Exception {
        return this.zzb(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsq
    public final zzfvl zzb(Object object0) {
        zzfvl zzfvl0 = new zzcga();
        zzbsg zzbsg0 = this.c.zzb(null);
        zzbsg0.zzi(new g(this, zzbsg0, object0, zzfvl0, 7, false), new Q(6, zzfvl0, zzbsg0));
        return zzfvl0;
    }
}

