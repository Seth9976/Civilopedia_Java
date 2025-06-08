package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public final class zzbts implements Runnable {
    public final zzbtt zza;
    public final Context zzb;
    public final String zzc;

    public zzbts(zzbtt zzbtt0, Context context0, String s) {
        this.zza = zzbtt0;
        this.zzb = context0;
        this.zzc = s;
    }

    @Override
    public final void run() {
        Context context0 = this.zzb;
        String s = this.zzc;
        zzbhz.zzc(context0);
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("measurementEnabled", ((Boolean)zzay.zzc().zzb(zzbhz.zzaf)).booleanValue());
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzam)).booleanValue()) {
            bundle0.putString("ad_storage", "denied");
            bundle0.putString("analytics_storage", "denied");
        }
        AppMeasurementSdk appMeasurementSdk0 = AppMeasurementSdk.getInstance(context0, "FA-Ads", "am", s, bundle0);
        try {
            ((zzcnc)zzcfm.zzb(context0, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbtr.zza)).zze(ObjectWrapper.wrap(context0), new zzbtq(appMeasurementSdk0));
        }
        catch(zzcfl | NullPointerException | RemoteException zzcfl0) {
            zzcfi.zzl("#007 Could not call remote method.", zzcfl0);
        }
    }
}

