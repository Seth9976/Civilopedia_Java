package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzccq implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzccq(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzccp zza() {
        return new zzccp(((Clock)this.a.zzb()), ((s2)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

