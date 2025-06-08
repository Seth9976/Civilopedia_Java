package com.google.android.gms.internal.ads;

public final class zzbeg extends zzgkq implements zzgmb {
    private static final zzbeg zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbeg zzbeg0 = new zzbeg();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbeg.zzb = zzbeg0;
        zzgkq.i(zzbeg.class, zzbeg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbeg.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzbeg();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzbef(zzbeg.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzbeg.zzb;
            }
        }
    }

    public static void m(zzbeg zzbeg0, boolean z) {
        zzbeg0.zze |= 1;
        zzbeg0.zzf = z;
    }

    public static void n(zzbeg zzbeg0, boolean z) {
        zzbeg0.zze |= 2;
        zzbeg0.zzg = z;
    }

    public static void o(zzbeg zzbeg0, int v) {
        zzbeg0.zze |= 4;
        zzbeg0.zzh = v;
    }

    public static zzbef zza() {
        return (zzbef)zzbeg.zzb.j();
    }
}

