package com.google.android.gms.internal.measurement;

public final class zzfg extends zzke implements zzlm {
    private static final zzfg zza;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzfg zzfg0 = new zzfg();
        zzfg.zza = zzfg0;
        zzke.f(zzfg.class, zzfg0);
    }

    public zzfg() {
        this.zzf = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfg.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfg();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzff(zzfg.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzfg.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

