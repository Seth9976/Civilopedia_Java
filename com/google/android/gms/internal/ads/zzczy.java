package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzczy implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzczy(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzdvq zzdvq0 = (zzdvq)this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        zzecw zzecw0 = (zzecw)this.c.zzb();
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? new zzdiz(zzecw0, zzcfv.zza) : new zzdiz(zzdvq0, zzcfv.zza);
    }
}

