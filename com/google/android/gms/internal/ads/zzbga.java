package com.google.android.gms.internal.ads;

public final class zzbga extends zzgkq implements zzgmb {
    private static final zzbga zzb;
    private int zze;
    private zzgkz zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private int zzm;

    static {
        zzbga zzbga0 = new zzbga();
        zzbga.zzb = zzbga0;
        zzgkq.i(zzbga.class, zzbga0);
    }

    public zzbga() {
        this.zzf = O9.l;
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
                return new P9(zzbga.zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001B\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbfv.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 3: {
                return new zzbga();
            }
            case 4: {
                return new zzbfw(zzbga.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbga.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbga zzbga0, Iterable iterable0) {
        zzgkz zzgkz0 = zzbga0.zzf;
        if(!zzgkz0.zzc()) {
            zzbga0.zzf = zzgkq.g(zzgkz0);
        }
        zzgir.b(iterable0, zzbga0.zzf);
    }

    public static void n(zzbga zzbga0, int v) {
        zzbga0.zze |= 1;
        zzbga0.zzg = v;
    }

    public static void o(zzbga zzbga0, int v) {
        zzbga0.zze |= 2;
        zzbga0.zzh = v;
    }

    public static void p(zzbga zzbga0, long v) {
        zzbga0.zze |= 4;
        zzbga0.zzi = v;
    }

    public static void q(zzbga zzbga0, String s) {
        s.getClass();
        zzbga0.zze |= 8;
        zzbga0.zzj = s;
    }

    public static void r(zzbga zzbga0, String s) {
        s.getClass();
        zzbga0.zze |= 16;
        zzbga0.zzk = s;
    }

    public static void s(zzbga zzbga0, long v) {
        zzbga0.zze |= 0x20;
        zzbga0.zzl = v;
    }

    public static void t(zzbga zzbga0, int v) {
        zzbga0.zze |= 0x40;
        zzbga0.zzm = v;
    }

    public static zzbfw zza() {
        return (zzbfw)zzbga.zzb.j();
    }
}

