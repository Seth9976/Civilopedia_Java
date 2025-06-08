package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;

public final class zzbxh extends zzbmo {
    public final OnNativeAdLoadedListener i;

    public zzbxh(OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
        this.i = nativeAd$OnNativeAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmp
    public final void zze(zzbmy zzbmy0) {
        zzbxa zzbxa0 = new zzbxa(zzbmy0);
        this.i.onNativeAdLoaded(zzbxa0);
    }
}

