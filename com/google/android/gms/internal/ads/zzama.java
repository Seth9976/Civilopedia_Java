package com.google.android.gms.internal.ads;

public final class zzama extends zzgkq implements zzgmb {
    private static final zzama zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzgkv zzi;
    private long zzj;

    static {
        zzama zzama0 = new zzama();
        zzama.zzb = zzama0;
        zzgkq.i(zzama.class, zzama0);
    }

    public zzama() {
        this.zzi = x9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzama.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzama();
            }
            case 4: {
                return new zzalz(zzama.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzama.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

