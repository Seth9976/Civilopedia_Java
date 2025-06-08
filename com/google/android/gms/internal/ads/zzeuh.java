package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

public final class zzeuh implements zzfuj {
    public static final zzeuh zza;

    static {
        zzeuh.zza = new zzeuh();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        return ((AppSetIdInfo)object0) == null ? zzfvc.zzi(new zzeuk(null, -1)) : zzfvc.zzi(new zzeuk(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope()));
    }
}

