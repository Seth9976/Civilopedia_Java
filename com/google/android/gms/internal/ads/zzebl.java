package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzebl implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzebl(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    public final zzebk zza() {
        Map map0 = ((zzgrb)this.a).zzd();
        zzgrc.zzb(zzcfv.zza);
        zzdem zzdem0 = ((zzden)this.c).zza();
        return new zzebk(map0, zzcfv.zza, zzdem0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

