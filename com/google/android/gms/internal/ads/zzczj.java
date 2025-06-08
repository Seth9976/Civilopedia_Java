package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzczj implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzczj(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Clock clock0 = (Clock)this.a.zzb();
        return ((zzcnx)this.b).zza().zzb(clock0, ((zzdbk)this.c).zza().zzf);
    }
}

