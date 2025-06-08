package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzecy implements zzdbw, zzddh, zzdeo {
    public final zzfgo i;
    public final zzfgp j;
    public final zzcev k;

    public zzecy(zzfgo zzfgo0, zzfgp zzfgp0, zzcev zzcev0) {
        this.i = zzfgo0;
        this.j = zzfgp0;
        this.k = zzcev0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        this.i.zza("action", "ftl");
        this.i.zza("ftl", String.valueOf(zze0.zza));
        this.i.zza("ed", zze0.zzc);
        this.j.zzb(this.i);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        this.i.zzh(zzfbx0, this.k);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
        this.i.zzi(zzbzv0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.i.zza("action", "loaded");
        this.j.zzb(this.i);
    }
}

