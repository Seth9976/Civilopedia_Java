package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzadc implements zzyy {
    public static final zzadc zza;

    static {
        zzadc.zza = new zzadc();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zza() {
        return new zzyr[]{new zzadg(0)};
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zzb(Uri uri0, Map map0) {
        return zzyx.zza(this, uri0, map0);
    }
}

