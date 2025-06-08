package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzj implements zzcfk {
    public static final zzj zza;

    static {
        zzj.zza = new zzj();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbt ? ((zzbt)iInterface0) : new zzbt(((IBinder)object0));
    }
}

