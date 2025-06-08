package com.google.android.gms.internal.ads;

public final class zzalv extends zzgkq implements zzgmb {
    private static final zzalv zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzalv zzalv0 = new zzalv();
        zzalv.zzb = zzalv0;
        zzgkq.i(zzalv.class, zzalv0);
    }

    public zzalv() {
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = -1L;
        this.zzk = -1L;
        this.zzl = 1000;
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzo = -1L;
        this.zzp = 1000;
        this.zzq = -1L;
        this.zzr = -1L;
        this.zzs = -1L;
        this.zzt = -1L;
        this.zzw = -1L;
        this.zzx = -1L;
        this.zzy = -1L;
        this.zzz = -1L;
    }

    public static void A(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x8000;
        zzalv0.zzu = v;
    }

    public static void B(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x10000;
        zzalv0.zzv = v;
    }

    public static void C(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x20000;
        zzalv0.zzw = v;
    }

    public static void D(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x40000;
        zzalv0.zzx = v;
    }

    public static void E(zzalv zzalv0, int v) {
        zzalv0.zzl = v - 1;
        zzalv0.zze |= 0x40;
    }

    public static void F(zzalv zzalv0, int v) {
        zzalv0.zzp = v - 1;
        zzalv0.zze |= 0x400;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzalv.zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000Bဌ\n\fဂ\u000B\rဂ\f\u000Eဂ\r\u000Fဂ\u000E\u0010ဂ\u000F\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", w0.h, "zzm", "zzn", "zzo", "zzp", w0.h, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
            }
            case 3: {
                return new zzalv();
            }
            case 4: {
                return new zzalu(zzalv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzalv.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzalv zzalv0, long v) {
        zzalv0.zze |= 1;
        zzalv0.zzf = v;
    }

    public static void n(zzalv zzalv0, long v) {
        zzalv0.zze |= 2;
        zzalv0.zzg = v;
    }

    public static void o(zzalv zzalv0, long v) {
        zzalv0.zze |= 4;
        zzalv0.zzh = v;
    }

    public static void p(zzalv zzalv0, long v) {
        zzalv0.zze |= 8;
        zzalv0.zzi = v;
    }

    public static void q(zzalv zzalv0) {
        zzalv0.zze &= -9;
        zzalv0.zzi = -1L;
    }

    public static void r(zzalv zzalv0, long v) {
        zzalv0.zze |= 16;
        zzalv0.zzj = v;
    }

    public static void s(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x20;
        zzalv0.zzk = v;
    }

    public static void t(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x80;
        zzalv0.zzm = v;
    }

    public static void u(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x100;
        zzalv0.zzn = v;
    }

    public static void v(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x200;
        zzalv0.zzo = v;
    }

    public static void w(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x800;
        zzalv0.zzq = v;
    }

    public static void x(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x1000;
        zzalv0.zzr = v;
    }

    public static void y(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x2000;
        zzalv0.zzs = v;
    }

    public static void z(zzalv zzalv0, long v) {
        zzalv0.zze |= 0x4000;
        zzalv0.zzt = v;
    }

    public static zzalu zza() {
        return (zzalu)zzalv.zzb.j();
    }
}

