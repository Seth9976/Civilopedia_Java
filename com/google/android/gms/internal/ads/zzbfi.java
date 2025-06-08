package com.google.android.gms.internal.ads;

public final class zzbfi extends zzgkq implements zzgmb {
    private static final zzbfi zzb;
    private int zze;
    private zzbfe zzf;
    private zzgkz zzg;
    private int zzh;
    private zzbgk zzi;

    static {
        zzbfi zzbfi0 = new zzbfi();
        zzbfi.zzb = zzbfi0;
        zzgkq.i(zzbfi.class, zzbfi0);
    }

    public zzbfi() {
        this.zzg = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfi.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001B\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbgi.class, "zzh", w0.n, "zzi"});
            }
            case 3: {
                return new zzbfi();
            }
            case 4: {
                return new zzbfh(zzbfi.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbfi.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

