package com.google.android.gms.internal.play_billing;

public final class zzlk extends zzhk implements zzin {
    private static final zzlk zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private zzku zzg;
    private zzkx zzh;

    static {
        zzlk zzlk0 = new zzlk();
        zzlk.zzb = zzlk0;
        zzhk.h(zzlk.class, zzlk0);
    }

    public zzlk() {
        this.zze = 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzlk.zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzjz.class, zzkd.class, zzlu.class, zzkr.class, "zzh", zzkl.class, zzlq.class});
            }
            case 3: {
                return new zzlk();
            }
            case 4: {
                return new zzli(zzlk.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzlk.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzlk zzlk0, zzjz zzjz0) {
        zzlk0.zzf = zzjz0;
        zzlk0.zze = 2;
    }

    public static void l(zzlk zzlk0, zzkd zzkd0) {
        zzlk0.zzf = zzkd0;
        zzlk0.zze = 3;
    }

    public static void m(zzlk zzlk0, zzkl zzkl0) {
        zzkl0.getClass();
        zzlk0.zzf = zzkl0;
        zzlk0.zze = 7;
    }

    public static void n(zzlk zzlk0, zzku zzku0) {
        zzku0.getClass();
        zzlk0.zzg = zzku0;
        zzlk0.zzd |= 1;
    }

    public static void o(zzlk zzlk0, zzlq zzlq0) {
        zzlq0.getClass();
        zzlk0.zzf = zzlq0;
        zzlk0.zze = 8;
    }

    public static void p(zzlk zzlk0, zzlu zzlu0) {
        zzlk0.zzf = zzlu0;
        zzlk0.zze = 4;
    }

    public static zzli zzc() {
        return (zzli)zzlk.zzb.d();
    }
}

