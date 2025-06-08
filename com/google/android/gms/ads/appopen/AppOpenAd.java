package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzcex;

public abstract class AppOpenAd {
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback {
    }

    public @interface AppOpenAdOrientation {
    }

    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public static void load(Context context0, String s, AdRequest adRequest0, @AppOpenAdOrientation int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zzd.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zzb zzb0 = new zzb(context0, s, adRequest0, v, appOpenAd$AppOpenAdLoadCallback0);
            zzcex.zzb.execute(zzb0);
            return;
        }
        new zzbco(context0, s, adRequest0.zza(), v, appOpenAd$AppOpenAdLoadCallback0).zza();
    }

    public static void load(Context context0, String s, AdManagerAdRequest adManagerAdRequest0, @AppOpenAdOrientation int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zzd.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zza zza0 = new zza(context0, s, adManagerAdRequest0, v, appOpenAd$AppOpenAdLoadCallback0);
            zzcex.zzb.execute(zza0);
            return;
        }
        new zzbco(context0, s, adManagerAdRequest0.zza(), v, appOpenAd$AppOpenAdLoadCallback0).zza();
    }

    public abstract void setFullScreenContentCallback(FullScreenContentCallback arg1);

    public abstract void setImmersiveMode(boolean arg1);

    public abstract void setOnPaidEventListener(OnPaidEventListener arg1);

    public abstract void show(Activity arg1);
}

