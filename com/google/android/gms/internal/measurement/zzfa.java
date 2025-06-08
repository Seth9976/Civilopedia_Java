package com.google.android.gms.internal.measurement;

public final class zzfa extends zzke implements zzlm {
    private static final zzfa zza;
    private int zze;
    private String zzf;
    private zzkl zzg;
    private boolean zzh;

    static {
        zzfa zzfa0 = new zzfa();
        zzfa.zza = zzfa0;
        zzke.f(zzfa.class, zzfa0);
    }

    public zzfa() {
        this.zzf = "";
        this.zzg = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfa.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzfg.class, "zzh"});
            }
            case 3: {
                return new zzfa();
            }
            case 4: {
                return new zzez(zzfa.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfa.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final String zzb() [...] // Potential decryptor
}

