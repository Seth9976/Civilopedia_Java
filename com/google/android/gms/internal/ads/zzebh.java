package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzebh implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzebh(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final Z4 zza() {
        Context context0 = ((zzcnl)this.a).zza();
        return new Z4(((zzcdn)this.b.zzb()), context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

