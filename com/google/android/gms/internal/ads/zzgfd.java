package com.google.android.gms.internal.ads;

public final class zzgfd extends zzgkq implements zzgmb {
    private static final zzgfd zzb;
    private int zze;
    private zzgfg zzf;
    private zzgji zzg;

    static {
        zzgfd zzgfd0 = new zzgfd();
        zzgfd.zzb = zzgfd0;
        zzgkq.i(zzgfd.class, zzgfd0);
    }

    public zzgfd() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfd.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgfd();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgfc(zzgfd.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfd.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfd zzgfd0) {
        zzgfd0.zze = 0;
    }

    public static void n(zzgfd zzgfd0, zzgfg zzgfg0) {
        zzgfg0.getClass();
        zzgfd0.zzf = zzgfg0;
    }

    public static void o(zzgfd zzgfd0, zzgji zzgji0) {
        zzgfd0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgfc zzc() {
        return (zzgfc)zzgfd.zzb.j();
    }

    public static zzgfd zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgfd)zzgkq.f(zzgfd.zzb, zzgji0, zzgkc0);
    }

    public final zzgfg zzf() {
        return this.zzf == null ? zzgfg.zzf() : this.zzf;
    }

    public final zzgji zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}

