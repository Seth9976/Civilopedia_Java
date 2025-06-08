package com.google.android.gms.internal.measurement;

public final class zzgf extends zzke implements zzlm {
    private static final zzgf zza;
    private int zze;
    private int zzf;
    private zzkl zzg;

    static {
        zzgf zzgf0 = new zzgf();
        zzgf.zza = zzgf0;
        zzke.f(zzgf.class, zzgf0);
    }

    public zzgf() {
        this.zzf = 1;
        this.zzg = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgf.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001B", new Object[]{"zze", "zzf", z.e, "zzg", zzfu.class});
            }
            case 3: {
                return new zzgf();
            }
            case 4: {
                return new zzgd(zzgf.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzgf.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzgf zzgf0, zzfu zzfu0) {
        zzfu0.getClass();
        zzkl zzkl0 = zzgf0.zzg;
        if(!zzkl0.zzc()) {
            zzgf0.zzg = zzke.d(zzkl0);
        }
        zzgf0.zzg.add(zzfu0);
    }

    public static zzgd zza() {
        return (zzgd)zzgf.zza.g();
    }
}

