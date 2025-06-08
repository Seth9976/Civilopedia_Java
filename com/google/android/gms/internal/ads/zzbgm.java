package com.google.android.gms.internal.ads;

public final class zzbgm extends zzgkq implements zzgmb {
    private static final zzbgm zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgm zzbgm0 = new zzbgm();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbgm.zzb = zzbgm0;
        zzgkq.i(zzbgm.class, zzbgm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbgm.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzbgm();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzbgl(zzbgm.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzbgm.zzb;
            }
        }
    }

    public static void m(zzbgm zzbgm0, int v) {
        zzbgm0.zze |= 1;
        zzbgm0.zzf = v;
    }

    public static void n(zzbgm zzbgm0, int v) {
        zzbgm0.zze |= 2;
        zzbgm0.zzg = v;
    }

    public static void o(zzbgm zzbgm0, int v) {
        zzbgm0.zze |= 4;
        zzbgm0.zzh = v;
    }

    public static zzbgl zza() {
        return (zzbgl)zzbgm.zzb.j();
    }
}

