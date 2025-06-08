package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;

public final class e extends AdListener implements OnCustomClickListener, OnCustomTemplateAdLoadedListener, OnUnifiedNativeAdLoadedListener {
    public final AbstractAdViewAdapter i;
    public final MediationNativeListener j;

    public e(AbstractAdViewAdapter abstractAdViewAdapter0, MediationNativeListener mediationNativeListener0) {
        this.i = abstractAdViewAdapter0;
        this.j = mediationNativeListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.j.onAdClicked(this.i);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.j.onAdClosed(this.i);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.j.onAdFailedToLoad(this.i, loadAdError0);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.j.onAdImpression(this.i);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.j.onAdOpened(this.i);
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd0, String s) {
        this.j.zze(this.i, nativeCustomTemplateAd0, s);
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd0) {
        this.j.zzc(this.i, nativeCustomTemplateAd0);
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd0) {
        a a0 = new a();  // 初始化器: Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;-><init>()V
        a0.setHeadline(unifiedNativeAd0.getHeadline());
        a0.setImages(unifiedNativeAd0.getImages());
        a0.setBody(unifiedNativeAd0.getBody());
        a0.setIcon(unifiedNativeAd0.getIcon());
        a0.setCallToAction(unifiedNativeAd0.getCallToAction());
        a0.setAdvertiser(unifiedNativeAd0.getAdvertiser());
        a0.setStarRating(unifiedNativeAd0.getStarRating());
        a0.setStore(unifiedNativeAd0.getStore());
        a0.setPrice(unifiedNativeAd0.getPrice());
        a0.zzd(unifiedNativeAd0.zza());
        a0.setOverrideImpressionRecording(true);
        a0.setOverrideClickHandling(true);
        a0.zze(unifiedNativeAd0.getVideoController());
        this.j.onAdLoaded(this.i, a0);
    }
}

