package com.google.android.gms.internal.ads;

public final class zzcrv implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzcrv(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzbtp zzbtp0 = new zzbtp();
        String s = (String)this.b.zzb();
        return ((Boolean)zzbjq.zza.zze()).booleanValue() ? new zzbto(zzbtp0, s) : new zzcfn(s);
    }
}

