package com.google.android.gms.internal.ads;

public final class zzgog extends zzgkq implements zzgmb {
    private static final zzgog zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private zzgji zzh;

    static {
        zzgog zzgog0 = new zzgog();
        zzgog.zzb = zzgog0;
        zzgkq.i(zzgog.class, zzgog0);
    }

    public zzgog() {
        this.zzh = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgog.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", w0.u, "zzg", "zzh"});
            }
            case 3: {
                return new zzgog();
            }
            case 4: {
                return new zzgoe(zzgog.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgog.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

