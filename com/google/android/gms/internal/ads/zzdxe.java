package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdxe implements zza, zzarc, zzdbt, zzdbw, zzdcn, zzdco, zzddh, zzdeo, zzfgg {
    public final List i;
    public final zzdws j;
    public long k;

    public zzdxe(zzdws zzdws0, zzcnf zzcnf0) {
        this.j = zzdws0;
        this.i = Collections.singletonList(zzcnf0);
    }

    public final void a(Class class0, String s, Object[] arr_object) {
        this.j.zza(this.i, "Event-" + class0.getSimpleName(), s, arr_object);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.a(zza.class, "onAdClicked", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        this.a(zzdbw.class, "onAdFailedToLoad", new Object[]{zze0.zza, zze0.zzb, zze0.zzc});
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
        this.k = zzt.zzA().elapsedRealtime();
        this.a(zzdeo.class, "onAdRequest", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffz0, String s) {
        this.a(zzffy.class, "onTaskCreated", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffz0, String s, Throwable throwable0) {
        Object[] arr_object = {s, throwable0.getClass().getSimpleName()};
        this.a(zzffy.class, "onTaskFailed", arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context0) {
        this.a(zzdco.class, "onDestroy", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context0) {
        this.a(zzdco.class, "onPause", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context0) {
        this.a(zzdco.class, "onResume", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzarc
    public final void zzbu(String s, String s1) {
        this.a(zzarc.class, "onAppEvent", new Object[]{s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        this.a(zzdbt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffz0, String s) {
        this.a(zzffy.class, "onTaskStarted", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffz0, String s) {
        this.a(zzffy.class, "onTaskSucceeded", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.a(zzdbt.class, "onAdClosed", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        this.a(zzdcn.class, "onAdImpression", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        this.a(zzdbt.class, "onAdLeftApplication", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zze.zza(("Ad Request Latency : " + (zzt.zzA().elapsedRealtime() - this.k)));
        this.a(zzddh.class, "onAdLoaded", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        this.a(zzdbt.class, "onAdOpened", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    @ParametersAreNonnullByDefault
    public final void zzp(zzcal zzcal0, String s, String s1) {
        this.a(zzdbt.class, "onRewarded", new Object[]{zzcal0, s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        this.a(zzdbt.class, "onRewardedVideoStarted", new Object[0]);
    }
}

