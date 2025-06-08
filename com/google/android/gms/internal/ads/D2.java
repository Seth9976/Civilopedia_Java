package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class d2 implements MediationAdLoadCallback {
    public final int i;
    public final zzbvh j;
    public final zzbug k;

    public d2(zzbvh zzbvh0, zzbug zzbug0, int v) {
        this.i = v;
        this.j = zzbvh0;
        this.k = zzbug0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        if(this.i != 0) {
            try {
                zze zze0 = adError0.zza();
                this.j.zzf(zze0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("", remoteException0);
            }
            return;
        }
        try {
            zze zze1 = adError0.zza();
            this.j.zzf(zze1);
        }
        catch(RemoteException remoteException1) {
            zzcfi.zzh("", remoteException1);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        if(this.i != 0) {
            this.onFailure(new AdError(0, s, "undefined"));
            return;
        }
        this.onFailure(new AdError(0, s, "undefined"));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object object0) {
        if(this.i != 0) {
            MediationInterscrollerAd mediationInterscrollerAd0 = (MediationInterscrollerAd)object0;
            zzbvh zzbvh0 = this.j;
            if(mediationInterscrollerAd0 == null) {
                zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    zzbvh0.zze("Adapter returned null.");
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("", remoteException0);
                }
                return null;
            }
            try {
                zzbvh0.zzh(new zzbva(mediationInterscrollerAd0));
                return new E9(this.k, 11);
            }
            catch(RemoteException remoteException1) {
                zzcfi.zzh("", remoteException1);
                return new E9(this.k, 11);
            }
        }
        MediationBannerAd mediationBannerAd0 = (MediationBannerAd)object0;
        zzbvh zzbvh1 = this.j;
        if(mediationBannerAd0 == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                zzbvh1.zze("Adapter returned null.");
            }
            catch(RemoteException remoteException2) {
                zzcfi.zzh("", remoteException2);
            }
            return null;
        }
        try {
            zzbvh1.zzg(ObjectWrapper.wrap(mediationBannerAd0.getView()));
            return new E9(this.k, 11);
        }
        catch(RemoteException remoteException3) {
            zzcfi.zzh("", remoteException3);
            return new E9(this.k, 11);
        }
    }
}

