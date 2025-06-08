package com.google.android.gms.internal.ads;

public final class zzamh extends zzgkq implements zzgmb {
    private static final zzamh zzb;
    private int zze;
    private long zzf;
    private String zzg;
    private zzgji zzh;

    static {
        zzamh zzamh0 = new zzamh();
        zzamh.zzb = zzamh0;
        zzgkq.i(zzamh.class, zzamh0);
    }

    public zzamh() {
        this.zzg = "";
        this.zzh = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzamh.zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzamh();
            }
            case 4: {
                return new zzamg(zzamh.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            default: {
                return v - 1 != 5 ? null : zzamh.zzb;
            }
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public static zzamh zzd() {
        return zzamh.zzb;
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}

