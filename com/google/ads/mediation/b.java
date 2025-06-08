package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

public final class b extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter i;
    public final MediationBannerListener j;

    public b(AbstractAdViewAdapter abstractAdViewAdapter0, MediationBannerListener mediationBannerListener0) {
        this.i = abstractAdViewAdapter0;
        this.j = mediationBannerListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
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
    public final void onAdLoaded() {
        this.j.onAdLoaded(this.i);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.j.onAdOpened(this.i);
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        this.j.zzd(this.i, s, s1);
    }
}

