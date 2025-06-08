package com.google.android.gms.internal.ads;

public final class zzbfq extends zzgkq implements zzgmb {
    private static final zzbfq zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbfq zzbfq0 = new zzbfq();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbfq.zzb = zzbfq0;
        zzgkq.i(zzbfq.class, zzbfq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfq.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", w0.p, "zzg", w0.o});
            }
            case 3: {
                return new zzbfq();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzbfj(zzbfq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbfq.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbfq zzbfq0, int v) {
        zzbfq0.zzf = v - 1;
        zzbfq0.zze |= 1;
    }

    public static void n(zzbfq zzbfq0, int v) {
        zzbfq0.zzg = v - 1;
        zzbfq0.zze |= 2;
    }

    public static zzbfj zza() {
        return (zzbfj)zzbfq.zzb.j();
    }

    public static zzbfq zzd() {
        return zzbfq.zzb;
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int v = zzbfm.zza(this.zzg);
        return v == 0 ? 1 : v;
    }

    public final int zzh() {
        int v = zzbfp.zza(this.zzf);
        return v == 0 ? 1 : v;
    }
}

