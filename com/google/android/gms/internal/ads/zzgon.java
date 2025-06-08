package com.google.android.gms.internal.ads;

public final class zzgon extends zzgkq implements zzgmb {
    private static final zzgon zzb;
    private int zze;
    private String zzf;

    static {
        zzgon zzgon0 = new zzgon();
        zzgon.zzb = zzgon0;
        zzgkq.i(zzgon.class, zzgon0);
    }

    public zzgon() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgon.zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgon();
                    }
                    case 4: {
                        return new zzgom(zzgon.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgon.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgon zzgon0, String s) {
        zzgon0.zze |= 1;
        zzgon0.zzf = s;
    }

    public static zzgom zza() {
        return (zzgom)zzgon.zzb.j();
    }
}

