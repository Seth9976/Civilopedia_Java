package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfw extends zzke implements zzlm {
    private static final zzfw zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private zzkl zzk;

    static {
        zzfw zzfw0 = new zzfw();
        zzfw.zza = zzfw0;
        zzke.f(zzfw.class, zzfw0);
    }

    public zzfw() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfw.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001B", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfw.class});
            }
            case 3: {
                return new zzfw();
            }
            case 4: {
                return new zzfv(zzfw.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfw.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzfw zzfw0, String s) {
        s.getClass();
        zzfw0.zze |= 1;
        zzfw0.zzf = s;
    }

    public static void k(zzfw zzfw0, String s) {
        s.getClass();
        zzfw0.zze |= 2;
        zzfw0.zzg = s;
    }

    public static void l(zzfw zzfw0) {
        zzfw0.zze &= -3;
        zzfw0.zzg = "";
    }

    public static void m(zzfw zzfw0, long v) {
        zzfw0.zze |= 4;
        zzfw0.zzh = v;
    }

    public static void n(zzfw zzfw0) {
        zzfw0.zze &= -5;
        zzfw0.zzh = 0L;
    }

    public static void o(zzfw zzfw0, double f) {
        zzfw0.zze |= 16;
        zzfw0.zzj = f;
    }

    public static void p(zzfw zzfw0) {
        zzfw0.zze &= -17;
        zzfw0.zzj = 0.0;
    }

    public static void q(zzfw zzfw0, zzfw zzfw1) {
        zzfw1.getClass();
        zzkl zzkl0 = zzfw0.zzk;
        if(!zzkl0.zzc()) {
            zzfw0.zzk = zzke.d(zzkl0);
        }
        zzfw0.zzk.add(zzfw1);
    }

    public static void r(zzfw zzfw0, Iterable iterable0) {
        zzkl zzkl0 = zzfw0.zzk;
        if(!zzkl0.zzc()) {
            zzfw0.zzk = zzke.d(zzkl0);
        }
        zzin.b(iterable0, zzfw0.zzk);
    }

    public static void s(zzfw zzfw0) {
        zzfw0.zzk = q0.l;
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public static zzfv zze() {
        return (zzfv)zzfw.zza.g();
    }

    public final String zzg() [...] // Potential decryptor

    public final String zzh() [...] // Potential decryptor

    public final List zzi() {
        return this.zzk;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}

