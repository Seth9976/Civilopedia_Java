package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcaq extends zzaqx implements zzcar {
    public static zzcar zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterface0 instanceof zzcar ? ((zzcar)iInterface0) : new zzcap(iBinder0);
    }
}

