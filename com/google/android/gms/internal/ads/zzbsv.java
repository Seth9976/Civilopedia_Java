package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;

public final class zzbsv implements zzbss {
    public static final zzbsv zza;

    static {
        zzbsv.zza = new zzbsv();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbss
    public final Object zza(JSONObject jSONObject0) {
        return new ByteArrayInputStream(jSONObject0.toString().getBytes(zzbsx.a));
    }
}

