package com.google.android.gms.internal.ads;

public final class zzbeq extends zzgkq implements zzgmb {
    private static final zzbeq zzb;
    private int zze;
    private String zzf;
    private zzgkz zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzbeq zzbeq0 = new zzbeq();
        zzbeq.zzb = zzbeq0;
        zzgkq.i(zzbeq.class, zzbeq0);
    }

    public zzbeq() {
        this.zzf = "";
        this.zzg = O9.l;
        this.zzh = 1000;
        this.zzi = 1000;
        this.zzj = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbeq.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", w0.n, "zzi", w0.n, "zzj", w0.n});
            }
            case 3: {
                return new zzbeq();
            }
            case 4: {
                return new zzbep(zzbeq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbeq.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbeq zzbeq0, String s) {
        s.getClass();
        zzbeq0.zze |= 1;
        zzbeq0.zzf = s;
    }

    public static zzbeq zzc() {
        return zzbeq.zzb;
    }
}

