package com.google.android.gms.ads.internal.client;

import D0.p;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

public final class zzdv implements InitializationStatus {
    public final zzed zza;

    public zzdv(zzed zzed0) {
        this.zza = zzed0;
    }

    @Override  // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        Map map0 = new HashMap();
        ((HashMap)map0).put("com.google.android.gms.ads.MobileAds", new p());  // 初始化器: Ljava/lang/Object;-><init>()V
        return map0;
    }
}

