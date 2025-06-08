package com.google.android.gms.internal.ads;

public final class zzggk extends zzgkq implements zzgmb {
    private static final zzggk zzb;
    private int zze;
    private zzggn zzf;

    static {
        zzggk zzggk0 = new zzggk();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzggk.zzb = zzggk0;
        zzgkq.i(zzggk.class, zzggk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggk.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\t", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzggk();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzggj(zzggk.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzggk.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzggk zzggk0) {
        zzggk0.zze = 0;
    }

    public static void n(zzggk zzggk0, zzggn zzggn0) {
        zzggn0.getClass();
        zzggk0.zzf = zzggn0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzggj zzc() {
        return (zzggj)zzggk.zzb.j();
    }

    public static zzggk zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzggk)zzgkq.f(zzggk.zzb, zzgji0, zzgkc0);
    }

    public final zzggn zzf() {
        return this.zzf == null ? zzggn.zzd() : this.zzf;
    }
}

