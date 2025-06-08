package com.google.android.gms.internal.ads;

public final class zzgoq extends zzgkq implements zzgmb {
    private static final zzgoq zzb;
    private int zze;
    private zzgji zzf;

    static {
        zzgoq zzgoq0 = new zzgoq();
        zzgoq.zzb = zzgoq0;
        zzgkq.i(zzgoq.class, zzgoq0);
    }

    public zzgoq() {
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgoq.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgoq();
                    }
                    case 4: {
                        return new zzgop(zzgoq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgoq.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

