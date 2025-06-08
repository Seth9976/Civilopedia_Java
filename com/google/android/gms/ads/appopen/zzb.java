package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbyy;

public final class zzb implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final int zzd;
    public final AppOpenAdLoadCallback zze;

    public zzb(Context context0, String s, AdRequest adRequest0, int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = v;
        this.zze = appOpenAd$AppOpenAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            zzdr zzdr0 = this.zzc.zza();
            new zzbco(context0, this.zzb, zzdr0, this.zzd, this.zze).zza();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbyy.zza(context0).zzd(illegalStateException0, "AppOpenAd.load");
        }
    }
}

