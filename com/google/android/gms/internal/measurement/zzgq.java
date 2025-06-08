package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgq extends zzke implements zzlm {
    private static final zzgq zza;
    private int zze;
    private String zzf;
    private zzkl zzg;

    static {
        zzgq zzgq0 = new zzgq();
        zzgq.zza = zzgq0;
        zzke.f(zzgq.class, zzgq0);
    }

    public zzgq() {
        this.zzf = "";
        this.zzg = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgq.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B", new Object[]{"zze", "zzf", "zzg", zzgx.class});
            }
            case 3: {
                return new zzgq();
            }
            case 4: {
                return new zzgp(zzgq.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            default: {
                return v - 1 != 5 ? null : zzgq.zza;
            }
        }
    }

    public final String zzb() [...] // Potential decryptor

    public final List zzc() {
        return this.zzg;
    }
}

