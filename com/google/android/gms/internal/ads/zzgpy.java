package com.google.android.gms.internal.ads;

public final class zzgpy extends zzgkq implements zzgmb {
    private static final zzgpy zzb;
    private int zze;
    private String zzf;

    static {
        zzgpy zzgpy0 = new zzgpy();
        zzgpy.zzb = zzgpy0;
        zzgkq.i(zzgpy.class, zzgpy0);
    }

    public zzgpy() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgpy.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgpy();
                    }
                    case 4: {
                        return new zzgpx(zzgpy.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgpy.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

