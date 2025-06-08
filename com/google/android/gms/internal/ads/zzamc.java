package com.google.android.gms.internal.ads;

public final class zzamc extends zzgkq implements zzgmb {
    private static final zzamc zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private zzgji zzh;
    private zzgji zzi;

    static {
        zzamc zzamc0 = new zzamc();
        zzamc.zzb = zzamc0;
        zzgkq.i(zzamc.class, zzamc0);
    }

    public zzamc() {
        this.zzf = zzgji.zzb;
        this.zzg = zzgji.zzb;
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
                return new P9(zzamc.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzamc();
            }
            case 4: {
                return new zzamb(zzamc.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzamc.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzamc zzamc0, zzgji zzgji0) {
        zzamc0.zze |= 1;
        zzamc0.zzf = zzgji0;
    }

    public static void n(zzamc zzamc0, zzgji zzgji0) {
        zzamc0.zze |= 2;
        zzamc0.zzg = zzgji0;
    }

    public static void o(zzamc zzamc0, zzgji zzgji0) {
        zzamc0.zze |= 4;
        zzamc0.zzh = zzgji0;
    }

    public static void p(zzamc zzamc0, zzgji zzgji0) {
        zzamc0.zze |= 8;
        zzamc0.zzi = zzgji0;
    }

    public static zzamb zza() {
        return (zzamb)zzamc.zzb.j();
    }

    public static zzamc zzd(byte[] arr_b, zzgkc zzgkc0) throws zzglc {
        zzgkq zzgkq0 = zzgkq.l(zzamc.zzb, arr_b, arr_b.length, zzgkc0);
        zzgkq.d(zzgkq0);
        return (zzamc)zzgkq0;
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final zzgji zzf() {
        return this.zzg;
    }

    public final zzgji zzg() {
        return this.zzi;
    }

    public final zzgji zzh() {
        return this.zzh;
    }
}

