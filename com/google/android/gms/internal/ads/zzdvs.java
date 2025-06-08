package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzdvs implements zzdbw, zzddh, zzdeo {
    public final zzdwc i;
    public final zzdwm j;

    public zzdvs(zzdwc zzdwc0, zzdwm zzdwm0) {
        this.i = zzdwc0;
        this.j = zzdwm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        this.i.zza().put("action", "ftl");
        this.i.zza().put("ftl", String.valueOf(zze0.zza));
        this.i.zza().put("ed", zze0.zzc);
        this.j.zze(this.i.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        this.i.zzb(zzfbx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
        this.i.zzc(zzbzv0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.i.zza().put("action", "loaded");
        this.j.zze(this.i.zza());
    }
}

