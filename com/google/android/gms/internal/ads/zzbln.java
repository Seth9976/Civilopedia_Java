package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbln extends zzaqx implements zzblo {
    public static zzblo zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterface0 instanceof zzblo ? ((zzblo)iInterface0) : new zzblm(iBinder0);
    }
}

