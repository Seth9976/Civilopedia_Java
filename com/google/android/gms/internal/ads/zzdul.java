package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdul implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzdul(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = ((zzcnl)this.a).zza();
        String s = ((zzead)this.b).zza();
        zzcfo zzcfo0 = ((zzcnv)this.c).zza();
        zzbdw zzbdw0 = (zzbdw)this.d.zzb();
        String s1 = (String)this.e.zzb();
        zzbdm zzbdm0 = new zzbdm(new zzbds(context0));
        zzbgl zzbgl0 = zzbgm.zza();
        zzbgl0.zza(zzcfo0.zzb);
        zzbgl0.zzc(zzcfo0.zzc);
        zzbgl0.zzb((zzcfo0.zzd ? 0 : 2));
        zzbdm0.zzb(new zzduk(zzbdw0, s, ((zzbgm)zzbgl0.zzal()), s1));
        return zzbdm0;
    }
}

