package com.google.android.gms.internal.ads;

public final class zzgch extends zzgkq implements zzgmb {
    private static final zzgch zzb;
    private int zze;
    private zzgcn zzf;
    private zzgji zzg;

    static {
        zzgch zzgch0 = new zzgch();
        zzgch.zzb = zzgch0;
        zzgkq.i(zzgch.class, zzgch0);
    }

    public zzgch() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgch.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgch();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgcg(zzgch.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgch.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgch zzgch0) {
        zzgch0.zze = 0;
    }

    public static void n(zzgch zzgch0, zzgcn zzgcn0) {
        zzgcn0.getClass();
        zzgch0.zzf = zzgcn0;
    }

    public static void o(zzgch zzgch0, zzgji zzgji0) {
        zzgch0.zzg = zzgji0;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgcg zzc() {
        return (zzgcg)zzgch.zzb.j();
    }

    public static zzgch zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgch)zzgkq.f(zzgch.zzb, zzgji0, zzgkc0);
    }

    public final zzgcn zzf() {
        return this.zzf == null ? zzgcn.zze() : this.zzf;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}

