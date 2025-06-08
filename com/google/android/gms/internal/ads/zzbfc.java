package com.google.android.gms.internal.ads;

public final class zzbfc extends zzgkq implements zzgmb {
    private static final zzbfc zzb;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private zzbgm zzj;
    private zzgky zzk;
    private zzbeu zzl;
    private zzbex zzm;
    private zzbfq zzn;
    private zzbdy zzo;
    private zzbga zzp;
    private zzbhh zzq;
    private zzbeh zzr;

    static {
        zzbfc zzbfc0 = new zzbfc();
        zzbfc.zzb = zzbfc0;
        zzgkq.i(zzbfc.class, zzbfc0);
    }

    public zzbfc() {
        this.zzg = "";
        this.zzi = 1000;
        this.zzk = C9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfc.zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000Bဋ\u0002\fဌ\u0003\rဉ\u0004\u000E\u0015\u000Fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000B", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", w0.n, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
            }
            case 3: {
                return new zzbfc();
            }
            case 4: {
                return new zzbfb(zzbfc.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbfc.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbfc zzbfc0, String s) {
        s.getClass();
        zzbfc0.zze |= 2;
        zzbfc0.zzg = s;
    }

    public static void n(zzbfc zzbfc0, Iterable iterable0) {
        zzgky zzgky0 = zzbfc0.zzk;
        if(!zzgky0.zzc()) {
            int v = zzgky0.size();
            zzbfc0.zzk = zzgky0.zza((v == 0 ? 10 : v + v));
        }
        zzgir.b(iterable0, zzbfc0.zzk);
    }

    public static void o(zzbfc zzbfc0) {
        zzbfc0.zzk = C9.l;
    }

    public static void p(zzbfc zzbfc0, zzbeu zzbeu0) {
        zzbeu0.getClass();
        zzbfc0.zzl = zzbeu0;
        zzbfc0.zze |= 0x20;
    }

    public static void q(zzbfc zzbfc0, zzbdy zzbdy0) {
        zzbdy0.getClass();
        zzbfc0.zzo = zzbdy0;
        zzbfc0.zze |= 0x100;
    }

    public static void r(zzbfc zzbfc0, zzbga zzbga0) {
        zzbga0.getClass();
        zzbfc0.zzp = zzbga0;
        zzbfc0.zze |= 0x200;
    }

    public static void s(zzbfc zzbfc0, zzbhh zzbhh0) {
        zzbhh0.getClass();
        zzbfc0.zzq = zzbhh0;
        zzbfc0.zze |= 0x400;
    }

    public static void t(zzbfc zzbfc0, zzbeh zzbeh0) {
        zzbeh0.getClass();
        zzbfc0.zzr = zzbeh0;
        zzbfc0.zze |= 0x800;
    }

    public final zzbdy zza() {
        return this.zzo == null ? zzbdy.zzc() : this.zzo;
    }

    public final zzbeu zzc() {
        return this.zzl == null ? zzbeu.zzc() : this.zzl;
    }

    public static zzbfb zzd() {
        return (zzbfb)zzbfc.zzb.j();
    }

    public final String zzf() [...] // Potential decryptor
}

