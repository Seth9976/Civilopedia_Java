package com.google.android.gms.internal.measurement;

public final class zzel extends zzke implements zzlm {
    private static final zzel zza;
    private int zze;
    private zzex zzf;
    private zzeq zzg;
    private boolean zzh;
    private String zzi;

    static {
        zzel zzel0 = new zzel();
        zzel.zza = zzel0;
        zzke.f(zzel.class, zzel0);
    }

    public zzel() {
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzel.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzel();
            }
            case 4: {
                return new zzek(zzel.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzel.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzel zzel0, String s) {
        zzel0.zze |= 8;
        zzel0.zzi = s;
    }

    public static zzel zzb() {
        return zzel.zza;
    }

    public final zzeq zzc() {
        return this.zzg == null ? zzeq.zzb() : this.zzg;
    }

    public final zzex zzd() {
        return this.zzf == null ? zzex.zzc() : this.zzf;
    }

    public final String zze() [...] // Potential decryptor

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }
}

