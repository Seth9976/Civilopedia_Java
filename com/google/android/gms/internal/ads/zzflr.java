package com.google.android.gms.internal.ads;

public final class zzflr extends zzgkq implements zzgmb {
    private static final zzgkw zzb;
    private static final zzflr zze;
    private int zzf;
    private zzgkv zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static {
        zzflr.zzb = new S(17);
        zzflr zzflr0 = new zzflr();
        zzflr.zze = zzflr0;
        zzgkq.i(zzflr.class, zzflr0);
    }

    public zzflr() {
        this.zzg = x9.l;
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzflr.zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001E\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", w0.s, "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzflr();
            }
            case 4: {
                return new zzflq(zzflr.zze);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzflr.zze;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzflr zzflr0, String s) {
        s.getClass();
        zzflr0.zzf |= 1;
        zzflr0.zzh = s;
    }

    public static void n(zzflr zzflr0) {
        zzgkv zzgkv0 = zzflr0.zzg;
        if(!zzgkv0.zzc()) {
            int v = zzgkv0.size();
            zzflr0.zzg = zzgkv0.zzg((v == 0 ? 10 : v + v));
        }
        zzflr0.zzg.zzh(2);
    }

    public static zzflq zza() {
        return (zzflq)zzflr.zze.j();
    }
}

