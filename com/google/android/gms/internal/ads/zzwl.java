package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzwl implements Comparator {
    public static final zzwl zza;

    static {
        zzwl.zza = new zzwl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return Float.compare(((Ib)object0).c, ((Ib)object1).c);
    }
}

