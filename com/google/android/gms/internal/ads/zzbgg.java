package com.google.android.gms.internal.ads;

public final class zzbgg extends zzgkq implements zzgmb {
    private static final zzbgg zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgg zzbgg0 = new zzbgg();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbgg.zzb = zzbgg0;
        zzgkq.i(zzbgg.class, zzbgg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgg.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbgg();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbgf(zzbgg.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzbgg.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

