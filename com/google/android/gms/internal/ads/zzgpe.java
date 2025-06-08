package com.google.android.gms.internal.ads;

public final class zzgpe extends zzgkq implements zzgmb {
    private static final zzgpe zzb;
    private int zze;
    private int zzf;
    private String zzg;
    private zzgji zzh;
    private zzgji zzi;

    static {
        zzgpe zzgpe0 = new zzgpe();
        zzgpe.zzb = zzgpe0;
        zzgkq.i(zzgpe.class, zzgpe0);
    }

    public zzgpe() {
        this.zzg = "";
        this.zzh = zzgji.zzb;
        this.zzi = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgpe.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", w0.y, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzgpe();
            }
            case 4: {
                return new zzgpc(zzgpe.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgpe.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgpe zzgpe0) {
        zzgpe0.zze |= 2;
        zzgpe0.zzg = "image/png";
    }

    public static void n(zzgpe zzgpe0, zzgji zzgji0) {
        zzgji0.getClass();
        zzgpe0.zze |= 4;
        zzgpe0.zzh = zzgji0;
    }

    public static void o(zzgpe zzgpe0) {
        zzgpe0.zzf = 1;
        zzgpe0.zze |= 1;
    }

    public static zzgpc zza() {
        return (zzgpc)zzgpe.zzb.j();
    }
}

