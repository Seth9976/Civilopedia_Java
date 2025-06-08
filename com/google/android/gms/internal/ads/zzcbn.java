package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzcbn extends RewardedAd {
    public final String a;
    public final zzcbe b;
    public final Context c;
    public final zzcbw d;
    public OnAdMetadataChangedListener e;
    public OnPaidEventListener f;
    public FullScreenContentCallback g;

    public zzcbn(Context context0, String s) {
        this.c = context0.getApplicationContext();
        this.a = s;
        this.b = zzaw.zza().zzp(context0, s, new zzbtx());
        this.d = new zzcbw();
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        zzcbe zzcbe0 = this.b;
        if(zzcbe0 != null) {
            try {
                return zzcbe0.zzb();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzcbe zzcbe0 = this.b;
        if(zzcbe0 != null) {
            try {
                return ResponseInfo.zzb(zzcbe0.zzc());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzcbb zzcbb0 = this.b == null ? null : this.b.zzd();
            return zzcbb0 == null ? RewardItem.DEFAULT_REWARD : new zzcbo(zzcbb0);
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        return RewardItem.DEFAULT_REWARD;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        this.g = fullScreenContentCallback0;
        this.d.zzb(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzcbe zzcbe0 = this.b;
            if(zzcbe0 != null) {
                zzcbe0.zzh(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        try {
            this.e = onAdMetadataChangedListener0;
            zzcbe zzcbe0 = this.b;
            if(zzcbe0 != null) {
                zzcbe0.zzi(new zzex(onAdMetadataChangedListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.f = onPaidEventListener0;
            zzcbe zzcbe0 = this.b;
            if(zzcbe0 != null) {
                zzcbe0.zzj(new zzey(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions0) {
        if(serverSideVerificationOptions0 != null) {
            zzcbe zzcbe0 = this.b;
            if(zzcbe0 != null) {
                try {
                    zzcbe0.zzl(new zzcbs(serverSideVerificationOptions0));
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity0, OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        zzcbw zzcbw0 = this.d;
        zzcbw0.zzc(onUserEarnedRewardListener0);
        if(activity0 == null) {
            zzcfi.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        zzcbe zzcbe0 = this.b;
        if(zzcbe0 != null) {
            try {
                zzcbe0.zzk(zzcbw0);
                zzcbe0.zzm(ObjectWrapper.wrap(activity0));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    public final void zza(zzdr zzdr0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        try {
            zzcbe zzcbe0 = this.b;
            if(zzcbe0 != null) {
                zzcbe0.zzf(zzp.zza.zza(this.c, zzdr0), new zzcbr(rewardedAdLoadCallback0, this));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

