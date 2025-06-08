package com.google.android.gms.internal.play_billing;

public final class zzlf extends zzhk implements zzin {
    private static final zzlf zzb;
    private int zzd;
    private int zze;
    private String zzf;

    static {
        zzlf zzlf0 = new zzlf();
        zzlf.zzb = zzlf0;
        zzhk.h(zzlf.class, zzlf0);
    }

    public zzlf() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlf.zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", a0.h, "zzf"});
            }
            case 3: {
                return new zzlf();
            }
            case 4: {
                return new zzld(zzlf.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            default: {
                return v - 1 != 5 ? null : zzlf.zzb;
            }
        }
    }
}

