package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzga extends zzke implements zzlm {
    private static final zzga zza;
    private zzkl zze;

    static {
        zzga zzga0 = new zzga();
        zzga.zza = zzga0;
        zzke.f(zzga.class, zzga0);
    }

    public zzga() {
        this.zze = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzga.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zze", zzgc.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzga();
                    }
                    case 4: {
                        return new zzfz(zzga.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
                    }
                    case 5: {
                        return zzga.zza;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void j(zzga zzga0, zzgc zzgc0) {
        zzgc0.getClass();
        zzkl zzkl0 = zzga0.zze;
        if(!zzkl0.zzc()) {
            zzga0.zze = zzke.d(zzkl0);
        }
        zzga0.zze.add(zzgc0);
    }

    public static zzfz zza() {
        return (zzfz)zzga.zza.g();
    }

    public final zzgc zzc(int v) {
        return (zzgc)this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }
}

