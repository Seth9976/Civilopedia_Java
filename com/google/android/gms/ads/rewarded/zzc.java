package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcbn;

public final class zzc implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final RewardedAdLoadCallback zzd;

    public zzc(Context context0, String s, AdRequest adRequest0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = rewardedAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzcbn(context0, this.zzb).zza(this.zzc.zza(), this.zzd);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbyy.zza(context0).zzd(illegalStateException0, "RewardedAd.load");
        }
    }
}

