package com.google.android.gms.internal.ads;

public final class zzvn {
    public final int zza;
    public final zzjv[] zzb;
    public final zzvg[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvn(zzjv[] arr_zzjv, zzvg[] arr_zzvg, zzct zzct0, Object object0) {
        this.zzb = arr_zzjv;
        this.zzc = (zzvg[])arr_zzvg.clone();
        this.zzd = zzct0;
        this.zze = object0;
        this.zza = arr_zzjv.length;
    }

    // 去混淆评级： 低(30)
    public final boolean zza(zzvn zzvn0, int v) {
        return zzvn0 == null ? false : zzeg.zzS(this.zzb[v], zzvn0.zzb[v]) && zzeg.zzS(this.zzc[v], zzvn0.zzc[v]);
    }

    public final boolean zzb(int v) {
        return this.zzb[v] != null;
    }
}

