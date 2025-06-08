package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

public final class u5 extends zzcav {
    public final zzddz i;
    public final zzdbr j;
    public final zzdda k;
    public final zzdjp l;

    public u5(zzddz zzddz0, zzdbr zzdbr0, zzdda zzdda0, zzdjp zzdjp0) {
        this.i = zzddz0;
        this.j = zzdbr0;
        this.k = zzdda0;
        this.l = zzdjp0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zze(IObjectWrapper iObjectWrapper0) {
        this.j.onAdClicked();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        this.i.zzf(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzh(IObjectWrapper iObjectWrapper0) {
        this.k.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzi(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.i.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzl(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzm(IObjectWrapper iObjectWrapper0, zzcax zzcax0) {
        this.l.zza(zzcax0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzn(IObjectWrapper iObjectWrapper0) {
        this.k.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        this.l.zzc();
    }
}

