package com.google.android.gms.internal.ads;

public final class zzamj extends zzgkq implements zzgmb {
    private static final zzamj zzb;
    private int zze;
    private String zzf;

    static {
        zzamj zzamj0 = new zzamj();
        zzamj.zzb = zzamj0;
        zzgkq.i(zzamj.class, zzamj0);
    }

    public zzamj() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzamj.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzamj();
                    }
                    case 4: {
                        return new zzami(zzamj.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzamj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

