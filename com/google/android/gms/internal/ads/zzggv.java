package com.google.android.gms.internal.ads;

public final class zzggv extends zzgkq implements zzgmb {
    private static final zzggv zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzggv zzggv0 = new zzggv();
        zzggv.zzb = zzggv0;
        zzgkq.i(zzggv.class, zzggv0);
    }

    public zzggv() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggv.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzggv();
                    }
                    case 4: {
                        return new zzggu(zzggv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzggv.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzggv zzggv0) {
        zzggv0.zze = 0;
    }

    public static void n(zzggv zzggv0, zzgji zzgji0) {
        zzggv0.zzf = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzggu zzc() {
        return (zzggu)zzggv.zzb.j();
    }

    public static zzggv zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzggv)zzgkq.f(zzggv.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}

