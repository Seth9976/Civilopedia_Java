package com.google.android.gms.internal.ads;

public final class zzcwu implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzcwu(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        boolean z = ((zzcxa)this.a).zza().booleanValue();
        zzeij zzeij0 = ((zzeik)this.b).zza();
        zzekd zzekd0 = ((zzeke)this.c).zza();
        return !z ? zzekd0 : zzeij0;
    }
}

