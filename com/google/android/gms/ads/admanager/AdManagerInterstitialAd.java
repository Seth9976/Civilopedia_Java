package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzcex;

public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public abstract AppEventListener getAppEventListener();

    public static void load(Context context0, String s, AdManagerAdRequest adManagerAdRequest0, AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zzf.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zzc zzc0 = new zzc(context0, s, adManagerAdRequest0, adManagerInterstitialAdLoadCallback0);
            zzcex.zzb.execute(zzc0);
            return;
        }
        new zzbrc(context0, s).zza(adManagerAdRequest0.zza(), adManagerInterstitialAdLoadCallback0);
    }

    public abstract void setAppEventListener(AppEventListener arg1);
}

