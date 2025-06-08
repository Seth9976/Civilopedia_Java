package com.google.android.gms.internal.ads;

public final class zzbfs extends zzgkq implements zzgmb {
    private static final zzbfs zzb;
    private int zze;
    private int zzf;
    private zzbgk zzg;

    static {
        zzbfs zzbfs0 = new zzbfs();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbfs.zzb = zzbfs0;
        zzgkq.i(zzbfs.class, zzbfs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfs.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", w0.n, "zzg"});
            }
            case 3: {
                return new zzbfs();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzbfr(zzbfs.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzbfs.zzb;
            }
        }
    }
}

