package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzejd implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzejd(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzejc zza() {
        return new zzejc(((Context)this.a.zzb()), ((zzdsy)this.b.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

