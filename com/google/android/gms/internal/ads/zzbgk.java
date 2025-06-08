package com.google.android.gms.internal.ads;

public final class zzbgk extends zzgkq implements zzgmb {
    private static final zzbgk zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgk zzbgk0 = new zzbgk();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbgk.zzb = zzbgk0;
        zzgkq.i(zzbgk.class, zzbgk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgk.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbgk();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbgj(zzbgk.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzbgk.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

