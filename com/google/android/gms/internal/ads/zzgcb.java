package com.google.android.gms.internal.ads;

public final class zzgcb extends zzgkq implements zzgmb {
    private static final zzgcb zzb;
    private zzgce zze;
    private int zzf;

    static {
        zzgcb zzgcb0 = new zzgcb();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgcb.zzb = zzgcb0;
        zzgkq.i(zzgcb.class, zzgcb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgcb.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000B", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgcb();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgca(zzgcb.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgcb.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgcb zzgcb0, zzgce zzgce0) {
        zzgce0.getClass();
        zzgcb0.zze = zzgce0;
    }

    public static void n(zzgcb zzgcb0, int v) {
        zzgcb0.zzf = v;
    }

    public final int zza() {
        return this.zzf;
    }

    public static zzgca zzc() {
        return (zzgca)zzgcb.zzb.j();
    }

    public static zzgcb zze() {
        return zzgcb.zzb;
    }

    public static zzgcb zzf(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgcb)zzgkq.f(zzgcb.zzb, zzgji0, zzgkc0);
    }

    public final zzgce zzg() {
        return this.zze == null ? zzgce.zze() : this.zze;
    }
}

