package com.google.android.gms.internal.play_billing;

public final class zzlb extends zzhk implements zzin {
    private static final zzlb zzb;
    private int zzd;
    private int zze;

    static {
        zzlb zzlb0 = new zzlb();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzlb.zzb = zzlb0;
        zzhk.h(zzlb.class, zzlb0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlb.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", a0.g});
            }
            case 3: {
                return new zzlb();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzky(zzlb.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzlb.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void k(zzlb zzlb0, int v) {
        zzlb0.zze = v - 1;
        zzlb0.zzd |= 1;
    }

    public static zzky zzc() {
        return (zzky)zzlb.zzb.d();
    }
}

