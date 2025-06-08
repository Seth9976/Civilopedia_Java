package com.google.android.gms.internal.ads;

public final class zzgec extends zzgkq implements zzgmb {
    private static final zzgec zzb;
    private int zze;
    private zzgdw zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgec zzgec0 = new zzgec();
        zzgec.zzb = zzgec0;
        zzgkq.i(zzgec.class, zzgec0);
    }

    public zzgec() {
        this.zzg = zzgji.zzb;
        this.zzh = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgec.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgec();
            }
            case 4: {
                return new zzgeb(zzgec.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgec.zzb;
            }
        }
    }

    public static void m(zzgec zzgec0) {
        zzgec0.zze = 0;
    }

    public static void n(zzgec zzgec0, zzgdw zzgdw0) {
        zzgdw0.getClass();
        zzgec0.zzf = zzgdw0;
    }

    public static void o(zzgec zzgec0, zzgji zzgji0) {
        zzgec0.zzg = zzgji0;
    }

    public static void p(zzgec zzgec0, zzgji zzgji0) {
        zzgec0.zzh = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgdw zzc() {
        return this.zzf == null ? zzgdw.zze() : this.zzf;
    }

    public static zzgeb zzd() {
        return (zzgeb)zzgec.zzb.j();
    }

    public static zzgec zzf() {
        return zzgec.zzb;
    }

    public static zzgec zzg(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgec)zzgkq.f(zzgec.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final zzgji zzi() {
        return this.zzh;
    }
}

