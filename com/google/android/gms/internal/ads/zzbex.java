package com.google.android.gms.internal.ads;

public final class zzbex extends zzgkq implements zzgmb {
    private static final zzbex zzb;
    private int zze;
    private int zzf;
    private zzbgm zzg;
    private String zzh;
    private String zzi;

    static {
        zzbex zzbex0 = new zzbex();
        zzbex.zzb = zzbex0;
        zzgkq.i(zzbex.class, zzbex0);
    }

    public zzbex() {
        this.zzh = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbex.zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", w0.m, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzbex();
            }
            case 4: {
                return new zzbev(zzbex.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbex.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

