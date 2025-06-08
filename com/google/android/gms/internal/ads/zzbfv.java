package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzbfv extends zzgkq implements zzgmb {
    private static final zzgkw zzb;
    private static final zzbfv zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgkv zzk;
    private zzbfq zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbfv.zzb = new S(8);
        zzbfv zzbfv0 = new zzbfv();
        zzbfv.zze = zzbfv0;
        zzgkq.i(zzbfv.class, zzbfv0);
    }

    public zzbfv() {
        this.zzk = x9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbfv.zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001E\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000Bဌ\t\fဌ\n\rဂ\u000B", new Object[]{"zzf", "zzg", "zzh", w0.n, "zzi", "zzj", "zzk", zzbek.zzc(), "zzl", "zzm", w0.n, "zzn", w0.n, "zzo", w0.n, "zzp", "zzq", w0.n, "zzr", zzbfz.zzc(), "zzs"});
            }
            case 3: {
                return new zzbfv();
            }
            case 4: {
                return new zzbfu(zzbfv.zze);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzbfv.zze;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzbfv zzbfv0, int v) {
        zzbfv0.zzn = v - 1;
        zzbfv0.zzf |= 0x40;
    }

    public static void n(zzbfv zzbfv0, int v) {
        zzbfv0.zzo = v - 1;
        zzbfv0.zzf |= 0x80;
    }

    public static void o(zzbfv zzbfv0, int v) {
        zzbfv0.zzq = v - 1;
        zzbfv0.zzf |= 0x200;
    }

    public static void p(zzbfv zzbfv0, long v) {
        zzbfv0.zzf |= 1;
        zzbfv0.zzg = v;
    }

    public static void q(zzbfv zzbfv0, long v) {
        zzbfv0.zzf |= 4;
        zzbfv0.zzi = v;
    }

    public static void r(zzbfv zzbfv0, long v) {
        zzbfv0.zzf |= 8;
        zzbfv0.zzj = v;
    }

    public static void s(zzbfv zzbfv0, Iterable iterable0) {
        zzgkv zzgkv0 = zzbfv0.zzk;
        if(!zzgkv0.zzc()) {
            int v = zzgkv0.size();
            zzbfv0.zzk = zzgkv0.zzg((v == 0 ? 10 : v + v));
        }
        for(Object object0: iterable0) {
            zzbfv0.zzk.zzh(((zzbek)object0).zza());
        }
    }

    public static void t(zzbfv zzbfv0, zzbfq zzbfq0) {
        zzbfq0.getClass();
        zzbfv0.zzl = zzbfq0;
        zzbfv0.zzf |= 16;
    }

    public static void u(zzbfv zzbfv0, int v) {
        zzbfv0.zzf |= 0x100;
        zzbfv0.zzp = v;
    }

    public static void v(zzbfv zzbfv0, zzbfz zzbfz0) {
        zzbfv0.zzr = zzbfz0.zza();
        zzbfv0.zzf |= 0x400;
    }

    public static void w(zzbfv zzbfv0, long v) {
        zzbfv0.zzf |= 0x800;
        zzbfv0.zzs = v;
    }

    public static void x(zzbfv zzbfv0, int v) {
        zzbfv0.zzh = v - 1;
        zzbfv0.zzf |= 2;
    }

    public static void y(zzbfv zzbfv0, int v) {
        zzbfv0.zzm = v - 1;
        zzbfv0.zzf |= 0x20;
    }

    public final int zza() {
        return this.zzp;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbfq zzf() {
        return this.zzl == null ? zzbfq.zzd() : this.zzl;
    }

    public static zzbfu zzg() {
        return (zzbfu)zzbfv.zze.j();
    }

    public static zzbfv zzi(byte[] arr_b) throws zzglc {
        zzgkc zzgkc0 = zzgkc.zza();
        zzgkq zzgkq0 = zzgkq.l(zzbfv.zze, arr_b, arr_b.length, zzgkc0);
        zzgkq.d(zzgkq0);
        return (zzbfv)zzgkq0;
    }

    public final zzbfz zzj() {
        zzbfz zzbfz0 = zzbfz.zzb(this.zzr);
        return zzbfz0 == null ? zzbfz.zza : zzbfz0;
    }

    public final List zzk() {
        return new zzgkx(this.zzk, zzbfv.zzb);
    }

    public final int zzt() {
        int v = zzbfa.zza(this.zzn);
        return v == 0 ? 1 : v;
    }

    public final int zzu() {
        int v = zzbfa.zza(this.zzo);
        return v == 0 ? 1 : v;
    }

    public final int zzv() {
        int v = zzbfa.zza(this.zzq);
        return v == 0 ? 1 : v;
    }

    public final int zzw() {
        int v = zzbfa.zza(this.zzh);
        return v == 0 ? 1 : v;
    }

    public final int zzx() {
        int v = zzbfa.zza(this.zzm);
        return v == 0 ? 1 : v;
    }
}

