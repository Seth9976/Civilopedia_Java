package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbpm extends zzaqx implements zzbpn {
    public static zzbpn zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterface0 instanceof zzbpn ? ((zzbpn)iInterface0) : new zzbpl(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

