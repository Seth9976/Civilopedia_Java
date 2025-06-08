package com.google.android.gms.internal.ads;

public final class zzgdt extends zzgkq implements zzgmb {
    private static final zzgdt zzb;
    private zzgdw zze;

    static {
        zzgdt zzgdt0 = new zzgdt();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
        zzgdt.zzb = zzgdt0;
        zzgkq.i(zzgdt.class, zzgdt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgdt.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
            }
            case 3: {
                return new zzgdt();  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkq;-><init>()V
            }
            case 4: {
                return new zzgds(zzgdt.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgdt.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgdt zzgdt0, zzgdw zzgdw0) {
        zzgdw0.getClass();
        zzgdt0.zze = zzgdw0;
    }

    public static zzgds zza() {
        return (zzgds)zzgdt.zzb.j();
    }

    public static zzgdt zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzgdt)zzgkq.f(zzgdt.zzb, zzgji0, zzgkc0);
    }

    public final zzgdw zze() {
        return this.zze == null ? zzgdw.zze() : this.zze;
    }
}

