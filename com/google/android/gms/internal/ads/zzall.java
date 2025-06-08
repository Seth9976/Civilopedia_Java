package com.google.android.gms.internal.ads;

public final class zzall extends zzgkq implements zzgmb {
    private static final zzall zzb;
    private int zze;
    private int zzf;

    static {
        zzall zzall0 = new zzall();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzall.zzb = zzall0;
        zzgkq.i(zzall.class, zzall0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzall.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", w0.f});
            }
            case 3: {
                return new zzall();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzalk(zzall.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzall.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

