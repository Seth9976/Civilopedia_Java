package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzad implements zzcfk {
    public static final zzad zza;

    static {
        zzad.zza = new zzad();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        return zzbxn.zzb(((IBinder)object0));
    }
}

