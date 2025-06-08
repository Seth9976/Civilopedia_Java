package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

public final class zzeow implements zzfuj {
    public static final zzeow zza;

    static {
        zzeow.zza = new zzeow();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        return ((AppSetIdInfo)object0) == null ? zzfvc.zzi(new zzeoz(null, -1)) : zzfvc.zzi(new zzeoz(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope()));
    }
}

