package com.google.android.gms.internal.ads;

public final class zzgbv extends zzgkq implements zzgmb {
    private static final zzgbv zzb;
    private zzgcb zze;
    private zzgep zzf;

    static {
        zzgbv zzgbv0 = new zzgbv();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgbv.zzb = zzgbv0;
        zzgkq.i(zzgbv.class, zzgbv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgbv.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgbv();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgbu(zzgbv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgbv.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgbv zzgbv0, zzgcb zzgcb0) {
        zzgcb0.getClass();
        zzgbv0.zze = zzgcb0;
    }

    public static void n(zzgbv zzgbv0, zzgep zzgep0) {
        zzgep0.getClass();
        zzgbv0.zzf = zzgep0;
    }

    public static zzgbu zza() {
        return (zzgbu)zzgbv.zzb.j();
    }

    public static zzgbv zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgbv)zzgkq.f(zzgbv.zzb, zzgji0, zzgkc0);
    }

    public final zzgcb zze() {
        return this.zze == null ? zzgcb.zze() : this.zze;
    }

    public final zzgep zzf() {
        return this.zzf == null ? zzgep.zze() : this.zzf;
    }
}

