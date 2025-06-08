package com.google.android.gms.internal.ads;

public final class zzaky extends zzgkq implements zzgmb {
    private static final zzaky zzb;
    private int zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private zzgkz zzq;
    private int zzr;

    static {
        zzaky zzaky0 = new zzaky();
        zzaky.zzb = zzaky0;
        zzgkq.i(zzaky.class, zzaky0);
    }

    public zzaky() {
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzm = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzaky.zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000Bဈ\n\f\u001B\rဌ\u000B", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzakw.class, "zzr", w0.b});
            }
            case 3: {
                return new zzaky();
            }
            case 4: {
                return new zzaku(zzaky.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzaky.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzaky zzaky0, long v) {
        zzaky0.zze |= 2;
        zzaky0.zzg = v;
    }

    public static void n(zzaky zzaky0, String s) {
        s.getClass();
        zzaky0.zze |= 4;
        zzaky0.zzh = s;
    }

    public static void o(zzaky zzaky0, String s) {
        s.getClass();
        zzaky0.zze |= 8;
        zzaky0.zzi = s;
    }

    public static void p(zzaky zzaky0, String s) {
        zzaky0.zze |= 16;
        zzaky0.zzj = s;
    }

    public static void q(zzaky zzaky0, String s) {
        zzaky0.zze |= 0x400;
        zzaky0.zzp = s;
    }

    public static void r(zzaky zzaky0, String s) {
        s.getClass();
        zzaky0.zze |= 1;
        zzaky0.zzf = s;
    }

    public static void s(zzaky zzaky0, int v) {
        zzaky0.zzr = v - 1;
        zzaky0.zze |= 0x800;
    }

    public static zzaku zza() {
        return (zzaku)zzaky.zzb.j();
    }
}

