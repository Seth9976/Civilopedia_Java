package com.google.android.gms.internal.ads;

public final class zzgcn extends zzgkq implements zzgmb {
    private static final zzgcn zzb;
    private int zze;

    static {
        zzgcn zzgcn0 = new zzgcn();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgcn.zzb = zzgcn0;
        zzgkq.i(zzgcn.class, zzgcn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgcn.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zze"});
            }
            case 3: {
                return new zzgcn();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgcm(zzgcn.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgcn.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgcn zzgcn0) {
        zzgcn0.zze = 16;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcm zzc() {
        return (zzgcm)zzgcn.zzb.j();
    }

    public static zzgcn zze() {
        return zzgcn.zzb;
    }
}

