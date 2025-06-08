package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzcfk;

public final class zzaf implements zzcfk {
    public static final zzaf zza;

    static {
        zzaf.zza = new zzaf();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzcfk
    public final Object zza(Object object0) {
        return zzbpm.zzb(((IBinder)object0));
    }
}

