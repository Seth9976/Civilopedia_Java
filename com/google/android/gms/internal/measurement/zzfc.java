package com.google.android.gms.internal.measurement;

public final class zzfc extends zzke implements zzlm {
    private static final zzfc zza;
    private int zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzfc zzfc0 = new zzfc();
        zzfc.zza = zzfc0;
        zzke.f(zzfc.class, zzfc0);
    }

    public zzfc() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfc.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzfc();
            }
            case 4: {
                return new zzfb(zzfc.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfc.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzfc zzfc0, String s) {
        s.getClass();
        zzfc0.zze |= 1;
        zzfc0.zzf = s;
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() [...] // Potential decryptor

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 8) != 0;
    }
}

