package com.google.android.gms.internal.measurement;

public final class zzfu extends zzke implements zzlm {
    private static final zzfu zza;
    private int zze;
    private String zzf;
    private long zzg;

    static {
        zzfu zzfu0 = new zzfu();
        zzfu.zza = zzfu0;
        zzke.f(zzfu.class, zzfu0);
    }

    public zzfu() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfu.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfu();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzft(zzfu.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzfu.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void j(zzfu zzfu0, String s) {
        s.getClass();
        zzfu0.zze |= 1;
        zzfu0.zzf = s;
    }

    public static void k(zzfu zzfu0, long v) {
        zzfu0.zze |= 2;
        zzfu0.zzg = v;
    }

    public static zzft zza() {
        return (zzft)zzfu.zza.g();
    }
}

