package com.google.android.gms.internal.ads;

public final class zzbfe extends zzgkq implements zzgmb {
    private static final zzbfe zzb;
    private int zze;
    private String zzf;
    private int zzg;
    private zzgkv zzh;
    private zzbgk zzi;

    static {
        zzbfe zzbfe0 = new zzbfe();
        zzbfe.zzb = zzbfe0;
        zzgkq.i(zzbfe.class, zzbfe0);
    }

    public zzbfe() {
        this.zzf = "";
        this.zzh = x9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfe.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", w0.n, "zzh", "zzi"});
            }
            case 3: {
                return new zzbfe();
            }
            case 4: {
                return new zzbfd(zzbfe.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbfe.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

