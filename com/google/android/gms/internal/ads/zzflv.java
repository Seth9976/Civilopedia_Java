package com.google.android.gms.internal.ads;

public final class zzflv extends zzgkq implements zzgmb {
    private static final zzflv zzb;
    private int zze;
    private int zzf;
    private String zzg;
    private String zzh;
    private zzflr zzi;

    static {
        zzflv zzflv0 = new zzflv();
        zzflv.zzb = zzflv0;
        zzgkq.i(zzflv.class, zzflv0);
    }

    public zzflv() {
        this.zzg = "";
        this.zzh = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzflv.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", w0.t, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzflv();
            }
            case 4: {
                return new zzflt(zzflv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzflv.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzflv zzflv0, String s) {
        s.getClass();
        zzflv0.zze |= 2;
        zzflv0.zzg = s;
    }

    public static void n(zzflv zzflv0, zzflr zzflr0) {
        zzflr0.getClass();
        zzflv0.zzi = zzflr0;
        zzflv0.zze |= 8;
    }

    public static void o(zzflv zzflv0) {
        zzflv0.zzf = 1;
        zzflv0.zze |= 1;
    }

    public static zzflt zza() {
        return (zzflt)zzflv.zzb.j();
    }
}

