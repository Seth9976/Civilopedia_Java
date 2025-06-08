package com.google.android.gms.internal.ads;

public final class zzgbp extends zzgkq implements zzgmb {
    private static final zzgbp zzb;
    private int zze;

    static {
        zzgbp zzgbp0 = new zzgbp();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgbp.zzb = zzgbp0;
        zzgkq.i(zzgbp.class, zzgbp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgbp.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zze"});
            }
            case 3: {
                return new zzgbp();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgbo(zzgbp.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgbp.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgbp zzgbp0) {
        zzgbp0.zze = 16;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgbo zzc() {
        return (zzgbo)zzgbp.zzb.j();
    }

    public static zzgbp zze() {
        return zzgbp.zzb;
    }
}

