package com.google.android.gms.internal.ads;

public final class zzbee extends zzgkq implements zzgmb {
    private static final zzbee zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbee zzbee0 = new zzbee();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzbee.zzb = zzbee0;
        zzgkq.i(zzbee.class, zzbee0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbee.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbee();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzbed(zzbee.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzbee.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzbee zzbee0, boolean z) {
        zzbee0.zze |= 1;
        zzbee0.zzf = z;
    }

    public static void n(zzbee zzbee0, int v) {
        zzbee0.zze |= 2;
        zzbee0.zzg = v;
    }

    public static zzbed zza() {
        return (zzbed)zzbee.zzb.j();
    }

    public static zzbee zzd() {
        return zzbee.zzb;
    }
}

