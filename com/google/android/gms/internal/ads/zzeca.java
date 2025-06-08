package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

public final class zzeca implements zzffi {
    public static final zzeca zza;

    static {
        zzeca.zza = new zzeca();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        zze.zza("Ad request signals:");
        zze.zza(((JSONObject)object0).toString(2));
        return (JSONObject)object0;
    }
}

