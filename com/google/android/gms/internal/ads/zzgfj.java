package com.google.android.gms.internal.ads;

public final class zzgfj extends zzgkq implements zzgmb {
    private static final zzgfj zzb;
    private String zze;
    private zzgji zzf;
    private int zzg;

    static {
        zzgfj zzgfj0 = new zzgfj();
        zzgfj.zzb = zzgfj0;
        zzgkq.i(zzgfj.class, zzgfj0);
    }

    public zzgfj() {
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
                return new P9(zzgfj.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgfj();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgfi(zzgfj.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfj.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfj zzgfj0, String s) {
        zzgfj0.zze = s;
    }

    public static void n(zzgfj zzgfj0, zzgji zzgji0) {
        zzgfj0.zzf = zzgji0;
    }

    public static void o(zzgfj zzgfj0, int v) {
        zzgfj0.zzg = v - 2;
    }

    public static zzgfi zza() {
        return (zzgfi)zzgfj.zzb.j();
    }

    public static zzgfj zzd() {
        return zzgfj.zzb;
    }

    public final zzgji zze() {
        return this.zzf;
    }

    public final String zzf() [...] // Potential decryptor

    public final int zzi() {
        int v = this.zzg;
        int v1 = 2;
        if(v != 0) {
            if(v != 1) {
                switch(v) {
                    case 2: {
                        return 4;
                    }
                    case 3: {
                        return 5;
                    }
                    case 4: {
                        return 6;
                    }
                    default: {
                        return 1;
                    }
                }
            }
            v1 = 3;
        }
        return v1 == 0 ? 1 : v1;
    }
}

