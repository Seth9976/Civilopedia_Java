package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzaaf implements zzyy {
    public static final zzaaf zza;

    static {
        zzaaf.zza = new zzaaf();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zza() {
        return new zzyr[]{new zzaag(0)};
    }

    @Override  // com.google.android.gms.internal.ads.zzyy
    public final zzyr[] zzb(Uri uri0, Map map0) {
        return zzyx.zza(this, uri0, map0);
    }
}

