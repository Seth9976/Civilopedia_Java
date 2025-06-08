package com.google.android.gms.internal.ads;

public final class zzgpp extends zzgkq implements zzgmb {
    private static final zzgpp zzb;
    private int zze;
    private String zzf;
    private zzgji zzg;

    static {
        zzgpp zzgpp0 = new zzgpp();
        zzgpp.zzb = zzgpp0;
        zzgkq.i(zzgpp.class, zzgpp0);
    }

    public zzgpp() {
        this.zzf = "";
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgpp.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgpp();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgpo(zzgpp.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgpp.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

