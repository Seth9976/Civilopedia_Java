package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcnb extends zzaqx implements zzcnc {
    public static zzcnc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterface0 instanceof zzcnc ? ((zzcnc)iInterface0) : new zzcna(iBinder0, "com.google.android.gms.ads.measurement.IMeasurementManager");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

