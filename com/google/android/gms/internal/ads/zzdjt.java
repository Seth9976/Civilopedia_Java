package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzdjt implements zzdhb {
    public static final zzdjt zza;

    static {
        zzdjt.zza = new zzdjt();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzdhb
    public final void zza(Object object0) {
        ((VideoLifecycleCallbacks)object0).onVideoStart();
    }
}

