package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;

public final class zzdrr implements zzfok {
    public final zzdse zza;

    public zzdrr(zzdse zzdse0) {
        this.zza = zzdse0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        ((zzcli)object0).zzaf("/result", this.zza.i);
        zzcmv zzcmv0 = ((zzcli)object0).zzP();
        new zzb(this.zza.c, null, null);
        zzcmv0.zzL(null, this.zza.a, this.zza.a, this.zza.a, this.zza.a, false, null, null, null, null, this.zza.j, this.zza.k, this.zza.d, this.zza.e, null, null);
        return (zzcli)object0;
    }
}

