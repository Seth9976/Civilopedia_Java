package com.google.android.gms.internal.ads;

public final class zzggy extends zzgkq implements zzgmb {
    private static final zzggy zzb;
    private int zze;

    static {
        zzggy zzggy0 = new zzggy();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzggy.zzb = zzggy0;
        zzgkq.i(zzggy.class, zzggy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggy.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zze"});
            }
            case 3: {
                return new zzggy();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzggx(zzggy.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzggy.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzggy zzc() {
        return zzggy.zzb;
    }

    public static zzggy zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzggy)zzgkq.f(zzggy.zzb, zzgji0, zzgkc0);
    }
}

