package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbkh implements zzcfk {
    public static final zzbkh zza;

    static {
        zzbkh.zza = new zzbkh();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterface0 instanceof zzbkj ? ((zzbkj)iInterface0) : new zzbkj(((IBinder)object0), "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

