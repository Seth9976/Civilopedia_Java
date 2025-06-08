package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgh extends zzke implements zzlm {
    private static final zzgh zza;
    private zzkk zze;
    private zzkk zzf;
    private zzkl zzg;
    private zzkl zzh;

    static {
        zzgh zzgh0 = new zzgh();
        zzgh.zza = zzgh0;
        zzke.f(zzgh.class, zzgh0);
    }

    public zzgh() {
        this.zze = d0.l;
        this.zzf = d0.l;
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
                return new r0(zzgh.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001B\u0004\u001B", new Object[]{"zze", "zzf", "zzg", zzfq.class, "zzh", zzgj.class});
            }
            case 3: {
                return new zzgh();
            }
            case 4: {
                return new zzgg(zzgh.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzgh.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzgh zzgh0, Iterable iterable0) {
        zzkk zzkk0 = zzgh0.zze;
        if(!zzkk0.zzc()) {
            int v = zzkk0.size();
            zzgh0.zze = zzkk0.zze((v == 0 ? 10 : v + v));
        }
        zzin.b(iterable0, zzgh0.zze);
    }

    public static void k(zzgh zzgh0) {
        zzgh0.zze = d0.l;
    }

    public static void l(zzgh zzgh0, Iterable iterable0) {
        zzkk zzkk0 = zzgh0.zzf;
        if(!zzkk0.zzc()) {
            int v = zzkk0.size();
            zzgh0.zzf = zzkk0.zze((v == 0 ? 10 : v + v));
        }
        zzin.b(iterable0, zzgh0.zzf);
    }

    public static void m(zzgh zzgh0) {
        zzgh0.zzf = d0.l;
    }

    public static void n(zzgh zzgh0, Iterable iterable0) {
        zzkl zzkl0 = zzgh0.zzg;
        if(!zzkl0.zzc()) {
            zzgh0.zzg = zzke.d(zzkl0);
        }
        zzin.b(iterable0, zzgh0.zzg);
    }

    public static void o(zzgh zzgh0) {
        zzgh0.zzg = q0.l;
    }

    public static void p(zzgh zzgh0, int v) {
        zzkl zzkl0 = zzgh0.zzg;
        if(!zzkl0.zzc()) {
            zzgh0.zzg = zzke.d(zzkl0);
        }
        zzgh0.zzg.remove(v);
    }

    public static void q(zzgh zzgh0, Iterable iterable0) {
        zzkl zzkl0 = zzgh0.zzh;
        if(!zzkl0.zzc()) {
            zzgh0.zzh = zzke.d(zzkl0);
        }
        zzin.b(iterable0, zzgh0.zzh);
    }

    public static void r(zzgh zzgh0) {
        zzgh0.zzh = q0.l;
    }

    public static void s(zzgh zzgh0, int v) {
        zzkl zzkl0 = zzgh0.zzh;
        if(!zzkl0.zzc()) {
            zzgh0.zzh = zzke.d(zzkl0);
        }
        zzgh0.zzh.remove(v);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfq zze(int v) {
        return (zzfq)this.zzg.get(v);
    }

    public static zzgg zzf() {
        return (zzgg)zzgh.zza.g();
    }

    public static zzgh zzh() {
        return zzgh.zza;
    }

    public final zzgj zzi(int v) {
        return (zzgj)this.zzh.get(v);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}

