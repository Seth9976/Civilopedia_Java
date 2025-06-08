package com.google.android.gms.internal.ads;

public final class zzggb extends zzgkq implements zzgmb {
    private static final zzggb zzb;
    private int zze;
    private zzgkz zzf;

    static {
        zzggb zzggb0 = new zzggb();
        zzggb.zzb = zzggb0;
        zzgkq.i(zzggb.class, zzggb0);
    }

    public zzggb() {
        this.zzf = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggb.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zze", "zzf", zzgga.class});
            }
            case 3: {
                return new zzggb();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgfy(zzggb.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzggb.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzggb zzggb0, int v) {
        zzggb0.zze = v;
    }

    public static void n(zzggb zzggb0, zzgga zzgga0) {
        zzgga0.getClass();
        zzgkz zzgkz0 = zzggb0.zzf;
        if(!zzgkz0.zzc()) {
            zzggb0.zzf = zzgkq.g(zzgkz0);
        }
        zzggb0.zzf.add(zzgga0);
    }

    public static zzgfy zza() {
        return (zzgfy)zzggb.zzb.j();
    }
}

