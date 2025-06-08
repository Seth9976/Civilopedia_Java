package com.google.android.gms.internal.ads;

public final class zzgfv extends zzgkq implements zzgmb {
    private static final zzgfv zzb;
    private zzgfj zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgfv zzgfv0 = new zzgfv();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgfv.zzb = zzgfv0;
        zzgkq.i(zzgfv.class, zzgfv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfv.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000B\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzgfv();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgfu(zzgfv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgfv.zzb;
            }
        }
    }

    public static void m(zzgfv zzgfv0, zzgfj zzgfj0) {
        zzgfj0.getClass();
        zzgfv0.zze = zzgfj0;
    }

    public static void n(zzgfv zzgfv0, int v) {
        zzgfv0.zzg = v;
    }

    public static void o(zzgfv zzgfv0, int v) {
        zzgfv0.zzh = zzggp.zza(v);
    }

    public static void p(zzgfv zzgfv0) {
        zzgfv0.zzf = 1;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzgfj zzc() {
        return this.zze == null ? zzgfj.zzd() : this.zze;
    }

    public static zzgfu zzd() {
        return (zzgfu)zzgfv.zzb.j();
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int v = this.zzf;
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

    public final int zzj() {
        int v = zzggp.zzb(this.zzh);
        return v == 0 ? 1 : v;
    }
}

