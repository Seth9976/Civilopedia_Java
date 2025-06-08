package com.google.android.gms.internal.ads;

public final class zzbhd extends zzgkq implements zzgmb {
    private static final zzbhd zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;
    private zzbgk zzh;

    static {
        zzbhd zzbhd0 = new zzbhd();
        zzbhd.zzb = zzbhd0;
        zzgkq.i(zzbhd.class, zzbhd0);
    }

    public zzbhd() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbhd.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", w0.n, "zzg", "zzh"});
            }
            case 3: {
                return new zzbhd();
            }
            case 4: {
                return new zzbhc(zzbhd.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbhd.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

