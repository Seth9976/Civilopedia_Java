package com.google.android.gms.internal.ads;

public final class zzgcq extends zzgkq implements zzgmb {
    private static final zzgcq zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzgcq zzgcq0 = new zzgcq();
        zzgcq.zzb = zzgcq0;
        zzgkq.i(zzgcq.class, zzgcq0);
    }

    public zzgcq() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgcq.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgcq();
                    }
                    case 4: {
                        return new zzgcp(zzgcq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgcq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgcq zzgcq0) {
        zzgcq0.zze = 0;
    }

    public static void n(zzgcq zzgcq0, zzgji zzgji0) {
        zzgcq0.zzf = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcp zzc() {
        return (zzgcp)zzgcq.zzb.j();
    }

    public static zzgcq zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgcq)zzgkq.f(zzgcq.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}

