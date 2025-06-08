package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfgk implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzfgk(zzfgj zzfgj0, zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = ((zzcnl)this.a).zza();
        zzcfo zzcfo0 = ((zzcnv)this.b).zza();
        zzfhu zzfhu0 = (zzfhu)this.c.zzb();
        zzbta zzbta0 = new zzbsr().zza(context0, zzcfo0, zzfhu0);
        zzgrc.zzb(zzbta0);
        return zzbta0;
    }
}

