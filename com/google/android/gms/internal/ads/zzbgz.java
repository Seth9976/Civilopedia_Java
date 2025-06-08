package com.google.android.gms.internal.ads;

public final class zzbgz extends zzgkq implements zzgmb {
    private static final zzbgz zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;
    private zzbgk zzh;

    static {
        zzbgz zzbgz0 = new zzbgz();
        zzbgz.zzb = zzbgz0;
        zzgkq.i(zzbgz.class, zzbgz0);
    }

    public zzbgz() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgz.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", w0.n, "zzg", "zzh"});
            }
            case 3: {
                return new zzbgz();
            }
            case 4: {
                return new zzbgy(zzbgz.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbgz.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

