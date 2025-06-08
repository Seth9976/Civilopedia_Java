package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbcb extends zzbci {
    public final AppOpenAdLoadCallback i;
    public final String j;

    public zzbcb(AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0, String s) {
        this.i = appOpenAd$AppOpenAdLoadCallback0;
        this.j = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzb(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzc(zze zze0) {
        AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0 = this.i;
        if(appOpenAd$AppOpenAdLoadCallback0 != null) {
            appOpenAd$AppOpenAdLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzd(zzbcg zzbcg0) {
        AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0 = this.i;
        if(appOpenAd$AppOpenAdLoadCallback0 != null) {
            appOpenAd$AppOpenAdLoadCallback0.onAdLoaded(new zzbcc(zzbcg0, this.j));
        }
    }
}

