package com.google.android.gms.internal.ads;

public final class zzakw extends zzgkq implements zzgmb {
    private static final zzakw zzb;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzakw zzakw0 = new zzakw();
        zzakw.zzb = zzakw0;
        zzgkq.i(zzakw.class, zzakw0);
    }

    public zzakw() {
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
                return new P9(zzakw.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzakw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzakv(zzakw.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzakw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

