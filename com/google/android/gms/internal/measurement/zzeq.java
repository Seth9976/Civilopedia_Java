package com.google.android.gms.internal.measurement;

public final class zzeq extends zzke implements zzlm {
    private static final zzeq zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static {
        zzeq zzeq0 = new zzeq();
        zzeq.zza = zzeq0;
        zzke.f(zzeq.class, zzeq0);
    }

    public zzeq() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzeq.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", z.b, "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzeq();
            }
            case 4: {
                return new zzem(zzeq.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzeq.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static zzeq zzb() {
        return zzeq.zza;
    }

    public final String zzc() [...] // Potential decryptor

    public final String zzd() [...] // Potential decryptor

    public final String zze() [...] // Potential decryptor

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 8) != 0;
    }

    public final int zzm() {
        int v = zzep.zza(this.zzf);
        return v == 0 ? 1 : v;
    }
}

