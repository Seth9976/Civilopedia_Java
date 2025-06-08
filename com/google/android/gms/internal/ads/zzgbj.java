package com.google.android.gms.internal.ads;

public final class zzgbj extends zzgkq implements zzgmb {
    private static final zzgbj zzb;
    private int zze;
    private zzgji zzf;
    private zzgbp zzg;

    static {
        zzgbj zzgbj0 = new zzgbj();
        zzgbj.zzb = zzgbj0;
        zzgkq.i(zzgbj.class, zzgbj0);
    }

    public zzgbj() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgbj.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgbj();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgbi(zzgbj.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgbj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgbj zzgbj0) {
        zzgbj0.zze = 0;
    }

    public static void n(zzgbj zzgbj0, zzgji zzgji0) {
        zzgbj0.zzf = zzgji0;
    }

    public static void o(zzgbj zzgbj0, zzgbp zzgbp0) {
        zzgbp0.getClass();
        zzgbj0.zzg = zzgbp0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgbi zzc() {
        return (zzgbi)zzgbj.zzb.j();
    }

    public static zzgbj zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgbj)zzgkq.f(zzgbj.zzb, zzgji0, zzgkc0);
    }

    public final zzgbp zzf() {
        return this.zzg == null ? zzgbp.zze() : this.zzg;
    }

    public final zzgji zzg() {
        return this.zzf;
    }
}

