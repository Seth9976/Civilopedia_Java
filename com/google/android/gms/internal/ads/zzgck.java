package com.google.android.gms.internal.ads;

public final class zzgck extends zzgkq implements zzgmb {
    private static final zzgck zzb;
    private zzgcn zze;
    private int zzf;

    static {
        zzgck zzgck0 = new zzgck();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgck.zzb = zzgck0;
        zzgkq.i(zzgck.class, zzgck0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgck.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000B", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgck();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
                    }
                    case 4: {
                        return new zzgcj(zzgck.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgck.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgck zzgck0, zzgcn zzgcn0) {
        zzgcn0.getClass();
        zzgck0.zze = zzgcn0;
    }

    public static void n(zzgck zzgck0, int v) {
        zzgck0.zzf = v;
    }

    public final int zza() {
        return this.zzf;
    }

    public static zzgcj zzc() {
        return (zzgcj)zzgck.zzb.j();
    }

    public static zzgck zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgck)zzgkq.f(zzgck.zzb, zzgji0, zzgkc0);
    }

    public final zzgcn zzf() {
        return this.zze == null ? zzgcn.zze() : this.zze;
    }
}

