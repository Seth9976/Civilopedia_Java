package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbcc extends AppOpenAd {
    public final zzbcg a;
    public final String b;
    public final zzbcd c;
    public FullScreenContentCallback d;
    public OnPaidEventListener e;

    public zzbcc(zzbcg zzbcg0, String s) {
        this.c = new zzbcd();
        this.a = zzbcg0;
        this.b = s;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.d;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zzb(this.a.zzf());
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            return ResponseInfo.zzb(null);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        this.d = fullScreenContentCallback0;
        this.c.zzg(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.a.zzg(z);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.e = onPaidEventListener0;
            zzey zzey0 = new zzey(onPaidEventListener0);
            this.a.zzh(zzey0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
            this.a.zzi(iObjectWrapper0, this.c);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

