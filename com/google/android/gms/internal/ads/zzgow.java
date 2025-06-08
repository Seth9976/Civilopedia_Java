package com.google.android.gms.internal.ads;

public final class zzgow extends zzgkq implements zzgmb {
    private static final zzgow zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgow zzgow0 = new zzgow();
        zzgow.zzb = zzgow0;
        zzgkq.i(zzgow.class, zzgow0);
    }

    public zzgow() {
        this.zzf = zzgji.zzb;
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
                return new P9(zzgow.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgow();
            }
            case 4: {
                return new zzgov(zzgow.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgow.zzb;
            }
        }
    }
}

