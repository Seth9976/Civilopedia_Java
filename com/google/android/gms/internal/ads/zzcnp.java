package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

public final class zzcnp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzcnp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzeda zzeda0 = (zzeda)this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        Set set0 = !((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() || !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? Collections.emptySet() : Collections.singleton(new zzdiz(zzeda0, zzcfv.zza));
        zzgrc.zzb(set0);
        return set0;
    }
}

