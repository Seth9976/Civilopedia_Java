package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

public final class zzczk implements zza, zzdbt, zzdcn, zzddh, zzdeo, zzdgz {
    public final Clock i;
    public final zzcek j;

    public zzczk(Clock clock0, zzcek zzcek0) {
        this.i = clock0;
        this.j = zzcek0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.j.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        long v = this.i.elapsedRealtime();
        this.j.zzk(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    public final String zzc() {
        return this.j.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzd() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zze(zzbeh zzbeh0) {
        this.j.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzf(zzbeh zzbeh0) {
    }

    public final void zzg(zzl zzl0) {
        this.j.zzj(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzh(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzi(zzbeh zzbeh0) {
        this.j.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.j.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        this.j.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.j.zzh(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcal0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}

