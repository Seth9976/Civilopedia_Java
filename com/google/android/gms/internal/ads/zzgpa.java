package com.google.android.gms.internal.ads;

public final class zzgpa extends zzgkq implements zzgmb {
    private static final zzgpa zzb;
    private int zze;
    private int zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgpa zzgpa0 = new zzgpa();
        zzgpa.zzb = zzgpa0;
        zzgkq.i(zzgpa.class, zzgpa0);
    }

    public zzgpa() {
        this.zzg = zzgji.zzb;
        this.zzh = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgpa.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgpa();
            }
            case 4: {
                return new zzgoz(zzgpa.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgpa.zzb;
            }
        }
    }
}

