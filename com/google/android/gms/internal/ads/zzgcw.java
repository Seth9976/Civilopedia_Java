package com.google.android.gms.internal.ads;

public final class zzgcw extends zzgkq implements zzgmb {
    private static final zzgcw zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzgcw zzgcw0 = new zzgcw();
        zzgcw.zzb = zzgcw0;
        zzgkq.i(zzgcw.class, zzgcw0);
    }

    public zzgcw() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgcw.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgcw();
                    }
                    case 4: {
                        return new zzgcv(zzgcw.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgcw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgcw zzgcw0) {
        zzgcw0.zze = 0;
    }

    public static void n(zzgcw zzgcw0, zzgji zzgji0) {
        zzgcw0.zzf = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcv zzc() {
        return (zzgcv)zzgcw.zzb.j();
    }

    public static zzgcw zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgcw)zzgkq.f(zzgcw.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}

