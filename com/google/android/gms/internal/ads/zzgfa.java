package com.google.android.gms.internal.ads;

public final class zzgfa extends zzgkq implements zzgmb {
    private static final zzgfa zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgfa zzgfa0 = new zzgfa();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgfa.zzb = zzgfa0;
        zzgkq.i(zzgfa.class, zzgfa0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfa.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgfa();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgez(zzgfa.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfa.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfa zzgfa0) {
        zzgfa0.zze = 1;
    }

    public static void n(zzgfa zzgfa0) {
        zzgfa0.zzf = 1;
    }

    public static void o(zzgfa zzgfa0, int v) {
        zzgfa0.zzg = v - 2;
    }

    public static zzgez zza() {
        return (zzgez)zzgfa.zzb.j();
    }

    public static zzgfa zzd() {
        return zzgfa.zzb;
    }

    public final int zze() {
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

    public final int zzf() {
        switch(this.zzf) {
            case 0: {
                return 2;
            }
            case 1: {
                return 3;
            }
            default: {
                return 1;
            }
        }
    }

    public final int zzg() {
        switch(this.zze) {
            case 0: {
                return 2;
            }
            case 1: {
                return 3;
            }
            default: {
                return 1;
            }
        }
    }
}

