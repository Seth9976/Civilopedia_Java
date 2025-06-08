package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzara extends zzaqx implements zzarb {
    public static zzarb zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterface0 instanceof zzarb ? ((zzarb)iInterface0) : new zzaqz(iBinder0, "com.google.android.gms.ads.clearcut.IClearcut");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

