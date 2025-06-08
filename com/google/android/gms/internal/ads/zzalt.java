package com.google.android.gms.internal.ads;

public final class zzalt extends zzgkq implements zzgmb {
    private static final zzalt zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzalt zzalt0 = new zzalt();
        zzalt.zzb = zzalt0;
        zzgkq.i(zzalt.class, zzalt0);
    }

    public zzalt() {
        this.zzf = -1L;
        this.zzg = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzalt.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", w0.h});
            }
            case 3: {
                return new zzalt();
            }
            case 4: {
                return new zzals(zzalt.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzalt.zzb;
            }
        }
    }
}

