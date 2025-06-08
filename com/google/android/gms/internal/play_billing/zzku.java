package com.google.android.gms.internal.play_billing;

public final class zzku extends zzhk implements zzin {
    private static final zzku zzb;
    private int zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private long zzh;

    static {
        zzku zzku0 = new zzku();
        zzku.zzb = zzku0;
        zzhk.h(zzku.class, zzku0);
    }

    public zzku() {
        this.zze = "";
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzku.zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzku();
            }
            case 4: {
                return new zzks(zzku.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzku.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzku zzku0, int v) {
        zzku0.zzd |= 4;
        zzku0.zzg = v;
    }

    public static void l(zzku zzku0, long v) {
        zzku0.zzd |= 8;
        zzku0.zzh = v;
    }

    public static void m(zzku zzku0, String s) {
        s.getClass();
        zzku0.zzd |= 2;
        zzku0.zzf = s;
    }

    public static void n(zzku zzku0, String s) {
        s.getClass();
        zzku0.zzd |= 1;
        zzku0.zze = s;
    }

    public static zzks zzc() {
        return (zzks)zzku.zzb.d();
    }
}

