package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

public class zzax extends AdListener {
    public final Object i;
    public AdListener j;

    public zzax() {
        this.i = new Object();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdClosed();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError0) {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdFailedToLoad(loadAdError0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdImpression();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdLoaded();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized(this.i) {
            AdListener adListener0 = this.j;
            if(adListener0 != null) {
                adListener0.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener0) {
        synchronized(this.i) {
            this.j = adListener0;
        }
    }
}

