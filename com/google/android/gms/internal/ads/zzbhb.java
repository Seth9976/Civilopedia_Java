package com.google.android.gms.internal.ads;

public final class zzbhb extends zzgkq implements zzgmb {
    private static final zzbhb zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        zzbhb zzbhb0 = new zzbhb();
        zzbhb.zzb = zzbhb0;
        zzgkq.i(zzbhb.class, zzbhb0);
    }

    public zzbhb() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbhb.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zze", "zzf", w0.n, "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzbhb();
            }
            case 4: {
                return new zzbha(zzbhb.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbhb.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

