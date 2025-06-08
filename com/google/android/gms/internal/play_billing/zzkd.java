package com.google.android.gms.internal.play_billing;

public final class zzkd extends zzhk implements zzin {
    private static final zzkd zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private int zzg;

    static {
        zzkd zzkd0 = new zzkd();
        zzkd.zzb = zzkd0;
        zzhk.h(zzkd.class, zzkd0);
    }

    public zzkd() {
        this.zze = 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzkd.zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", a0.c, zzlb.class, zzlx.class, zzlh.class});
            }
            case 3: {
                return new zzkd();
            }
            case 4: {
                return new zzkb(zzkd.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzkd.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzkd zzkd0, zzlb zzlb0) {
        zzlb0.getClass();
        zzkd0.zzf = zzlb0;
        zzkd0.zze = 2;
    }

    public static void l(zzkd zzkd0, zzlx zzlx0) {
        zzlx0.getClass();
        zzkd0.zzf = zzlx0;
        zzkd0.zze = 3;
    }

    public static void m(zzkd zzkd0, int v) {
        zzkd0.zzg = v - 1;
        zzkd0.zzd |= 1;
    }

    public static zzkb zzc() {
        return (zzkb)zzkd.zzb.d();
    }
}

