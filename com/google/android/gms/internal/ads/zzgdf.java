package com.google.android.gms.internal.ads;

public final class zzgdf extends zzgkq implements zzgmb {
    private static final zzgdf zzb;
    private int zze;
    private int zzf;

    static {
        zzgdf zzgdf0 = new zzgdf();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgdf.zzb = zzgdf0;
        zzgkq.i(zzgdf.class, zzgdf0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdf.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\u000B", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgdf();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgde(zzgdf.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgdf.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgdf zzgdf0) {
        zzgdf0.zze = 0x40;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgde zzc() {
        return (zzgde)zzgdf.zzb.j();
    }

    public static zzgdf zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdf)zzgkq.f(zzgdf.zzb, zzgji0, zzgkc0);
    }
}

