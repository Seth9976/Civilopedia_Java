package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

public final class zzh extends zzbh {
    public final AdLoadCallback i;
    public final Object j;

    public zzh(AdLoadCallback adLoadCallback0, Object object0) {
        this.i = adLoadCallback0;
        this.j = object0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb(zze zze0) {
        AdLoadCallback adLoadCallback0 = this.i;
        if(adLoadCallback0 != null) {
            adLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbi
    public final void zzc() {
        AdLoadCallback adLoadCallback0 = this.i;
        if(adLoadCallback0 != null) {
            Object object0 = this.j;
            if(object0 != null) {
                adLoadCallback0.onAdLoaded(object0);
            }
        }
    }
}

