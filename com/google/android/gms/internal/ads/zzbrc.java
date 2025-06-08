package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbrc extends AdManagerInterstitialAd {
    public final Context a;
    public final zzp b;
    public final zzbs c;
    public final String d;
    public AppEventListener e;
    public FullScreenContentCallback f;
    public OnPaidEventListener g;

    public zzbrc(Context context0, String s) {
        zzbtx zzbtx0 = new zzbtx();
        this.a = context0;
        this.d = s;
        this.b = zzp.zza;
        this.c = zzaw.zza().zze(context0, new zzq(), s, zzbtx0);
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.d;
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzbs zzbs0 = this.c;
        if(zzbs0 != null) {
            try {
                return ResponseInfo.zzb(zzbs0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener0) {
        try {
            this.e = appEventListener0;
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzG((appEventListener0 == null ? null : new zzbbb(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        try {
            this.f = fullScreenContentCallback0;
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzJ(new zzaz(fullScreenContentCallback0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzL(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.g = onPaidEventListener0;
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzP(new zzey(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity0) {
        if(activity0 == null) {
            zzcfi.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzW(ObjectWrapper.wrap(activity0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zza(zzdr zzdr0, AdLoadCallback adLoadCallback0) {
        try {
            zzbs zzbs0 = this.c;
            if(zzbs0 != null) {
                zzbs0.zzy(this.b.zza(this.a, zzdr0), new zzh(adLoadCallback0, this));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            adLoadCallback0.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}

