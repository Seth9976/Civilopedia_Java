package com.google.android.gms.internal.ads;

public final class zzgot extends zzgkq implements zzgmb {
    private static final zzgot zzb;
    private int zze;
    private zzgji zzf;
    private zzgji zzg;
    private byte zzh;

    static {
        zzgot zzgot0 = new zzgot();
        zzgot.zzb = zzgot0;
        zzgkq.i(zzgot.class, zzgot0);
    }

    public zzgot() {
        this.zzh = 2;
        this.zzf = zzgji.zzb;
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzh;
            }
            case 2: {
                return new P9(zzgot.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgot();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgos(zzgot.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgot.zzb;
                    }
                    default: {
                        if(zzgkq0 == null) {
                            b = 0;
                        }
                        this.zzh = b;
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgot zzgot0, zzgji zzgji0) {
        zzgot0.zze |= 1;
        zzgot0.zzf = zzgji0;
    }

    public static void n(zzgot zzgot0, zzgji zzgji0) {
        zzgot0.zze |= 2;
        zzgot0.zzg = zzgji0;
    }

    public static zzgos zza() {
        return (zzgos)zzgot.zzb.j();
    }
}

