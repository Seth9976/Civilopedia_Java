package com.google.android.gms.internal.measurement;

public final class zzfy extends zzke implements zzlm {
    private static final zzfy zza;
    private int zze;
    private String zzf;
    private String zzg;
    private zzfm zzh;

    static {
        zzfy zzfy0 = new zzfy();
        zzfy.zza = zzfy0;
        zzke.f(zzfy.class, zzfy0);
    }

    public zzfy() {
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
                return new r0(zzfy.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzfy();
            }
            case 4: {
                return new zzfx(zzfy.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            default: {
                return v - 1 != 5 ? null : zzfy.zza;
            }
        }
    }
}

