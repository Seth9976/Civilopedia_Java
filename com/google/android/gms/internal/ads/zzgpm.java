package com.google.android.gms.internal.ads;

public final class zzgpm extends zzgkq implements zzgmb {
    private static final zzgpm zzb;
    private int zze;
    private String zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzj;
    private String zzk;

    static {
        zzgpm zzgpm0 = new zzgpm();
        zzgpm.zzb = zzgpm0;
        zzgkq.i(zzgpm.class, zzgpm0);
    }

    public zzgpm() {
        this.zzf = "";
        this.zzj = "";
        this.zzk = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgpm.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", w0.B, "zzj", "zzk"});
            }
            case 3: {
                return new zzgpm();
            }
            case 4: {
                return new zzgpl(zzgpm.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgpm.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzgpm zzgpm0, String s) {
        zzgpm0.zze |= 1;
        zzgpm0.zzf = s;
    }

    public static void n(zzgpm zzgpm0, long v) {
        zzgpm0.zze |= 2;
        zzgpm0.zzg = v;
    }

    public static void o(zzgpm zzgpm0, boolean z) {
        zzgpm0.zze |= 4;
        zzgpm0.zzh = z;
    }

    public static zzgpl zza() {
        return (zzgpl)zzgpm.zzb.j();
    }
}

