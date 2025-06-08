package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

public final class zzaz extends zzcf {
    public final FullScreenContentCallback i;

    public zzaz(FullScreenContentCallback fullScreenContentCallback0) {
        this.i = fullScreenContentCallback0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }
}

