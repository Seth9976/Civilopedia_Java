package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzui implements Comparator {
    public static final zzui zza;

    static {
        zzui.zza = new zzui();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Bb)Collections.max(((List)object0))).c(((Bb)Collections.max(((List)object1))));
    }
}

