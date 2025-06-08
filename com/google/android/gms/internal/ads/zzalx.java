package com.google.android.gms.internal.ads;

public final class zzalx extends zzgkq implements zzgmb {
    private static final zzalx zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;

    static {
        zzalx zzalx0 = new zzalx();
        zzalx.zzb = zzalx0;
        zzgkq.i(zzalx.class, zzalx0);
    }

    public zzalx() {
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = -1L;
        this.zzk = -1L;
        this.zzl = -1L;
        this.zzm = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzalx.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 3: {
                return new zzalx();
            }
            case 4: {
                return new zzalw(zzalx.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzalx.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzalx zzalx0, long v) {
        zzalx0.zze |= 1;
        zzalx0.zzf = v;
    }

    public static void n(zzalx zzalx0, long v) {
        zzalx0.zze |= 4;
        zzalx0.zzh = v;
    }

    public static void o(zzalx zzalx0, long v) {
        zzalx0.zze |= 8;
        zzalx0.zzi = v;
    }

    public static void p(zzalx zzalx0, long v) {
        zzalx0.zze |= 16;
        zzalx0.zzj = v;
    }

    public static void q(zzalx zzalx0, long v) {
        zzalx0.zze |= 0x20;
        zzalx0.zzk = v;
    }

    public static zzalw zza() {
        return (zzalw)zzalx.zzb.j();
    }
}

