package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

public final class zzeov implements zzfok {
    public static final zzeov zza;

    static {
        zzeov.zza = new zzeov();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        return new zzeoz(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope());
    }
}

