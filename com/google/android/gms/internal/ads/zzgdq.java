package com.google.android.gms.internal.ads;

public final class zzgdq extends zzgkq implements zzgmb {
    private static final zzgdq zzb;
    private zzgfo zze;

    static {
        zzgdq zzgdq0 = new zzgdq();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgdq.zzb = zzgdq0;
        zzgkq.i(zzgdq.class, zzgdq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdq.zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
            }
            case 3: {
                return new zzgdq();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgdp(zzgdq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgdq.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgdq zzgdq0, zzgfo zzgfo0) {
        zzgfo0.getClass();
        zzgdq0.zze = zzgfo0;
    }

    public static zzgdp zza() {
        return (zzgdp)zzgdq.zzb.j();
    }

    public static zzgdq zzd() {
        return zzgdq.zzb;
    }

    public final zzgfo zze() {
        return this.zze == null ? zzgfo.zzd() : this.zze;
    }
}

