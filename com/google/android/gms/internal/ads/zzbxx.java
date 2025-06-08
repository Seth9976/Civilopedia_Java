package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbxx extends zzaqx implements zzbxy {
    public static zzbxy zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterface0 instanceof zzbxy ? ((zzbxy)iInterface0) : new zzbxw(iBinder0);
    }
}

