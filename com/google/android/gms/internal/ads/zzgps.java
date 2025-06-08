package com.google.android.gms.internal.ads;

public final class zzgps extends zzgkq implements zzgmb {
    private static final zzgps zzb;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzgps zzgps0 = new zzgps();
        zzgps.zzb = zzgps0;
        zzgkq.i(zzgps.class, zzgps0);
    }

    public zzgps() {
        this.zzf = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgps.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgps();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgpr(zzgps.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgps.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

