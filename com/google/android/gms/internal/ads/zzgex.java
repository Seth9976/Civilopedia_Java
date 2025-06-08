package com.google.android.gms.internal.ads;

public final class zzgex extends zzgkq implements zzgmb {
    private static final zzgex zzb;
    private zzgfa zze;

    static {
        zzgex zzgex0 = new zzgex();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgex.zzb = zzgex0;
        zzgkq.i(zzgex.class, zzgex0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgex.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
            }
            case 3: {
                return new zzgex();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgew(zzgex.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgex.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgex zzgex0, zzgfa zzgfa0) {
        zzgfa0.getClass();
        zzgex0.zze = zzgfa0;
    }

    public static zzgew zza() {
        return (zzgew)zzgex.zzb.j();
    }

    public static zzgex zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgex)zzgkq.f(zzgex.zzb, zzgji0, zzgkc0);
    }

    public final zzgfa zze() {
        return this.zze == null ? zzgfa.zzd() : this.zze;
    }
}

