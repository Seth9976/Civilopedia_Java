package com.google.android.gms.internal.measurement;

public final class zzfi extends zzke implements zzlm {
    private static final zzfi zza;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzfi zzfi0 = new zzfi();
        zzfi.zza = zzfi0;
        zzke.f(zzfi.class, zzfi0);
    }

    public zzfi() {
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
                return new r0(zzfi.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfi();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzfh(zzfi.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzfi.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final String zzb() [...] // Potential decryptor

    public final String zzc() [...] // Potential decryptor
}

