package com.google.android.gms.internal.play_billing;

public final class zzlq extends zzhk implements zzin {
    private static final zzlq zzb;
    private int zzd;
    private zzki zze;

    static {
        zzlq zzlq0 = new zzlq();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzlq.zzb = zzlq0;
        zzhk.h(zzlq.class, zzlq0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlq.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzlq();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
                    }
                    case 4: {
                        return new zzlo(zzlq.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzlq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void k(zzlq zzlq0, zzki zzki0) {
        zzki0.getClass();
        zzlq0.zze = zzki0;
        zzlq0.zzd |= 1;
    }

    public static zzlo zzc() {
        return (zzlo)zzlq.zzb.d();
    }
}

