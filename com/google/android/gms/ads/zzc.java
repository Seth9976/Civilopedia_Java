package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.internal.ads.zzbyy;

public final class zzc implements Runnable {
    public final BaseAdView zza;
    public final AdRequest zzb;

    public zzc(BaseAdView baseAdView0, AdRequest adRequest0) {
        this.zza = baseAdView0;
        this.zzb = adRequest0;
    }

    @Override
    public final void run() {
        BaseAdView baseAdView0;
        try {
            baseAdView0 = this.zza;
            zzdr zzdr0 = this.zzb.zza();
            baseAdView0.i.zzm(zzdr0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbyy.zza(baseAdView0.getContext()).zzd(illegalStateException0, "BaseAdView.loadAd");
        }
    }
}

