package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgj extends zzke implements zzlm {
    private static final zzgj zza;
    private int zze;
    private int zzf;
    private zzkk zzg;

    static {
        zzgj zzgj0 = new zzgj();
        zzgj.zza = zzgj0;
        zzke.f(zzgj.class, zzgj0);
    }

    public zzgj() {
        this.zzg = d0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgj.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgj();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgi(zzgj.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzgj.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void j(zzgj zzgj0, int v) {
        zzgj0.zze |= 1;
        zzgj0.zzf = v;
    }

    public static void k(zzgj zzgj0, Iterable iterable0) {
        zzkk zzkk0 = zzgj0.zzg;
        if(!zzkk0.zzc()) {
            int v = zzkk0.size();
            zzgj0.zzg = zzkk0.zze((v == 0 ? 10 : v + v));
        }
        zzin.b(iterable0, zzgj0.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int v) {
        return this.zzg.zza(v);
    }

    public static zzgi zzd() {
        return (zzgi)zzgj.zza.g();
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }
}

