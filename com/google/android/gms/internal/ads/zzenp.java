package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzenp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzenp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzenn(((Clock)this.a.zzb()), ((zzdbk)this.b).zza());
    }
}

