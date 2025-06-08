package com.google.android.gms.internal.ads;

public final class zzggh extends zzgkq implements zzgmb {
    private static final zzggh zzb;
    private String zze;

    static {
        zzggh zzggh0 = new zzggh();
        zzggh.zzb = zzggh0;
        zzgkq.i(zzggh.class, zzggh0);
    }

    public zzggh() {
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggh.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            }
            case 3: {
                return new zzggh();
            }
            case 4: {
                return new zzggg(zzggh.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzggh.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzggh zzc() {
        return zzggh.zzb;
    }

    public static zzggh zzd(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzggh)zzgkq.f(zzggh.zzb, zzgji0, zzgkc0);
    }

    public final String zze() [...] // Potential decryptor
}

