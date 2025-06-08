package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbmb extends zzaqx implements zzbmc {
    public static zzbmc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterface0 instanceof zzbmc ? ((zzbmc)iInterface0) : new zzbma(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

