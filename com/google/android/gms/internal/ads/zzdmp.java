package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

public final class zzdmp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzdmp(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = (Context)this.a.zzb();
        zzfbl zzfbl0 = ((zzcyn)this.b).zza();
        return new zzdjb(context0, new HashSet(), zzfbl0);
    }
}

