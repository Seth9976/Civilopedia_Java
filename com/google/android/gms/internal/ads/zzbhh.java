package com.google.android.gms.internal.ads;

public final class zzbhh extends zzgkq implements zzgmb {
    private static final zzbhh zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhh zzbhh0 = new zzbhh();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbhh.zzb = zzbhh0;
        zzgkq.i(zzbhh.class, zzbhh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbhh.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbhh();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbhg(zzbhh.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzbhh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzbhh zzbhh0, boolean z) {
        zzbhh0.zze |= 1;
        zzbhh0.zzf = z;
    }

    public static void n(zzbhh zzbhh0, int v) {
        zzbhh0.zze |= 2;
        zzbhh0.zzg = v;
    }

    public static zzbhg zza() {
        return (zzbhg)zzbhh.zzb.j();
    }

    public final boolean zzf() {
        return this.zzf;
    }
}

