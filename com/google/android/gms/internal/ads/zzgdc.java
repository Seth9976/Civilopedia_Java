package com.google.android.gms.internal.ads;

public final class zzgdc extends zzgkq implements zzgmb {
    private static final zzgdc zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzgdc zzgdc0 = new zzgdc();
        zzgdc.zzb = zzgdc0;
        zzgkq.i(zzgdc.class, zzgdc0);
    }

    public zzgdc() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdc.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\n", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgdc();
                    }
                    case 4: {
                        return new zzgdb(zzgdc.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgdc.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgdc zzgdc0) {
        zzgdc0.zze = 0;
    }

    public static void n(zzgdc zzgdc0, zzgji zzgji0) {
        zzgdc0.zzf = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgdb zzc() {
        return (zzgdb)zzgdc.zzb.j();
    }

    public static zzgdc zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdc)zzgkq.f(zzgdc.zzb, zzgji0, zzgkc0);
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}

