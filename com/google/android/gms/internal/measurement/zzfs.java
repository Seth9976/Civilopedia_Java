package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfs extends zzke implements zzlm {
    private static final zzfs zza;
    private int zze;
    private zzkl zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfs zzfs0 = new zzfs();
        zzfs.zza = zzfs0;
        zzke.f(zzfs.class, zzfs0);
    }

    public zzfs() {
        this.zzf = q0.l;
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfs.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001B\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfw.class, "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzfs();
            }
            case 4: {
                return new zzfr(zzfs.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfs.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzfs zzfs0, int v, zzfw zzfw0) {
        zzfw0.getClass();
        zzfs0.r();
        zzfs0.zzf.set(v, zzfw0);
    }

    public static void k(zzfs zzfs0, zzfw zzfw0) {
        zzfw0.getClass();
        zzfs0.r();
        zzfs0.zzf.add(zzfw0);
    }

    public static void l(zzfs zzfs0, Iterable iterable0) {
        zzfs0.r();
        zzin.b(iterable0, zzfs0.zzf);
    }

    public static void m(zzfs zzfs0) {
        zzfs0.zzf = q0.l;
    }

    public static void n(zzfs zzfs0, int v) {
        zzfs0.r();
        zzfs0.zzf.remove(v);
    }

    public static void o(zzfs zzfs0, String s) {
        s.getClass();
        zzfs0.zze |= 1;
        zzfs0.zzg = s;
    }

    public static void p(long v, zzfs zzfs0) {
        zzfs0.zze |= 2;
        zzfs0.zzh = v;
    }

    public static void q(long v, zzfs zzfs0) {
        zzfs0.zze |= 4;
        zzfs0.zzi = v;
    }

    public final void r() {
        zzkl zzkl0 = this.zzf;
        if(!zzkl0.zzc()) {
            this.zzf = zzke.d(zzkl0);
        }
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public static zzfr zze() {
        return (zzfr)zzfs.zza.g();
    }

    public final zzfw zzg(int v) {
        return (zzfw)this.zzf.get(v);
    }

    public final String zzh() [...] // Potential decryptor

    public final List zzi() {
        return this.zzf;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}

