package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzdqk implements zzfok {
    public static final zzdqk zza;

    static {
        zzdqk.zza = new zzdqk();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            zzdql zzdql0 = (zzdql)object1;
            if(zzdql0 != null) {
                arrayList0.add(zzdql0);
            }
        }
        return arrayList0;
    }
}

