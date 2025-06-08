package com.google.android.gms.internal.ads;

public final class zzges extends zzgkq implements zzgmb {
    private static final zzges zzb;
    private int zze;
    private int zzf;

    static {
        zzges zzges0 = new zzges();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzges.zzb = zzges0;
        zzgkq.i(zzges.class, zzges0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzges.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000B", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzges();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzger(zzges.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzges.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzges zzges0, int v) {
        zzges0.zzf = v;
    }

    public static void n(zzges zzges0, int v) {
        zzges0.zze = zzgej.zza(v);
    }

    public final int zza() {
        return this.zzf;
    }

    public static zzger zzc() {
        return (zzger)zzges.zzb.j();
    }

    public static zzges zze() {
        return zzges.zzb;
    }

    public final int zzg() {
        int v = zzgej.zzb(this.zze);
        return v == 0 ? 1 : v;
    }
}

