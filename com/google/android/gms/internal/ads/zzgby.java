package com.google.android.gms.internal.ads;

public final class zzgby extends zzgkq implements zzgmb {
    private static final zzgby zzb;
    private int zze;
    private zzgce zzf;
    private zzgji zzg;

    static {
        zzgby zzgby0 = new zzgby();
        zzgby.zzb = zzgby0;
        zzgkq.i(zzgby.class, zzgby0);
    }

    public zzgby() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgby.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgby();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgbx(zzgby.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgby.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgby zzgby0) {
        zzgby0.zze = 0;
    }

    public static void n(zzgby zzgby0, zzgce zzgce0) {
        zzgce0.getClass();
        zzgby0.zzf = zzgce0;
    }

    public static void o(zzgby zzgby0, zzgji zzgji0) {
        zzgby0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgbx zzc() {
        return (zzgbx)zzgby.zzb.j();
    }

    public static zzgby zze() {
        return zzgby.zzb;
    }

    public static zzgby zzf(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgby)zzgkq.f(zzgby.zzb, zzgji0, zzgkc0);
    }

    public final zzgce zzg() {
        return this.zzf == null ? zzgce.zze() : this.zzf;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}

