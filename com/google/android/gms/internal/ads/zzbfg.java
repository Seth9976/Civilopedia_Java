package com.google.android.gms.internal.ads;

public final class zzbfg extends zzgkq implements zzgmb {
    private static final zzbfg zzb;
    private int zze;
    private int zzf;
    private zzgkv zzg;

    static {
        zzbfg zzbfg0 = new zzbfg();
        zzbfg.zzb = zzbfg0;
        zzgkq.i(zzbfg.class, zzbfg0);
    }

    public zzbfg() {
        this.zzg = x9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfg.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", w0.n, "zzg"});
            }
            case 3: {
                return new zzbfg();
            }
            case 4: {
                return new zzbff(zzbfg.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzbfg.zzb;
            }
        }
    }
}

