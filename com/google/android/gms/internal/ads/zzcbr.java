package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public final class zzcbr extends zzcbk {
    public final RewardedAdLoadCallback i;
    public final RewardedAd j;

    public zzcbr(RewardedAdLoadCallback rewardedAdLoadCallback0, RewardedAd rewardedAd0) {
        this.i = rewardedAdLoadCallback0;
        this.j = rewardedAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(zze zze0) {
        RewardedAdLoadCallback rewardedAdLoadCallback0 = this.i;
        if(rewardedAdLoadCallback0 != null) {
            rewardedAdLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback0 = this.i;
        if(rewardedAdLoadCallback0 != null) {
            rewardedAdLoadCallback0.onAdLoaded(this.j);
        }
    }
}

