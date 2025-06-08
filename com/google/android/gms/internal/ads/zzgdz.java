package com.google.android.gms.internal.ads;

public final class zzgdz extends zzgkq implements zzgmb {
    private static final zzgdz zzb;
    private int zze;
    private zzgec zzf;
    private zzgji zzg;

    static {
        zzgdz zzgdz0 = new zzgdz();
        zzgdz.zzb = zzgdz0;
        zzgkq.i(zzgdz.class, zzgdz0);
    }

    public zzgdz() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdz.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgdz();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgdy(zzgdz.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgdz.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgdz zzgdz0) {
        zzgdz0.zze = 0;
    }

    public static void n(zzgdz zzgdz0, zzgec zzgec0) {
        zzgec0.getClass();
        zzgdz0.zzf = zzgec0;
    }

    public static void o(zzgdz zzgdz0, zzgji zzgji0) {
        zzgdz0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgdy zzc() {
        return (zzgdy)zzgdz.zzb.j();
    }

    public static zzgdz zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdz)zzgkq.f(zzgdz.zzb, zzgji0, zzgkc0);
    }

    public final zzgec zzf() {
        return this.zzf == null ? zzgec.zzf() : this.zzf;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}

