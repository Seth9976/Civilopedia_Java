package com.google.ads.mediation;

import J2.j;
import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import f2.g;

public final class d extends FullScreenContentCallback {
    public final int a;
    public final Object b;
    public final Object c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
        this.a = 0;
        super();
        this.b = abstractAdViewAdapter0;
        this.c = mediationInterstitialListener0;
    }

    public d(g g0, Activity activity0) {
        this.a = 1;
        this.b = g0;
        this.c = activity0;
        super();
    }

    private final void a() {
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        if(this.a != 0) {
            ((g)this.b).a = null;
            ((g)this.b).c = false;
            ((g)this.b).a(((Activity)this.c));
            return;
        }
        ((MediationInterstitialListener)this.c).onAdClosed(((AbstractAdViewAdapter)this.b));
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError0) {
        if(this.a != 1) {
            super.onAdFailedToShowFullScreenContent(adError0);
            return;
        }
        j.f(adError0, "adError");
        ((g)this.b).a = null;
        ((g)this.b).c = false;
        ((g)this.b).a(((Activity)this.c));
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        if(this.a != 0) {
            return;
        }
        ((MediationInterstitialListener)this.c).onAdOpened(((AbstractAdViewAdapter)this.b));
    }
}

