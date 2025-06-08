package com.google.android.gms.internal.ads;

public final class zzaml extends zzgkq implements zzgmb {
    private static final zzaml zzb;
    private int zze;
    private zzgkz zzf;
    private zzgji zzg;
    private int zzh;
    private int zzi;

    static {
        zzaml zzaml0 = new zzaml();
        zzaml.zzb = zzaml0;
        zzgkq.i(zzaml.class, zzaml0);
    }

    public zzaml() {
        this.zzf = O9.l;
        this.zzg = zzgji.zzb;
        this.zzh = 1;
        this.zzi = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzaml.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001C\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", w0.i, "zzi", w0.g});
            }
            case 3: {
                return new zzaml();
            }
            case 4: {
                return new zzamk(zzaml.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzaml.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzaml zzaml0, zzgji zzgji0) {
        zzgkz zzgkz0 = zzaml0.zzf;
        if(!zzgkz0.zzc()) {
            zzaml0.zzf = zzgkq.g(zzgkz0);
        }
        zzaml0.zzf.add(zzgji0);
    }

    public static void n(zzaml zzaml0, zzgji zzgji0) {
        zzaml0.zze |= 1;
        zzaml0.zzg = zzgji0;
    }

    public static void o(zzaml zzaml0, int v) {
        zzaml0.zzi = v - 1;
        zzaml0.zze |= 4;
    }

    public static zzamk zza() {
        return (zzamk)zzaml.zzb.j();
    }
}

