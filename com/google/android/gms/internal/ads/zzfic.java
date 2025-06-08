package com.google.android.gms.internal.ads;

public final class zzfic extends zzgkq implements zzgmb {
    private static final zzfic zzb;
    private zzgkz zze;

    static {
        zzfic zzfic0 = new zzfic();
        zzfic.zzb = zzfic0;
        zzgkq.i(zzfic.class, zzfic0);
    }

    public zzfic() {
        this.zze = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzfic.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zze", zzfib.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzfic();
                    }
                    case 4: {
                        return new zzfhz(zzfic.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzfic.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzfic zzfic0) {
        zzfic0.zze = O9.l;
    }

    public static void n(zzfic zzfic0, zzfib zzfib0) {
        zzfib0.getClass();
        zzgkz zzgkz0 = zzfic0.zze;
        if(!zzgkz0.zzc()) {
            zzfic0.zze = zzgkq.g(zzgkz0);
        }
        zzfic0.zze.add(zzfib0);
    }

    public final int zza() {
        return this.zze.size();
    }

    public static zzfhz zzc() {
        return (zzfhz)zzfic.zzb.j();
    }
}

