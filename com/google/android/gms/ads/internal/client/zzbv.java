package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzaqx;

public abstract class zzbv extends zzaqx implements zzbw {
    public static zzbw zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterface0 instanceof zzbw ? ((zzbw)iInterface0) : new zzbu(iBinder0);
    }
}

