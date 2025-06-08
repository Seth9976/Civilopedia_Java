package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
public final class zzggs extends zzgkq implements zzgmb {
    private static final zzggs zzb;
    private String zze;
    private zzgkz zzf;

    static {
        zzggs zzggs0 = new zzggs();
        zzggs.zzb = zzggs0;
        zzgkq.i(zzggs.class, zzggs0);
    }

    public zzggs() {
        this.zze = "";
        this.zzf = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzggs.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001B", new Object[]{"zze", "zzf", zzgfr.class});
            }
            case 3: {
                return new zzggs();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzggr(zzggs.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzggs.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static zzggs zzc() {
        return zzggs.zzb;
    }

    public final List zzd() {
        return this.zzf;
    }
}

