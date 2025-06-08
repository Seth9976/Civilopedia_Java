package com.google.android.gms.internal.ads;

public final class zzbhf extends zzgkq implements zzgmb {
    private static final zzbhf zzb;
    private int zze;
    private int zzf;
    private zzbgt zzg;

    static {
        zzbhf zzbhf0 = new zzbhf();
        zzbhf.zzb = zzbhf0;
        zzgkq.i(zzbhf.class, zzbhf0);
    }

    public zzbhf() {
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbhf.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", w0.n, "zzg"});
            }
            case 3: {
                return new zzbhf();
            }
            case 4: {
                return new zzbhe(zzbhf.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzbhf.zzb;
            }
        }
    }
}

