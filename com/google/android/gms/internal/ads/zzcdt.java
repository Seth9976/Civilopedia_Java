package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcdt implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzcdt(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new z2(((Context)this.a.zzb()), ((zzccq)this.b).zza());
    }
}

