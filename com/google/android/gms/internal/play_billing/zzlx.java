package com.google.android.gms.internal.play_billing;

public final class zzlx extends zzhk implements zzin {
    private static final zzlx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx zzlx0 = new zzlx();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzlx.zzb = zzlx0;
        zzhk.h(zzlx.class, zzlx0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlx.zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzlx();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzlv(zzlx.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzlx.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void k(zzlx zzlx0) {
        zzlx0.zzd |= 2;
        zzlx0.zzf = true;
    }

    public static zzlv zzc() {
        return (zzlv)zzlx.zzb.d();
    }
}

