package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgo extends zzke implements zzlm {
    private static final zzgo zza;
    private zzkl zze;

    static {
        zzgo zzgo0 = new zzgo();
        zzgo.zza = zzgo0;
        zzke.f(zzgo.class, zzgo0);
    }

    public zzgo() {
        this.zze = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgo.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zze", zzgq.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzgo();
                    }
                    case 4: {
                        return new zzgn(zzgo.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzgo.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final int zza() {
        return this.zze.size();
    }

    public static zzgo zzc() {
        return zzgo.zza;
    }

    public final List zzd() {
        return this.zze;
    }
}

