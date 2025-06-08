package com.google.android.gms.internal.ads;

public final class zzbdy extends zzgkq implements zzgmb {
    private static final zzbdy zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbeo zzh;
    private zzbeq zzi;
    private zzgkz zzj;
    private zzbes zzk;
    private zzbgc zzl;
    private zzbfs zzm;
    private zzbfg zzn;
    private zzbfi zzo;
    private zzgkz zzp;

    static {
        zzbdy zzbdy0 = new zzbdy();
        zzbdy.zzb = zzbdy0;
        zzgkq.i(zzbdy.class, zzbdy0);
    }

    public zzbdy() {
        this.zzg = 1000;
        this.zzj = O9.l;
        this.zzp = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbdy.zzb, "\u0001\u000B\u0000\u0001\u0007\u0011\u000B\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000B\u001B\fဉ\u0004\rဉ\u0005\u000Eဉ\u0006\u000Fဉ\u0007\u0010ဉ\b\u0011\u001B", new Object[]{"zze", "zzf", zzbdw.zzc(), "zzg", w0.n, "zzh", "zzi", "zzj", zzbem.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbgo.class});
            }
            case 3: {
                return new zzbdy();
            }
            case 4: {
                return new zzbdx(zzbdy.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbdy.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbdy zzbdy0, zzbdw zzbdw0) {
        zzbdy0.zzf = zzbdw0.zza();
        zzbdy0.zze |= 1;
    }

    public static void n(zzbdy zzbdy0, zzbeq zzbeq0) {
        zzbeq0.getClass();
        zzbdy0.zzi = zzbeq0;
        zzbdy0.zze |= 8;
    }

    public static zzbdy zzc() {
        return zzbdy.zzb;
    }

    public final zzbeq zzd() {
        return this.zzi == null ? zzbeq.zzc() : this.zzi;
    }
}

