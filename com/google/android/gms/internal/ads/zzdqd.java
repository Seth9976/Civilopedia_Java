package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzdqd implements zzfok {
    public static final zzdqd zza;

    static {
        zzdqd.zza = new zzdqd();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            zzbkn zzbkn0 = (zzbkn)object1;
            if(zzbkn0 != null) {
                arrayList0.add(zzbkn0);
            }
        }
        return arrayList0;
    }
}

