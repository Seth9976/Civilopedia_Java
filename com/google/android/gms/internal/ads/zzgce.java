package com.google.android.gms.internal.ads;

public final class zzgce extends zzgkq implements zzgmb {
    private static final zzgce zzb;
    private int zze;

    static {
        zzgce zzgce0 = new zzgce();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgce.zzb = zzgce0;
        zzgkq.i(zzgce.class, zzgce0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgce.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zze"});
            }
            case 3: {
                return new zzgce();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgcd(zzgce.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgce.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgce zzgce0) {
        zzgce0.zze = 16;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcd zzc() {
        return (zzgcd)zzgce.zzb.j();
    }

    public static zzgce zze() {
        return zzgce.zzb;
    }
}

