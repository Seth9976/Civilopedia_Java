package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzgpq extends zzgkq implements zzgmb {
    private zzgpp zzA;
    private zzgkz zzB;
    private zzgor zzC;
    private String zzD;
    private zzgoj zzE;
    private byte zzF;
    private static final zzgpq zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private zzgon zzk;
    private zzgkz zzl;
    private zzgkz zzm;
    private String zzn;
    private zzgpe zzo;
    private boolean zzp;
    private zzgkz zzq;
    private String zzr;
    private boolean zzs;
    private boolean zzt;
    private zzgji zzu;
    private zzgpm zzv;
    private boolean zzw;
    private String zzx;
    private zzgkz zzy;
    private zzgkz zzz;

    static {
        zzgpq zzgpq0 = new zzgpq();
        zzgpq.zzb = zzgpq0;
        zzgkq.i(zzgpq.class, zzgpq0);
    }

    public zzgpq() {
        this.zzF = 2;
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzl = O9.l;
        this.zzm = O9.l;
        this.zzn = "";
        this.zzq = O9.l;
        this.zzr = "";
        this.zzu = zzgji.zzb;
        this.zzx = "";
        this.zzy = O9.l;
        this.zzz = O9.l;
        this.zzB = O9.l;
        this.zzD = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzF;
            }
            case 2: {
                return new P9(zzgpq.zzb, "\u0001\u001A\u0000\u0001\u0001\u001A\u001A\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001A\u0007ဈ\t\bဇ\n\tဇ\u000B\nဌ\u0000\u000Bဌ\u0001\fဉ\u0005\rဈ\u0006\u000Eဉ\u0007\u000Fည\f\u0010\u001B\u0011ဉ\r\u0012ဇ\u000E\u0013ဈ\u000F\u0014\u001A\u0015\u001A\u0016ဉ\u0010\u0017\u001B\u0018ဉ\u0011\u0019ဈ\u0012\u001Aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgpk.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", w0.z, "zzg", w0.x, "zzk", "zzn", "zzo", "zzu", "zzm", zzgpu.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgqa.class, "zzC", "zzD", "zzE"});
            }
            case 3: {
                return new zzgpq();
            }
            case 4: {
                return new zzgol(zzgpq.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgpq.zzb;
            }
            default: {
                if(zzgkq0 == null) {
                    b = 0;
                }
                this.zzF = b;
                return null;
            }
        }
    }

    public static void m(zzgpq zzgpq0, String s) {
        s.getClass();
        zzgpq0.zze |= 4;
        zzgpq0.zzh = s;
    }

    public static void n(zzgpq zzgpq0, String s) {
        s.getClass();
        zzgpq0.zze |= 8;
        zzgpq0.zzi = s;
    }

    public static void o(zzgpq zzgpq0, zzgon zzgon0) {
        zzgon0.getClass();
        zzgpq0.zzk = zzgon0;
        zzgpq0.zze |= 0x20;
    }

    public static void p(zzgpq zzgpq0, zzgpk zzgpk0) {
        zzgpk0.getClass();
        zzgkz zzgkz0 = zzgpq0.zzl;
        if(!zzgkz0.zzc()) {
            zzgpq0.zzl = zzgkq.g(zzgkz0);
        }
        zzgpq0.zzl.add(zzgpk0);
    }

    public static void q(zzgpq zzgpq0, String s) {
        zzgpq0.zze |= 0x40;
        zzgpq0.zzn = s;
    }

    public static void r(zzgpq zzgpq0) {
        zzgpq0.zze &= -65;
        zzgpq0.zzn = zzgpq.zzb.zzn;
    }

    public static void s(zzgpq zzgpq0, zzgpe zzgpe0) {
        zzgpe0.getClass();
        zzgpq0.zzo = zzgpe0;
        zzgpq0.zze |= 0x80;
    }

    public static void t(zzgpq zzgpq0, zzgpm zzgpm0) {
        zzgpm0.getClass();
        zzgpq0.zzv = zzgpm0;
        zzgpq0.zze |= 0x2000;
    }

    public static void u(zzgpq zzgpq0, Iterable iterable0) {
        zzgkz zzgkz0 = zzgpq0.zzy;
        if(!zzgkz0.zzc()) {
            zzgpq0.zzy = zzgkq.g(zzgkz0);
        }
        zzgir.b(iterable0, zzgpq0.zzy);
    }

    public static void v(zzgpq zzgpq0, Iterable iterable0) {
        zzgkz zzgkz0 = zzgpq0.zzz;
        if(!zzgkz0.zzc()) {
            zzgpq0.zzz = zzgkq.g(zzgkz0);
        }
        zzgir.b(iterable0, zzgpq0.zzz);
    }

    public static void w(zzgpq zzgpq0, int v) {
        zzgpq0.zzf = v - 1;
        zzgpq0.zze |= 1;
    }

    public static zzgol zza() {
        return (zzgol)zzgpq.zzb.j();
    }

    public final String zzd() [...] // Potential decryptor

    public final String zze() [...] // Potential decryptor

    public final List zzf() {
        return this.zzl;
    }
}

