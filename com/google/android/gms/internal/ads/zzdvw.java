package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzdvw implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzdvw(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzdvs zzdvs0 = (zzdvs)this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        zzecy zzecy0 = (zzecy)this.c.zzb();
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? new zzdiz(zzecy0, zzcfv.zza) : new zzdiz(zzdvs0, zzcfv.zza);
    }
}

