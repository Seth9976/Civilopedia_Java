package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbly extends zzaqx implements zzblz {
    public static zzblz zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterface0 instanceof zzblz ? ((zzblz)iInterface0) : new zzblx(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

