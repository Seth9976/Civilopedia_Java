package com.google.android.gms.internal.ads;

public final class zzgge extends zzgkq implements zzgmb {
    private static final zzgge zzb;
    private int zze;
    private zzggh zzf;

    static {
        zzgge zzgge0 = new zzgge();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgge.zzb = zzgge0;
        zzgkq.i(zzgge.class, zzgge0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgge.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\t", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgge();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzggd(zzgge.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgge.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgge zzgge0) {
        zzgge0.zze = 0;
    }

    public static void n(zzgge zzgge0, zzggh zzggh0) {
        zzggh0.getClass();
        zzgge0.zzf = zzggh0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzggd zzc() {
        return (zzggd)zzgge.zzb.j();
    }

    public static zzgge zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgge)zzgkq.f(zzgge.zzb, zzgji0, zzgkc0);
    }

    public final zzggh zzf() {
        return this.zzf == null ? zzggh.zzc() : this.zzf;
    }
}

