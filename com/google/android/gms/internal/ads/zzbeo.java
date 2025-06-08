package com.google.android.gms.internal.ads;

public final class zzbeo extends zzgkq implements zzgmb {
    private static final zzbeo zzb;
    private int zze;
    private String zzf;
    private zzgkz zzg;
    private int zzh;

    static {
        zzbeo zzbeo0 = new zzbeo();
        zzbeo.zzb = zzbeo0;
        zzgkq.i(zzbeo.class, zzbeo0);
    }

    public zzbeo() {
        this.zzf = "";
        this.zzg = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbeo.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", w0.n});
            }
            case 3: {
                return new zzbeo();
            }
            case 4: {
                return new zzben(zzbeo.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbeo.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

