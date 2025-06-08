package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdax implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdax(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = (Context)this.a.zzb();
        return new k4(((zzcyn)this.b).zza());
    }
}

