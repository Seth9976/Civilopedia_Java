package com.google.android.gms.internal.ads;

public final class zzgdl extends zzgkq implements zzgmb {
    private static final zzgdl zzb;

    static {
        zzgdl zzgdl0 = new zzgdl();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgdl.zzb = zzgdl0;
        zzgkq.i(zzgdl.class, zzgdl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdl.zzb, "\u0000\u0000", null);
            }
            case 3: {
                return new zzgdl();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgdk(zzgdl.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgdl.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgdl zzc() {
        return zzgdl.zzb;
    }

    public static zzgdl zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdl)zzgkq.f(zzgdl.zzb, zzgji0, zzgkc0);
    }
}

