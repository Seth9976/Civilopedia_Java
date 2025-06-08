package com.google.android.gms.internal.play_billing;

public final class zzki extends zzhk implements zzin {
    private static final zzki zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private int zzg;
    private String zzh;

    static {
        zzki zzki0 = new zzki();
        zzki.zzb = zzki0;
        zzhk.h(zzki.class, zzki0);
    }

    public zzki() {
        this.zzf = "";
        this.zzh = "";
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzki.zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", a0.d, "zzh"});
            }
            case 3: {
                return new zzki();
            }
            case 4: {
                return new zzke(zzki.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzki.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzki zzki0, String s) {
        zzki0.zzd |= 8;
        zzki0.zzh = s;
    }

    public static void l(zzki zzki0, String s) {
        s.getClass();
        zzki0.zzd |= 2;
        zzki0.zzf = s;
    }

    public static void m(zzki zzki0, int v) {
        zzki0.zzd |= 1;
        zzki0.zze = v;
    }

    public static void n(zzki zzki0, int v) {
        zzki0.zzg = v - 1;
        zzki0.zzd |= 4;
    }

    public static zzke zzc() {
        return (zzke)zzki.zzb.d();
    }
}

