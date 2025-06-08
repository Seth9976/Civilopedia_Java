package com.google.android.gms.internal.measurement;

public final class zzfo extends zzke implements zzlm {
    private static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfo0 = new zzfo();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzke;-><init>()V
        zzfo.zza = zzfo0;
        zzke.f(zzfo.class, zzfo0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfo.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzfo();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzke;-><init>()V
            }
            case 4: {
                return new zzfn(zzfo.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfo.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzfo zzfo0, int v) {
        zzfo0.zze |= 1;
        zzfo0.zzf = v;
    }

    public static void k(zzfo zzfo0, zzgh zzgh0) {
        zzgh0.getClass();
        zzfo0.zzg = zzgh0;
        zzfo0.zze |= 2;
    }

    public static void l(zzfo zzfo0, zzgh zzgh0) {
        zzfo0.zzh = zzgh0;
        zzfo0.zze |= 4;
    }

    public static void m(zzfo zzfo0, boolean z) {
        zzfo0.zze |= 8;
        zzfo0.zzi = z;
    }

    public final int zza() {
        return this.zzf;
    }

    public static zzfn zzb() {
        return (zzfn)zzfo.zza.g();
    }

    public final zzgh zzd() {
        return this.zzg == null ? zzgh.zzh() : this.zzg;
    }

    public final zzgh zze() {
        return this.zzh == null ? zzgh.zzh() : this.zzh;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}

