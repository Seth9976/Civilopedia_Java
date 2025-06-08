package com.google.android.gms.ads.admanager;

import com.google.android.gms.internal.ads.zzbyy;

public final class zzb implements Runnable {
    public final AdManagerAdView zza;
    public final AdManagerAdRequest zzb;

    public zzb(AdManagerAdView adManagerAdView0, AdManagerAdRequest adManagerAdRequest0) {
        this.zza = adManagerAdView0;
        this.zzb = adManagerAdRequest0;
    }

    @Override
    public final void run() {
        AdManagerAdView adManagerAdView0 = this.zza;
        adManagerAdView0.getClass();
        try {
            adManagerAdView0.i.zzm(this.zzb.zza());
        }
        catch(IllegalStateException illegalStateException0) {
            zzbyy.zza(adManagerAdView0.getContext()).zzd(illegalStateException0, "AdManagerAdView.loadAd");
        }
    }
}

