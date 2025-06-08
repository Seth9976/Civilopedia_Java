package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzceb extends zzaqx implements zzcec {
    public static zzcec zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterface0 instanceof zzcec ? ((zzcec)iInterface0) : new zzcea(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

