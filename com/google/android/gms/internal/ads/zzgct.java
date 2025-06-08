package com.google.android.gms.internal.ads;

public final class zzgct extends zzgkq implements zzgmb {
    private static final zzgct zzb;
    private int zze;
    private int zzf;

    static {
        zzgct zzgct0 = new zzgct();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgct.zzb = zzgct0;
        zzgkq.i(zzgct.class, zzgct0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgct.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000B\u0003\u000B", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgct();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgcs(zzgct.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgct.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgct zzgct0, int v) {
        zzgct0.zze = v;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcs zzc() {
        return (zzgcs)zzgct.zzb.j();
    }

    public static zzgct zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgct)zzgkq.f(zzgct.zzb, zzgji0, zzgkc0);
    }
}

