package com.google.android.gms.internal.ads;

public final class zzgdw extends zzgkq implements zzgmb {
    private static final zzgdw zzb;
    private zzgef zze;
    private zzgdq zzf;
    private int zzg;

    static {
        zzgdw zzgdw0 = new zzgdw();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgdw.zzb = zzgdw0;
        zzgkq.i(zzgdw.class, zzgdw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdw.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgdw();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgdv(zzgdw.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgdw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgdw zzgdw0, zzgef zzgef0) {
        zzgef0.getClass();
        zzgdw0.zze = zzgef0;
    }

    public static void n(zzgdw zzgdw0, zzgdq zzgdq0) {
        zzgdq0.getClass();
        zzgdw0.zzf = zzgdq0;
    }

    public static void o(zzgdw zzgdw0, int v) {
        zzgdw0.zzg = zzgdn.zza(v);
    }

    public final zzgdq zza() {
        return this.zzf == null ? zzgdq.zzd() : this.zzf;
    }

    public static zzgdv zzc() {
        return (zzgdv)zzgdw.zzb.j();
    }

    public static zzgdw zze() {
        return zzgdw.zzb;
    }

    public final zzgef zzf() {
        return this.zze == null ? zzgef.zzd() : this.zze;
    }

    public final int zzi() {
        int v = this.zzg;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                default: {
                    return 1;
                }
            }
        }
        return v1 == 0 ? 1 : v1;
    }
}

