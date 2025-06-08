package com.google.android.gms.internal.play_billing;

public abstract class zzca {
    public static final c a;
    public static final d b;
    public static final d c;

    static {
        zzca.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzca.b = new d(-1);
        zzca.c = new d(1);
    }

    public abstract int zza();

    public abstract zzca zzb(Comparable arg1, Comparable arg2);

    public static zzca zzf() {
        return zzca.a;
    }
}

