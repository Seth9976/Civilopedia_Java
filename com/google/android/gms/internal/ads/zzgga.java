package com.google.android.gms.internal.ads;

public final class zzgga extends zzgkq implements zzgmb {
    private static final zzgga zzb;
    private String zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgga zzgga0 = new zzgga();
        zzgga.zzb = zzgga0;
        zzgkq.i(zzgga.class, zzgga0);
    }

    public zzgga() {
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgga.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000B\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgga();
            }
            case 4: {
                return new zzgfz(zzgga.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgga.zzb;
            }
        }
    }

    public static void m(zzgga zzgga0, String s) {
        s.getClass();
        zzgga0.zze = s;
    }

    public static void n(zzgga zzgga0, int v) {
        zzgga0.zzg = v;
    }

    public static void o(zzgga zzgga0, int v) {
        zzgga0.zzh = zzggp.zza(v);
    }

    public static void p(zzgga zzgga0, int v) {
        zzgga0.zzf = zzgfl.zza(v);
    }

    public static zzgfz zza() {
        return (zzgfz)zzgga.zzb.j();
    }
}

