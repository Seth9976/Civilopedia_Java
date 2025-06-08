package com.google.android.gms.internal.ads;

public final class zzgep extends zzgkq implements zzgmb {
    private static final zzgep zzb;
    private zzges zze;
    private int zzf;
    private int zzg;

    static {
        zzgep zzgep0 = new zzgep();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgep.zzb = zzgep0;
        zzgkq.i(zzgep.class, zzgep0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgep.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000B\u0003\u000B", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgep();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgeo(zzgep.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgep.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgep zzgep0, zzges zzges0) {
        zzges0.getClass();
        zzgep0.zze = zzges0;
    }

    public static void n(zzgep zzgep0, int v) {
        zzgep0.zzf = v;
    }

    public final int zza() {
        return this.zzf;
    }

    public static zzgeo zzc() {
        return (zzgeo)zzgep.zzb.j();
    }

    public static zzgep zze() {
        return zzgep.zzb;
    }

    public static zzgep zzf(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgep)zzgkq.f(zzgep.zzb, zzgji0, zzgkc0);
    }

    public final zzges zzg() {
        return this.zze == null ? zzges.zze() : this.zze;
    }
}

