package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzafc implements zzyy {
    public static final zzafc zza;

    static {
        zzafc.zza = new zzafc();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zza() {
        return new zzyr[]{new zzafd()};
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zzb(Uri uri0, Map map0) {
        return zzyx.zza(this, uri0, map0);
    }
}

