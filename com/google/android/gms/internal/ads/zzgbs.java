package com.google.android.gms.internal.ads;

public final class zzgbs extends zzgkq implements zzgmb {
    private static final zzgbs zzb;
    private int zze;
    private zzgby zzf;
    private zzgem zzg;

    static {
        zzgbs zzgbs0 = new zzgbs();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgbs.zzb = zzgbs0;
        zzgkq.i(zzgbs.class, zzgbs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgbs.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgbs();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgbr(zzgbs.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgbs.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgbs zzgbs0, int v) {
        zzgbs0.zze = v;
    }

    public static void n(zzgbs zzgbs0, zzgby zzgby0) {
        zzgby0.getClass();
        zzgbs0.zzf = zzgby0;
    }

    public static void o(zzgbs zzgbs0, zzgem zzgem0) {
        zzgem0.getClass();
        zzgbs0.zzg = zzgem0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgbr zzc() {
        return (zzgbr)zzgbs.zzb.j();
    }

    public static zzgbs zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgbs)zzgkq.f(zzgbs.zzb, zzgji0, zzgkc0);
    }

    public final zzgby zzf() {
        return this.zzf == null ? zzgby.zze() : this.zzf;
    }

    public final zzgem zzg() {
        return this.zzg == null ? zzgem.zze() : this.zzg;
    }
}

