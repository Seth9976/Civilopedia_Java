package com.google.android.gms.internal.ads;

public final class zzbea extends zzgkq implements zzgmb {
    private static final zzbea zzb;
    private int zze;
    private int zzf;
    private zzbee zzg;
    private zzbeg zzh;

    static {
        zzbea zzbea0 = new zzbea();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbea.zzb = zzbea0;
        zzgkq.i(zzbea.class, zzbea0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbea.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", w0.k, "zzg", "zzh"});
            }
            case 3: {
                return new zzbea();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzbdz(zzbea.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbea.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbea zzbea0, zzbee zzbee0) {
        zzbee0.getClass();
        zzbea0.zzg = zzbee0;
        zzbea0.zze |= 2;
    }

    public static void n(zzbea zzbea0, zzbeg zzbeg0) {
        zzbeg0.getClass();
        zzbea0.zzh = zzbeg0;
        zzbea0.zze |= 4;
    }

    public static void o(zzbea zzbea0) {
        zzbea0.zzf = 1;
        zzbea0.zze |= 1;
    }

    public static zzbdz zza() {
        return (zzbdz)zzbea.zzb.j();
    }
}

