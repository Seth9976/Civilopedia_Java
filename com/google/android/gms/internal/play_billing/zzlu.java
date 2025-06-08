package com.google.android.gms.internal.play_billing;

public final class zzlu extends zzhk implements zzin {
    private static final zzlu zzb;
    private int zzd;
    private int zze;

    static {
        zzlu zzlu0 = new zzlu();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzlu.zzb = zzlu0;
        zzhk.h(zzlu.class, zzlu0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlu.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", a0.i});
            }
            case 3: {
                return new zzlu();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzlr(zzlu.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzlu.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzlu zzB() {
        return zzlu.zzb;
    }
}

