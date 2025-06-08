package com.google.android.gms.internal.ads;

public final class zzgcz extends zzgkq implements zzgmb {
    private static final zzgcz zzb;
    private int zze;
    private int zzf;

    static {
        zzgcz zzgcz0 = new zzgcz();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgcz.zzb = zzgcz0;
        zzgkq.i(zzgcz.class, zzgcz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgcz.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\u000B", new Object[]{"zzf", "zze"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgcz();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgcy(zzgcz.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgcz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgcz zzgcz0, int v) {
        zzgcz0.zze = v;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcy zzc() {
        return (zzgcy)zzgcz.zzb.j();
    }

    public static zzgcz zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgcz)zzgkq.f(zzgcz.zzb, zzgji0, zzgkc0);
    }
}

