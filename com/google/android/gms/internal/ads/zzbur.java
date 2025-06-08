package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbur implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback {
    public final zzbug i;

    public zzbur(zzbug zzbug0) {
        this.i = zzbug0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClosed.");
        try {
            this.i.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdFailedToShow.");
        zzcfi.zzj(("Mediation ad failed to show: Error Code = " + adError0.getCode() + ". Error Message = " + adError0.getMessage() + " Error Domain = " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.i.zzk(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String s) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdFailedToShow.");
        zzcfi.zzj(("Mediation ad failed to show: " + s));
        try {
            this.i.zzl(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLeftApplication.");
        try {
            this.i.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdOpened.");
        try {
            this.i.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onVideoComplete.");
        try {
            this.i.zzu();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onVideoPause.");
        try {
            this.i.zzw();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onVideoPlay.");
        try {
            this.i.zzx();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called reportAdClicked.");
        try {
            this.i.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called reportAdImpression.");
        try {
            this.i.zzm();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

