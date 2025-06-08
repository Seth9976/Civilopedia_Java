package com.google.android.gms.internal.ads;

public final class zzfhx extends zzgkq implements zzgmb {
    private static final zzfhx zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private String zzu;

    static {
        zzfhx zzfhx0 = new zzfhx();
        zzfhx.zzb = zzfhx0;
        zzgkq.i(zzfhx.class, zzfhx0);
    }

    public zzfhx() {
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
    }

    public static void A(zzfhx zzfhx0, int v) {
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        zzfhx0.zzm = v - 2;
    }

    public static void B(zzfhx zzfhx0, int v) {
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        zzfhx0.zzp = v - 2;
    }

    public static void C(zzfhx zzfhx0) {
        zzfhx0.zzh = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzfhx.zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000B\u0002\f\f\rȈ\u000EȈ\u000FȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            }
            case 3: {
                return new zzfhx();
            }
            case 4: {
                return new zzfhw(zzfhx.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzfhx.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzi = s;
    }

    public static void n(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzj = s;
    }

    public static void o(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzk = s;
    }

    public static void p(zzfhx zzfhx0, int v) {
        zzfhx0.zzl = v;
    }

    public static void q(zzfhx zzfhx0, int v) {
        zzfhx0.zzn = v;
    }

    public static void r(zzfhx zzfhx0, long v) {
        zzfhx0.zzo = v;
    }

    public static void s(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzq = s;
    }

    public static void t(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzr = s;
    }

    public static void u(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzs = s;
    }

    public static void v(zzfhx zzfhx0, boolean z) {
        zzfhx0.zzf = z;
    }

    public static void w(zzfhx zzfhx0, String s) {
        zzfhx0.zzt = s;
    }

    public static void x(zzfhx zzfhx0, String s) {
        s.getClass();
        zzfhx0.zzu = s;
    }

    public static void y(zzfhx zzfhx0, long v) {
        zzfhx0.zzg = v;
    }

    public static void z(zzfhx zzfhx0, int v) {
        zzfhx0.zze = v - 2;
    }

    public static zzfhw zza() {
        return (zzfhw)zzfhx.zzb.j();
    }
}

