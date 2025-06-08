package com.google.android.gms.internal.ads;

public final class zzbgq extends zzgkq implements zzgmb {
    private static final zzbgq zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;
    private zzbgk zzh;

    static {
        zzbgq zzbgq0 = new zzbgq();
        zzbgq.zzb = zzbgq0;
        zzgkq.i(zzbgq.class, zzbgq0);
    }

    public zzbgq() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgq.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", w0.n, "zzg", "zzh"});
            }
            case 3: {
                return new zzbgq();
            }
            case 4: {
                return new zzbgp(zzbgq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbgq.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

