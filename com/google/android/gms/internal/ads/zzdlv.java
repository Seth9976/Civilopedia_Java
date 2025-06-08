package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzdlv implements zzgqu {
    public final zzgrh a;

    public zzdlv(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Set set0 = ((zzdls)this.a).zza().zze() == null ? Collections.emptySet() : Collections.singleton("banner");
        zzgrc.zzb(set0);
        return set0;
    }
}

