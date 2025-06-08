package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzuf implements Comparator {
    public static final zzuf zza;

    static {
        zzuf.zza = new zzuf();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((zzad)object1).zzi - ((zzad)object0).zzi;
    }
}

