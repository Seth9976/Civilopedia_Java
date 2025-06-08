package com.google.android.gms.internal.play_billing;

public final class zzkx extends zzhk implements zzin {
    private static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkx0 = new zzkx();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
        zzkx.zzb = zzkx0;
        zzhk.h(zzkx.class, zzkx0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzkx.zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzkx();  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhk;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzkv(zzkx.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzkx.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

