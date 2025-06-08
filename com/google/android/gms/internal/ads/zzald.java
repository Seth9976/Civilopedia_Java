package com.google.android.gms.internal.ads;

public final class zzald extends zzgkq implements zzgmb {
    private static final zzald zzb;
    private int zze;
    private int zzf;

    static {
        zzald zzald0 = new zzald();
        zzald.zzb = zzald0;
        zzgkq.i(zzald.class, zzald0);
    }

    public zzald() {
        this.zzf = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzald.zzb, "\u0001\u0001\u0000\u0001\u001B\u001B\u0001\u0000\u0000\u0000\u001Bဌ\u0000", new Object[]{"zze", "zzf", w0.c});
            }
            case 3: {
                return new zzald();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzalc(zzald.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzald.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

