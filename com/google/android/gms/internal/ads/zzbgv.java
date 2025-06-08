package com.google.android.gms.internal.ads;

public final class zzbgv extends zzgkq implements zzgmb {
    private static final zzbgv zzb;
    private int zze;
    private zzbgm zzf;
    private int zzg;
    private zzbgt zzh;
    private zzbgk zzi;

    static {
        zzbgv zzbgv0 = new zzbgv();
        zzbgv.zzb = zzbgv0;
        zzgkq.i(zzbgv.class, zzbgv0);
    }

    public zzbgv() {
        this.zzg = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgv.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", w0.n, "zzh", "zzi"});
            }
            case 3: {
                return new zzbgv();
            }
            case 4: {
                return new zzbgu(zzbgv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbgv.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

