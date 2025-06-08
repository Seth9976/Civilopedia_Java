package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

public final class zzum implements Comparator {
    public static final zzum zza;

    static {
        zzum.zza = new zzum();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Db)((List)object0).get(0)).c(((Db)((List)object1).get(0)));
    }
}

