package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

public final class zzduw implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzduw(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        zzdvo zzdvo0 = ((zzdvp)this.b).zza();
        Set set0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzdV)).booleanValue() ? Collections.singleton(new zzdiz(zzdvo0, zzcfv.zza)) : Collections.emptySet();
        zzgrc.zzb(set0);
        return set0;
    }
}

