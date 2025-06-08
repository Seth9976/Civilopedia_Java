package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbxn extends zzaqx implements zzbxo {
    public static zzbxo zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterface0 instanceof zzbxo ? ((zzbxo)iInterface0) : new zzbxm(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

