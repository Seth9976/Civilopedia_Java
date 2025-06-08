package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzdwt implements zzgqu {
    public final zzgrh a;

    public zzdwt(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdws(((Clock)this.a.zzb()));
    }
}

