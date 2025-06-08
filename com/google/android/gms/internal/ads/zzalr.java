package com.google.android.gms.internal.ads;

public final class zzalr extends zzgkq implements zzgmb {
    private static final zzalr zzb;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzalr zzalr0 = new zzalr();
        zzalr.zzb = zzalr0;
        zzgkq.i(zzalr.class, zzalr0);
    }

    public zzalr() {
        this.zzg = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzalr.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", w0.e, "zzg"});
            }
            case 3: {
                return new zzalr();
            }
            case 4: {
                return new zzalq(zzalr.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzalr.zzb;
            }
        }
    }
}

