package com.google.android.gms.internal.ads;

public final class zzbeu extends zzgkq implements zzgmb {
    private static final zzbeu zzb;
    private int zze;
    private String zzf;
    private zzbgk zzg;
    private int zzh;
    private zzbgm zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzbeu zzbeu0 = new zzbeu();
        zzbeu.zzb = zzbeu0;
        zzgkq.i(zzbeu.class, zzbeu0);
    }

    public zzbeu() {
        this.zzf = "";
        this.zzk = 1000;
        this.zzl = 1000;
        this.zzm = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbeu.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", w0.n, "zzl", w0.n, "zzm", w0.n});
            }
            case 3: {
                return new zzbeu();
            }
            case 4: {
                return new zzbet(zzbeu.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbeu.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbeu zzbeu0, String s) {
        zzbeu0.zze |= 1;
        zzbeu0.zzf = s;
    }

    public static void n(zzbeu zzbeu0, zzbgm zzbgm0) {
        zzbgm0.getClass();
        zzbeu0.zzi = zzbgm0;
        zzbeu0.zze |= 8;
    }

    public static zzbeu zzc() {
        return zzbeu.zzb;
    }
}

