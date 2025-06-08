package com.google.android.gms.internal.ads;

public final class zzggn extends zzgkq implements zzgmb {
    private static final zzggn zzb;
    private String zze;
    private zzgfo zzf;

    static {
        zzggn zzggn0 = new zzggn();
        zzggn.zzb = zzggn0;
        zzgkq.i(zzggn.class, zzggn0);
    }

    public zzggn() {
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggn.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzggn();
                    }
                    case 4: {
                        return new zzggm(zzggn.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzggn.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final zzgfo zza() {
        return this.zzf == null ? zzgfo.zzd() : this.zzf;
    }

    public static zzggn zzd() {
        return zzggn.zzb;
    }

    public static zzggn zze(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzggn)zzgkq.f(zzggn.zzb, zzgji0, zzgkc0);
    }

    public final String zzf() [...] // Potential decryptor

    public final boolean zzg() {
        return this.zzf != null;
    }
}

