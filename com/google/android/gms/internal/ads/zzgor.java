package com.google.android.gms.internal.ads;

public final class zzgor extends zzgkq implements zzgmb {
    private static final zzgor zzb;
    private int zze;
    private String zzf;
    private zzgoq zzg;
    private long zzh;
    private String zzi;

    static {
        zzgor zzgor0 = new zzgor();
        zzgor.zzb = zzgor0;
        zzgkq.i(zzgor.class, zzgor0);
    }

    public zzgor() {
        this.zzf = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgor.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzgor();
            }
            case 4: {
                return new zzgoo(zzgor.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgor.zzb;
            }
            default: {
                return null;
            }
        }
    }
}

