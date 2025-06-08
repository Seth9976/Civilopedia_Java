package com.google.android.gms.internal.ads;

public final class zzgdi extends zzgkq implements zzgmb {
    private static final zzgdi zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzgdi zzgdi0 = new zzgdi();
        zzgdi.zzb = zzgdi0;
        zzgkq.i(zzgdi.class, zzgdi0);
    }

    public zzgdi() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdi.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\n", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgdi();
                    }
                    case 4: {
                        return new zzgdh(zzgdi.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgdi.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgdi zzgdi0) {
        zzgdi0.zze = 0;
    }

    public static void n(zzgdi zzgdi0, zzgji zzgji0) {
        zzgdi0.zzf = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgdh zzc() {
        return (zzgdh)zzgdi.zzb.j();
    }

    public static zzgdi zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdi)zzgkq.f(zzgdi.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}

