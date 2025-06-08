package com.google.android.gms.internal.measurement;

public final class zzes extends zzke implements zzlm {
    private static final zzes zza;
    private int zze;
    private int zzf;
    private String zzg;
    private zzel zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzes zzes0 = new zzes();
        zzes.zza = zzes0;
        zzke.f(zzes.class, zzes0);
    }

    public zzes() {
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzes.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzes();
            }
            case 4: {
                return new zzer(zzes.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzes.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzes zzes0, String s) {
        zzes0.zze |= 2;
        zzes0.zzg = s;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzel zzb() {
        return this.zzh == null ? zzel.zzb() : this.zzh;
    }

    public static zzer zzc() {
        return (zzer)zzes.zza.g();
    }

    public final String zze() [...] // Potential decryptor

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 0x20) != 0;
    }
}

