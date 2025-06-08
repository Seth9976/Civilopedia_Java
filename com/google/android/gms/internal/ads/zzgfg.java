package com.google.android.gms.internal.ads;

public final class zzgfg extends zzgkq implements zzgmb {
    private static final zzgfg zzb;
    private int zze;
    private zzgfa zzf;
    private zzgji zzg;

    static {
        zzgfg zzgfg0 = new zzgfg();
        zzgfg.zzb = zzgfg0;
        zzgkq.i(zzgfg.class, zzgfg0);
    }

    public zzgfg() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfg.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgfg();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgff(zzgfg.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfg.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfg zzgfg0) {
        zzgfg0.zze = 0;
    }

    public static void n(zzgfg zzgfg0, zzgfa zzgfa0) {
        zzgfa0.getClass();
        zzgfg0.zzf = zzgfa0;
    }

    public static void o(zzgfg zzgfg0, zzgji zzgji0) {
        zzgfg0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgfa zzc() {
        return this.zzf == null ? zzgfa.zzd() : this.zzf;
    }

    public static zzgff zzd() {
        return (zzgff)zzgfg.zzb.j();
    }

    public static zzgfg zzf() {
        return zzgfg.zzb;
    }

    public static zzgfg zzg(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgfg)zzgkq.f(zzgfg.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}

