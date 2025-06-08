package com.google.android.gms.internal.ads;

import C1.d;
import android.os.RemoteException;

public final class zzdxl {
    public final zzbph a;

    public zzdxl(zzbph zzbph0) {
        this.a = zzbph0;
    }

    public final void a(d d0) {
        String s = d.G(d0);
        zzcfi.zzi(("Dispatching AFMA event on publisher webview: " + s));
        this.a.zzb(s);
    }

    public final void zza() throws RemoteException {
        this.a(new d("initialize"));
    }

    public final void zzb(long v) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onAdClicked";
        String s = d.G(d0);
        this.a.zzb(s);
    }

    public final void zzc(long v) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onAdClosed";
        this.a(d0);
    }

    public final void zzd(long v, int v1) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onAdFailedToLoad";
        d0.l = v1;
        this.a(d0);
    }

    public final void zze(long v) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onAdLoaded";
        this.a(d0);
    }

    public final void zzf(long v) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onNativeAdObjectNotAvailable";
        this.a(d0);
    }

    public final void zzg(long v) throws RemoteException {
        d d0 = new d("interstitial");
        d0.i = v;
        d0.k = "onAdOpened";
        this.a(d0);
    }

    public final void zzh(long v) throws RemoteException {
        d d0 = new d("creation");
        d0.i = v;
        d0.k = "nativeObjectCreated";
        this.a(d0);
    }

    public final void zzi(long v) throws RemoteException {
        d d0 = new d("creation");
        d0.i = v;
        d0.k = "nativeObjectNotCreated";
        this.a(d0);
    }

    public final void zzj(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onAdClicked";
        this.a(d0);
    }

    public final void zzk(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onRewardedAdClosed";
        this.a(d0);
    }

    public final void zzl(long v, zzcbb zzcbb0) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onUserEarnedReward";
        d0.m = zzcbb0.zzf();
        d0.n = zzcbb0.zze();
        this.a(d0);
    }

    public final void zzm(long v, int v1) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onRewardedAdFailedToLoad";
        d0.l = v1;
        this.a(d0);
    }

    public final void zzn(long v, int v1) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onRewardedAdFailedToShow";
        d0.l = v1;
        this.a(d0);
    }

    public final void zzo(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onAdImpression";
        this.a(d0);
    }

    public final void zzp(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onRewardedAdLoaded";
        this.a(d0);
    }

    public final void zzq(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onNativeAdObjectNotAvailable";
        this.a(d0);
    }

    public final void zzr(long v) throws RemoteException {
        d d0 = new d("rewarded");
        d0.i = v;
        d0.k = "onRewardedAdOpened";
        this.a(d0);
    }
}

