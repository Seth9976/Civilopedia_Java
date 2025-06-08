package com.google.android.gms.internal.measurement;

public final class zzfq extends zzke implements zzlm {
    private static final zzfq zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfq zzfq0 = new zzfq();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzke;-><init>()V
        zzfq.zza = zzfq0;
        zzke.f(zzfq.class, zzfq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfq.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfq();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzke;-><init>()V
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzfp(zzfq.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzfq.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void j(zzfq zzfq0, int v) {
        zzfq0.zze |= 1;
        zzfq0.zzf = v;
    }

    public static void k(zzfq zzfq0, long v) {
        zzfq0.zze |= 2;
        zzfq0.zzg = v;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public static zzfp zzc() {
        return (zzfp)zzfq.zza.g();
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }
}

