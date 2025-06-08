package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbcd extends zzbcm {
    public FullScreenContentCallback i;

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzd(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(FullScreenContentCallback fullScreenContentCallback0) {
        this.i = fullScreenContentCallback0;
    }
}

