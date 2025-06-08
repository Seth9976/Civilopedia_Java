package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfe extends zzke implements zzlm {
    private static final zzfe zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private zzkl zzi;
    private zzkl zzj;
    private zzkl zzk;
    private String zzl;
    private boolean zzm;
    private zzkl zzn;
    private zzkl zzo;
    private String zzp;

    static {
        zzfe zzfe0 = new zzfe();
        zzfe.zza = zzfe0;
        zzke.f(zzfe.class, zzfe0);
    }

    public zzfe() {
        this.zzg = "";
        this.zzi = q0.l;
        this.zzj = q0.l;
        this.zzk = q0.l;
        this.zzl = "";
        this.zzn = q0.l;
        this.zzo = q0.l;
        this.zzp = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzfe.zza, "\u0001\u000B\u0000\u0001\u0001\u000B\u000B\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001B\u0005\u001B\u0006\u001B\u0007ဈ\u0003\bဇ\u0004\t\u001B\n\u001B\u000Bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzfi.class, "zzj", zzfc.class, "zzk", zzeh.class, "zzl", "zzm", "zzn", zzgs.class, "zzo", zzfa.class, "zzp"});
            }
            case 3: {
                return new zzfe();
            }
            case 4: {
                return new zzfd(zzfe.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzfe.zza;
            }
            default: {
                return null;
            }
        }
    }

    public static void j(zzfe zzfe0, int v, zzfc zzfc0) {
        zzfc0.getClass();
        zzkl zzkl0 = zzfe0.zzj;
        if(!zzkl0.zzc()) {
            zzfe0.zzj = zzke.d(zzkl0);
        }
        zzfe0.zzj.set(v, zzfc0);
    }

    public static void k(zzfe zzfe0) {
        zzfe0.zzk = q0.l;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzfc zzd(int v) {
        return (zzfc)this.zzj.get(v);
    }

    public static zzfd zze() {
        return (zzfd)zzfe.zza.g();
    }

    public static zzfe zzg() {
        return zzfe.zza;
    }

    public final String zzh() [...] // Potential decryptor

    public final String zzi() [...] // Potential decryptor

    public final List zzj() {
        return this.zzk;
    }

    public final List zzk() {
        return this.zzo;
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzi;
    }

    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }
}

