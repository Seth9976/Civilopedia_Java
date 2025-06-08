package com.google.android.gms.internal.play_billing;

public final class zzfq extends zzhk implements zzin {
    private static final zzfq zzb;
    private int zzd;
    private String zze;

    static {
        zzfq zzfq0 = new zzfq();
        zzfq.zzb = zzfq0;
        zzhk.h(zzfq.class, zzfq0);
    }

    public zzfq() {
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzfq.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzfq();
                    }
                    case 4: {
                        return new zzfp(zzfq.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzfq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void k(zzfq zzfq0, String s) {
        zzfq0.zzd |= 1;
        zzfq0.zze = s;
    }

    public static zzfp zza() {
        return (zzfp)zzfq.zzb.d();
    }
}

