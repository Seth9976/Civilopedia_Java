package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzepw implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzepw(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        E5 e50 = ((zzeto)this.a).zza();
        Clock clock0 = (Clock)this.b.zzb();
        return new zzepq(e50, ((long)(((Long)zzbjf.zza.zze()))), clock0);
    }
}

