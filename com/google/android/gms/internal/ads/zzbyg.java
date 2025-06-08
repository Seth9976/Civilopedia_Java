package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbyg extends zzaqx implements zzbyh {
    public static zzbyh zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterface0 instanceof zzbyh ? ((zzbyh)iInterface0) : new zzbyf(iBinder0, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

