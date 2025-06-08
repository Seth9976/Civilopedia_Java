package com.google.android.gms.internal.ads;

public final class zzaqs extends zzgkq implements zzgmb {
    private static final zzaqs zzb;
    private int zze;
    private zzaqv zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzaqs zzaqs0 = new zzaqs();
        zzaqs.zzb = zzaqs0;
        zzgkq.i(zzaqs.class, zzaqs0);
    }

    public zzaqs() {
        this.zzg = zzgji.zzb;
        this.zzh = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzaqs.zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzaqs();
            }
            case 4: {
                return new zzaqr(zzaqs.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzaqs.zzb;
            }
        }
    }

    public static zzaqs zzc(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzaqs)zzgkq.f(zzaqs.zzb, zzgji0, zzgkc0);
    }

    public final zzaqv zzd() {
        return this.zzf == null ? zzaqv.zzg() : this.zzf;
    }

    public final zzgji zze() {
        return this.zzh;
    }

    public final zzgji zzf() {
        return this.zzg;
    }
}

