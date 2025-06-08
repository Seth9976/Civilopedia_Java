package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

public final class zzczu implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzczu(zzczt zzczt0, zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzb(((Context)this.a.zzb()), ((zzccj)this.b.zzb()), null);
    }
}

