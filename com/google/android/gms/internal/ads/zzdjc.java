package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdjc implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdjc(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzdjb(((Context)this.a.zzb()), ((zzgrf)this.b).zzc(), ((zzcyn)this.c).zza());
    }
}

