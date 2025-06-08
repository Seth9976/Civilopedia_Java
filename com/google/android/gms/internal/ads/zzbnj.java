package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;

public final class zzbnj extends zzbmo {
    public final OnUnifiedNativeAdLoadedListener i;

    public zzbnj(OnUnifiedNativeAdLoadedListener unifiedNativeAd$OnUnifiedNativeAdLoadedListener0) {
        this.i = unifiedNativeAd$OnUnifiedNativeAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmp
    public final void zze(zzbmy zzbmy0) {
        zzbmz zzbmz0 = new zzbmz(zzbmy0);
        this.i.onUnifiedNativeAdLoaded(zzbmz0);
    }
}

