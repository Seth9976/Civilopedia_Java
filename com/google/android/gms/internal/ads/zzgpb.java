package com.google.android.gms.internal.ads;

public final class zzgpb extends zzgkq implements zzgmb {
    private static final zzgpb zzb;
    private int zze;
    private zzgpa zzf;
    private zzgkz zzg;
    private zzgji zzh;
    private zzgji zzi;
    private int zzj;
    private zzgji zzk;
    private byte zzl;

    static {
        zzgpb zzgpb0 = new zzgpb();
        zzgpb.zzb = zzgpb0;
        zzgkq.i(zzgpb.class, zzgpb0);
    }

    public zzgpb() {
        this.zzl = 2;
        this.zzg = O9.l;
        this.zzh = zzgji.zzb;
        this.zzi = zzgji.zzb;
        this.zzk = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzl;
            }
            case 2: {
                return new P9(zzgpb.zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzgpb();
            }
            case 4: {
                return new zzgoy(zzgpb.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgpb.zzb;
            }
            default: {
                if(zzgkq0 == null) {
                    b = 0;
                }
                this.zzl = b;
                return null;
            }
        }
    }
}

