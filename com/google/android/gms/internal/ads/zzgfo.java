package com.google.android.gms.internal.ads;

public final class zzgfo extends zzgkq implements zzgmb {
    private static final zzgfo zzb;
    private String zze;
    private zzgji zzf;
    private int zzg;

    static {
        zzgfo zzgfo0 = new zzgfo();
        zzgfo.zzb = zzgfo0;
        zzgkq.i(zzgfo.class, zzgfo0);
    }

    public zzgfo() {
        this.zze = "";
        this.zzf = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfo.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgfo();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgfn(zzgfo.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfo.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfo zzgfo0, String s) {
        s.getClass();
        zzgfo0.zze = s;
    }

    public static void n(zzgfo zzgfo0, zzgji zzgji0) {
        zzgfo0.zzf = zzgji0;
    }

    public static void o(zzgfo zzgfo0, int v) {
        zzgfo0.zzg = zzggp.zza(v);
    }

    public static zzgfn zza() {
        return (zzgfn)zzgfo.zzb.j();
    }

    public static zzgfo zzd() {
        return zzgfo.zzb;
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final String zzf() [...] // Potential decryptor

    public final int zzi() {
        int v = zzggp.zzb(this.zzg);
        return v == 0 ? 1 : v;
    }
}

