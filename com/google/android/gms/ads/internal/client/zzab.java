package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzab implements zzcfk {
    public static final zzab zza;

    static {
        zzab.zza = new zzab();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        return zzceb.zzb(((IBinder)object0));
    }
}

