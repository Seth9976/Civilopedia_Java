package com.google.android.gms.internal.ads;

import java.io.Serializable;

public final class s7 extends zzfsr implements Serializable {
    public static final s7 i;

    static {
        s7.i = new s7();  // 初始化器: Lcom/google/android/gms/internal/ads/zzfsr;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    public final int compare(Object object0, Object object1) {
        ((Comparable)object0).getClass();
        ((Comparable)object1).getClass();
        return ((Comparable)object0).compareTo(((Comparable)object1));
    }

    @Override
    public final String toString() {
        return "Ordering.natural()";
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    public final zzfsr zza() {
        return A7.i;
    }
}

