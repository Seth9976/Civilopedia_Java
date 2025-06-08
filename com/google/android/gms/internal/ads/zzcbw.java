package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

public final class zzcbw extends zzcbg {
    public FullScreenContentCallback i;
    public OnUserEarnedRewardListener j;

    public final void zzb(FullScreenContentCallback fullScreenContentCallback0) {
        this.i = fullScreenContentCallback0;
    }

    public final void zzc(OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.j = onUserEarnedRewardListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzh(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzi(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback0 = this.i;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzk(zzcbb zzcbb0) {
        OnUserEarnedRewardListener onUserEarnedRewardListener0 = this.j;
        if(onUserEarnedRewardListener0 != null) {
            onUserEarnedRewardListener0.onUserEarnedReward(new zzcbo(zzcbb0));
        }
    }
}

