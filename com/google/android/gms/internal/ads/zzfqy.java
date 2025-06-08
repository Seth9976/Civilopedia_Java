package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfqy {
    public static final a7 a;
    public static final b7 b;
    public static final b7 c;

    static {
        zzfqy.a = new a7();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzfqy.b = new b7(-1);
        zzfqy.c = new b7(1);
    }

    public abstract int zza();

    public abstract zzfqy zzb(int arg1, int arg2);

    public abstract zzfqy zzc(Object arg1, Object arg2, Comparator arg3);

    public abstract zzfqy zzd(boolean arg1, boolean arg2);

    public abstract zzfqy zze(boolean arg1, boolean arg2);

    public static zzfqy zzj() {
        return zzfqy.a;
    }
}

