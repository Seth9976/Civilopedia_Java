package com.google.android.gms.internal.ads;

public final class zzdsz implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdsz(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzfcd zzfcd0 = ((zzdbk)this.c).zza();
        int v = zzfcd0.zzo.zza - 1;
        if(zzfcd0.zzo.zza == 0) {
            throw null;
        }
        return v == 0 ? ((zzeke)this.a).zza() : ((zzeke)this.b).zza();
    }
}

