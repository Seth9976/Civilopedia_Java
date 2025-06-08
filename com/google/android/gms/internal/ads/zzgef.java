package com.google.android.gms.internal.ads;

public final class zzgef extends zzgkq implements zzgmb {
    private static final zzgef zzb;
    private int zze;
    private int zzf;
    private zzgji zzg;

    static {
        zzgef zzgef0 = new zzgef();
        zzgef.zzb = zzgef0;
        zzgkq.i(zzgef.class, zzgef0);
    }

    public zzgef() {
        this.zzg = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgef.zzb, "\u0000\u0003\u0000\u0000\u0001\u000B\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000B\n", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgef();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgee(zzgef.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgef.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgef zzgef0, zzgji zzgji0) {
        zzgef0.zzg = zzgji0;
    }

    public static void n(zzgef zzgef0) {
        zzgef0.zze = zzgeh.zza(4);
    }

    public static void o(zzgef zzgef0) {
        zzgef0.zzf = zzgej.zza(5);
    }

    public static zzgee zza() {
        return (zzgee)zzgef.zzb.j();
    }

    public static zzgef zzd() {
        return zzgef.zzb;
    }

    public final zzgji zze() {
        return this.zzg;
    }

    public final int zzg() {
        int v = this.zze;
        int v1 = 2;
        if(v != 0) {
            if(v != 2) {
                switch(v) {
                    case 3: {
                        return 5;
                    }
                    case 4: {
                        return 6;
                    }
                    case 5: {
                        return 7;
                    }
                    default: {
                        return 1;
                    }
                }
            }
            v1 = 4;
        }
        return v1 == 0 ? 1 : v1;
    }

    public final int zzh() {
        int v = zzgej.zzb(this.zzf);
        return v == 0 ? 1 : v;
    }
}

