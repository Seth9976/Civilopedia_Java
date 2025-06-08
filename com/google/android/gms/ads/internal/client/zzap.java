package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzap implements zzcfk {
    public static final zzap zza;

    static {
        zzap.zza = new zzap();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        return zzblh.zzb(((IBinder)object0));
    }
}

