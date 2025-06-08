package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbra extends zzaqx implements zzbrb {
    public static zzbrb zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterface0 instanceof zzbrb ? ((zzbrb)iInterface0) : new zzbqz(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

