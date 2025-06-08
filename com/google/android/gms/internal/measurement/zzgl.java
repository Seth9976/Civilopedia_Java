package com.google.android.gms.internal.measurement;

public final class zzgl extends zzke implements zzlm {
    private static final zzgl zza;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgl zzgl0 = new zzgl();
        zzgl.zza = zzgl0;
        zzke.f(zzgl.class, zzgl0);
    }

    public zzgl() {
        this.zzg = "";
        this.zzh = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgl.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzgl();
            }
            case 4: {
                return new zzgk(zzgl.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzgl.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzgl zzgl0, long v) {
        zzgl0.zze |= 1;
        zzgl0.zzf = v;
    }

    public static void k(zzgl zzgl0, String s) {
        s.getClass();
        zzgl0.zze |= 2;
        zzgl0.zzg = s;
    }

    public static void l(zzgl zzgl0, String s) {
        s.getClass();
        zzgl0.zze |= 4;
        zzgl0.zzh = s;
    }

    public static void m(zzgl zzgl0) {
        zzgl0.zze &= -5;
        zzgl0.zzh = "";
    }

    public static void n(zzgl zzgl0, long v) {
        zzgl0.zze |= 8;
        zzgl0.zzi = v;
    }

    public static void o(zzgl zzgl0) {
        zzgl0.zze &= -9;
        zzgl0.zzi = 0L;
    }

    public static void p(zzgl zzgl0, double f) {
        zzgl0.zze |= 0x20;
        zzgl0.zzk = f;
    }

    public static void q(zzgl zzgl0) {
        zzgl0.zze &= -33;
        zzgl0.zzk = 0.0;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public static zzgk zzd() {
        return (zzgk)zzgl.zza.g();
    }

    public final String zzf() [...] // Potential decryptor

    public final String zzg() [...] // Potential decryptor

    public final boolean zzq() {
        return (this.zze & 0x20) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}

