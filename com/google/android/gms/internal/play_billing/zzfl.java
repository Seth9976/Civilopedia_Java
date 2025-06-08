package com.google.android.gms.internal.play_billing;

public final class zzfl extends zzhk implements zzin {
    private static final zzfl zzb;
    private int zzd;
    private zzfq zze;
    private zzfq zzf;
    private int zzg;

    static {
        zzfl zzfl0 = new zzfl();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzfl.zzb = zzfl0;
        zzhk.h(zzfl.class, zzfl0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzfl.zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
            }
            case 3: {
                return new zzfl();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            case 4: {
                return new zzfk(zzfl.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzfl.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void l(zzfl zzfl0, zzfq zzfq0) {
        zzfq0.getClass();
        zzfl0.zze = zzfq0;
        zzfl0.zzd |= 1;
    }

    public static zzfk zza() {
        return (zzfk)zzfl.zzb.d();
    }
}

