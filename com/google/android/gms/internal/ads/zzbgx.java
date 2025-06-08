package com.google.android.gms.internal.ads;

public final class zzbgx extends zzgkq implements zzgmb {
    private static final zzbgx zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzbgx zzbgx0 = new zzbgx();
        zzbgx.zzb = zzbgx0;
        zzgkq.i(zzbgx.class, zzbgx0);
    }

    public zzbgx() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgx.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", w0.n, "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzbgx();
            }
            case 4: {
                return new zzbgw(zzbgx.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbgx.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

