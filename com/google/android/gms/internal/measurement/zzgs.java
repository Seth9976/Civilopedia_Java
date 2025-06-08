package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgs extends zzke implements zzlm {
    private static final zzgs zza;
    private int zze;
    private zzkl zzf;
    private zzgo zzg;

    static {
        zzgs zzgs0 = new zzgs();
        zzgs.zza = zzgs0;
        zzke.f(zzgs.class, zzgs0);
    }

    public zzgs() {
        this.zzf = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgs.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgx.class, "zzg"});
            }
            case 3: {
                return new zzgs();
            }
            case 4: {
                return new zzgr(zzgs.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgs.zza;
            }
        }
    }

    public final zzgo zza() {
        return this.zzg == null ? zzgo.zzc() : this.zzg;
    }

    public final List zzc() {
        return this.zzf;
    }
}

