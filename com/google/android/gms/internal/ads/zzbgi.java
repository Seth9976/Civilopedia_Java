package com.google.android.gms.internal.ads;

public final class zzbgi extends zzgkq implements zzgmb {
    private static final zzbgi zzb;
    private int zze;
    private String zzf;
    private int zzg;
    private zzbgk zzh;

    static {
        zzbgi zzbgi0 = new zzbgi();
        zzbgi.zzb = zzbgi0;
        zzgkq.i(zzbgi.class, zzbgi0);
    }

    public zzbgi() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgi.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", w0.n, "zzh"});
            }
            case 3: {
                return new zzbgi();
            }
            case 4: {
                return new zzbgh(zzbgi.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbgi.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

