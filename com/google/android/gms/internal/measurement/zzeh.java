package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzeh extends zzke implements zzlm {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkl zzg;
    private zzkl zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzeh0 = new zzeh();
        zzeh.zza = zzeh0;
        zzke.f(zzeh.class, zzeh0);
    }

    public zzeh() {
        this.zzg = q0.l;
        this.zzh = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzeh.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
            }
            case 3: {
                return new zzeh();
            }
            case 4: {
                return new zzeg(zzeh.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzeh.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzeh zzeh0, int v, zzes zzes0) {
        zzes0.getClass();
        zzkl zzkl0 = zzeh0.zzg;
        if(!zzkl0.zzc()) {
            zzeh0.zzg = zzke.d(zzkl0);
        }
        zzeh0.zzg.set(v, zzes0);
    }

    public static void l(zzeh zzeh0, int v, zzej zzej0) {
        zzej0.getClass();
        zzkl zzkl0 = zzeh0.zzh;
        if(!zzkl0.zzc()) {
            zzeh0.zzh = zzke.d(zzkl0);
        }
        zzeh0.zzh.set(v, zzej0);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int v) {
        return (zzej)this.zzh.get(v);
    }

    public final zzes zzf(int v) {
        return (zzes)this.zzg.get(v);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }
}

