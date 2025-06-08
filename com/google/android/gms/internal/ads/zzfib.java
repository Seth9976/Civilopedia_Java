package com.google.android.gms.internal.ads;

public final class zzfib extends zzgkq implements zzgmb {
    private static final zzfib zzb;
    private zzfhx zze;

    static {
        zzfib zzfib0 = new zzfib();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzfib.zzb = zzfib0;
        zzgkq.i(zzfib.class, zzfib0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzfib.zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
            }
            case 3: {
                return new zzfib();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzfia(zzfib.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzfib.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzfib zzfib0, zzfhx zzfhx0) {
        zzfhx0.getClass();
        zzfib0.zze = zzfhx0;
    }

    public static zzfia zza() {
        return (zzfia)zzfib.zzb.j();
    }
}

