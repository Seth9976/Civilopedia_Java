package com.google.android.gms.internal.ads;

public final class zzgem extends zzgkq implements zzgmb {
    private static final zzgem zzb;
    private int zze;
    private zzges zzf;
    private zzgji zzg;

    static {
        zzgem zzgem0 = new zzgem();
        zzgem.zzb = zzgem0;
        zzgkq.i(zzgem.class, zzgem0);
    }

    public zzgem() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgem.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgem();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgel(zzgem.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgem.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgem zzgem0) {
        zzgem0.zze = 0;
    }

    public static void n(zzgem zzgem0, zzges zzges0) {
        zzges0.getClass();
        zzgem0.zzf = zzges0;
    }

    public static void o(zzgem zzgem0, zzgji zzgji0) {
        zzgem0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgel zzc() {
        return (zzgel)zzgem.zzb.j();
    }

    public static zzgem zze() {
        return zzgem.zzb;
    }

    public static zzgem zzf(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgem)zzgkq.f(zzgem.zzb, zzgji0, zzgkc0);
    }

    public final zzges zzg() {
        return this.zzf == null ? zzges.zze() : this.zzf;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}

