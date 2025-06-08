package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzal implements zzcfk {
    public static final zzal zza;

    static {
        zzal.zza = new zzal();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterface0 instanceof zzbp ? ((zzbp)iInterface0) : new zzbp(((IBinder)object0));
    }
}

