package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzex extends zzke implements zzlm {
    private static final zzex zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private zzkl zzi;

    static {
        zzex zzex0 = new zzex();
        zzex.zza = zzex0;
        zzke.f(zzex.class, zzex0);
    }

    public zzex() {
        this.zzg = "";
        this.zzi = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzex.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001A", new Object[]{"zze", "zzf", z.c, "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzex();
            }
            case 4: {
                return new zzet(zzex.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzex.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final int zza() {
        return this.zzi.size();
    }

    public static zzex zzc() {
        return zzex.zza;
    }

    public final String zzd() [...] // Potential decryptor

    public final List zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    public final int zzj() {
        int v = zzew.zza(this.zzf);
        return v == 0 ? 1 : v;
    }
}

