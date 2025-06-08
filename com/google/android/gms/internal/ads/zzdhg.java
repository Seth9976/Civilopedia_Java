package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdhg implements zzgqu {
    public final zzdhf a;
    public final zzgrh b;

    public zzdhg(zzdhf zzdhf0, zzgrh zzgrh0) {
        this.a = zzdhf0;
        this.b = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Set set0 = ((zzgrf)this.b).zzc();
        zzdbv zzdbv0 = this.a.zza(set0);
        zzgrc.zzb(zzdbv0);
        return zzdbv0;
    }
}

