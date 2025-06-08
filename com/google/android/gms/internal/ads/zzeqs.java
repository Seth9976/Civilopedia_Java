package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

public final class zzeqs implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzeqs(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        ViewGroup viewGroup0 = ((zzcvt)this.b).zza();
        Context context0 = (Context)this.c.zzb();
        Set set0 = ((zzgrf)this.d).zzc();
        return new zzeqq(zzcfv.zza, viewGroup0, context0, set0);
    }
}

