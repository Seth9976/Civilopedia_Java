package com.google.android.gms.internal.ads;

public final class zzgbm extends zzgkq implements zzgmb {
    private static final zzgbm zzb;
    private int zze;
    private zzgbp zzf;

    static {
        zzgbm zzgbm0 = new zzgbm();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgbm.zzb = zzgbm0;
        zzgkq.i(zzgbm.class, zzgbm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgbm.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\t", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgbm();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgbl(zzgbm.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgbm.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgbm zzgbm0) {
        zzgbm0.zze = 0x20;
    }

    public static void n(zzgbm zzgbm0, zzgbp zzgbp0) {
        zzgbp0.getClass();
        zzgbm0.zzf = zzgbp0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgbl zzc() {
        return (zzgbl)zzgbm.zzb.j();
    }

    public static zzgbm zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgbm)zzgkq.f(zzgbm.zzb, zzgji0, zzgkc0);
    }

    public final zzgbp zzf() {
        return this.zzf == null ? zzgbp.zze() : this.zzf;
    }
}

