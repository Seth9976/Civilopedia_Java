package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbvb implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    public final zzbug a;
    public UnifiedNativeAdMapper b;
    public NativeCustomTemplateAd c;

    public zzbvb(zzbug zzbug0) {
        this.a = zzbug0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = this.b;
        if(this.c == null) {
            if(unifiedNativeAdMapper0 == null) {
                zzcfi.zzl("#007 Could not call remote method.", null);
                return;
            }
            if(!unifiedNativeAdMapper0.getOverrideClickHandling()) {
                zzcfi.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcfi.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error. " + v));
        try {
            this.a.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.a.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error " + v + "."));
        try {
            this.a.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.a.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error " + v + "."));
        try {
            this.a.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.a.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = this.b;
        if(this.c == null) {
            if(unifiedNativeAdMapper0 == null) {
                zzcfi.zzl("#007 Could not call remote method.", null);
                return;
            }
            if(!unifiedNativeAdMapper0.getOverrideImpressionRecording()) {
                zzcfi.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcfi.zze("Adapter called onAdImpression.");
        try {
            this.a.zzm();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter0, UnifiedNativeAdMapper unifiedNativeAdMapper0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdLoaded.");
        this.b = unifiedNativeAdMapper0;
        if(!(mediationNativeAdapter0 instanceof AdMobAdapter)) {
            VideoController videoController0 = new VideoController();
            videoController0.zzb(new zzbuq());
            if(unifiedNativeAdMapper0 != null && unifiedNativeAdMapper0.hasVideoContent()) {
                unifiedNativeAdMapper0.zze(videoController0);
            }
        }
        try {
            this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onVideoEnd.");
        try {
            this.a.zzv();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final NativeCustomTemplateAd zza() {
        return this.c;
    }

    public final UnifiedNativeAdMapper zzb() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter0, NativeCustomTemplateAd nativeCustomTemplateAd0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze(("Adapter called onAdLoaded with template id " + nativeCustomTemplateAd0.getCustomTemplateId()));
        this.c = nativeCustomTemplateAd0;
        try {
            this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzd(MediationBannerAdapter mediationBannerAdapter0, String s, String s1) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcfi.zze("Adapter called onAppEvent.");
        try {
            this.a.zzq(s, s1);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter0, NativeCustomTemplateAd nativeCustomTemplateAd0, String s) {
        if(nativeCustomTemplateAd0 instanceof zzblw) {
            try {
                zzblv zzblv0 = ((zzblw)nativeCustomTemplateAd0).zza();
                this.a.zzr(zzblv0, s);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
            return;
        }
        zzcfi.zzj("Unexpected native custom template ad type.");
    }
}

