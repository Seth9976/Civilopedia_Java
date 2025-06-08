package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzej extends zzke implements zzlm {
    private static final zzej zza;
    private int zze;
    private int zzf;
    private String zzg;
    private zzkl zzh;
    private boolean zzi;
    private zzeq zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzej zzej0 = new zzej();
        zzej.zza = zzej0;
        zzke.f(zzej.class, zzej0);
    }

    public zzej() {
        this.zzg = "";
        this.zzh = q0.l;
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzej.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001B\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzel.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 3: {
                return new zzej();
            }
            case 4: {
                return new zzei(zzej.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzej.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzej zzej0, String s) {
        zzej0.zze |= 2;
        zzej0.zzg = s;
    }

    public static void k(zzej zzej0, int v, zzel zzel0) {
        zzel0.getClass();
        zzkl zzkl0 = zzej0.zzh;
        if(!zzkl0.zzc()) {
            zzej0.zzh = zzke.d(zzkl0);
        }
        zzej0.zzh.set(v, zzel0);
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzei zzc() {
        return (zzei)zzej.zza.g();
    }

    public final zzel zze(int v) {
        return (zzel)this.zzh.get(v);
    }

    public final zzeq zzf() {
        return this.zzj == null ? zzeq.zzb() : this.zzj;
    }

    public final String zzg() [...] // Potential decryptor

    public final List zzh() {
        return this.zzh;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzm() {
        return this.zzl;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zze & 0x40) != 0;
    }
}

