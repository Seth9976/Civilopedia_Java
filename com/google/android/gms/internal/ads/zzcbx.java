package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public final class zzcbx extends zzcbk {
    public final RewardedInterstitialAdLoadCallback i;
    public final zzcby j;

    public zzcbx(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0, zzcby zzcby0) {
        this.i = rewardedInterstitialAdLoadCallback0;
        this.j = zzcby0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(zze zze0) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.i;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            rewardedInterstitialAdLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.i;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            zzcby zzcby0 = this.j;
            if(zzcby0 != null) {
                rewardedInterstitialAdLoadCallback0.onAdLoaded(zzcby0);
            }
        }
    }
}

