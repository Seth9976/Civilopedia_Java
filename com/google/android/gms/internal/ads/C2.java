package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

public final class c2 implements MediationAdLoadCallback {
    public final int i;
    public final zzbug j;
    public final zzbuz k;

    public c2(zzbuz zzbuz0, zzbug zzbug0, int v) {
        this.i = v;
        this.k = zzbuz0;
        this.j = zzbug0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        switch(this.i) {
            case 0: {
                try {
                    zzcfi.zze((this.k.i.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
                    zze zze1 = adError0.zza();
                    this.j.zzh(zze1);
                    int v2 = adError0.getCode();
                    this.j.zzi(v2, adError0.getMessage());
                    int v3 = adError0.getCode();
                    this.j.zzg(v3);
                }
                catch(RemoteException remoteException1) {
                    zzcfi.zzh("", remoteException1);
                }
                return;
            }
            case 1: {
                try {
                    zzcfi.zze((this.k.i.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
                    zze zze2 = adError0.zza();
                    this.j.zzh(zze2);
                    int v4 = adError0.getCode();
                    this.j.zzi(v4, adError0.getMessage());
                    int v5 = adError0.getCode();
                    this.j.zzg(v5);
                }
                catch(RemoteException remoteException2) {
                    zzcfi.zzh("", remoteException2);
                }
                return;
            }
            case 2: {
                try {
                    zzcfi.zze((this.k.i.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
                    zze zze3 = adError0.zza();
                    this.j.zzh(zze3);
                    int v6 = adError0.getCode();
                    this.j.zzi(v6, adError0.getMessage());
                    int v7 = adError0.getCode();
                    this.j.zzg(v7);
                }
                catch(RemoteException remoteException3) {
                    zzcfi.zzh("", remoteException3);
                }
                return;
            }
            default: {
                try {
                    zzcfi.zze((this.k.i.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
                    zze zze0 = adError0.zza();
                    this.j.zzh(zze0);
                    int v = adError0.getCode();
                    this.j.zzi(v, adError0.getMessage());
                    int v1 = adError0.getCode();
                    this.j.zzg(v1);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        switch(this.i) {
            case 0: {
                this.onFailure(new AdError(0, s, "undefined"));
                return;
            }
            case 1: {
                this.onFailure(new AdError(0, s, "undefined"));
                return;
            }
            case 2: {
                this.onFailure(new AdError(0, s, "undefined"));
                return;
            }
            default: {
                try {
                    zzcfi.zze((this.k.i.getClass().getCanonicalName() + "failed to loaded mediation ad: " + s));
                    this.j.zzi(0, s);
                    this.j.zzg(0);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object object0) {
        switch(this.i) {
            case 0: {
                zzbug zzbug1 = this.j;
                MediationBannerAd mediationBannerAd0 = (MediationBannerAd)object0;
                try {
                    this.k.m = mediationBannerAd0.getView();
                    zzbug1.zzo();
                    return new zzbur(zzbug1);
                }
                catch(RemoteException remoteException1) {
                    zzcfi.zzh("", remoteException1);
                    return new zzbur(zzbug1);
                }
            }
            case 1: {
                zzbug zzbug2 = this.j;
                MediationInterstitialAd mediationInterstitialAd0 = (MediationInterstitialAd)object0;
                try {
                    this.k.n = mediationInterstitialAd0;
                    zzbug2.zzo();
                    return new zzbur(zzbug2);
                }
                catch(RemoteException remoteException2) {
                    zzcfi.zzh("", remoteException2);
                    return new zzbur(zzbug2);
                }
            }
            case 2: {
                zzbug zzbug3 = this.j;
                UnifiedNativeAdMapper unifiedNativeAdMapper0 = (UnifiedNativeAdMapper)object0;
                try {
                    this.k.o = unifiedNativeAdMapper0;
                    zzbug3.zzo();
                    return new zzbur(zzbug3);
                }
                catch(RemoteException remoteException3) {
                    zzcfi.zzh("", remoteException3);
                    return new zzbur(zzbug3);
                }
            }
            default: {
                zzbug zzbug0 = this.j;
                MediationRewardedAd mediationRewardedAd0 = (MediationRewardedAd)object0;
                try {
                    this.k.p = mediationRewardedAd0;
                    zzbug0.zzo();
                    return new zzcbu(zzbug0);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("", remoteException0);
                    return new zzcbu(zzbug0);
                }
            }
        }
    }
}

