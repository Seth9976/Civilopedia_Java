package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfok;
import org.json.JSONObject;

public final class zzv implements zzfok {
    public static final zzv zza;

    static {
        zzv.zza = new zzv();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        return ((JSONObject)object0).optString("nas");
    }
}

