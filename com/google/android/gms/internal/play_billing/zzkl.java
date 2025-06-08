package com.google.android.gms.internal.play_billing;

public final class zzkl extends zzhk implements zzin {
    private static final zzkl zzb;

    static {
        zzkl zzkl0 = new zzkl();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzkl.zzb = zzkl0;
        zzhk.h(zzkl.class, zzkl0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzkl.zzb, "\u0004\u0000", null);
            }
            case 3: {
                return new zzkl();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            case 4: {
                return new zzkj(zzkl.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzkl.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzkl zzB() {
        return zzkl.zzb;
    }
}

