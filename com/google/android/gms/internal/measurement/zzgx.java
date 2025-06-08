package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgx extends zzke implements zzlm {
    private static final zzgx zza;
    private int zze;
    private int zzf;
    private zzkl zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;

    static {
        zzgx zzgx0 = new zzgx();
        zzgx.zza = zzgx0;
        zzke.f(zzgx.class, zzgx0);
    }

    public zzgx() {
        this.zzg = q0.l;
        this.zzh = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgx.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001B\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", z.f, "zzg", zzgx.class, "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzgx();
            }
            case 4: {
                return new zzgt(zzgx.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzgx.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final double zza() {
        return this.zzk;
    }

    public final String zzc() [...] // Potential decryptor

    public final String zzd() [...] // Potential decryptor

    public final List zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzj;
    }

    public final boolean zzg() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 4) != 0;
    }

    public final int zzj() {
        int v = zzgw.zza(this.zzf);
        return v == 0 ? 1 : v;
    }
}

