package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzdju implements zzdhb {
    public static final zzdju zza;

    static {
        zzdju.zza = new zzdju();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzdhb
    public final void zza(Object object0) {
        ((VideoLifecycleCallbacks)object0).onVideoPause();
    }
}

