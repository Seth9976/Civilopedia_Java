package com.google.android.gms.internal.ads;

public final class zzgox extends zzgkq implements zzgmb {
    private static final zzgox zzb;
    private int zze;
    private zzgow zzf;
    private zzgkz zzg;
    private zzgji zzh;
    private zzgji zzi;
    private int zzj;
    private byte zzk;

    static {
        zzgox zzgox0 = new zzgox();
        zzgox.zzb = zzgox0;
        zzgkq.i(zzgox.class, zzgox0);
    }

    public zzgox() {
        this.zzk = 2;
        this.zzg = O9.l;
        this.zzh = zzgji.zzb;
        this.zzi = zzgji.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzk;
            }
            case 2: {
                return new P9(zzgox.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzgox();
            }
            case 4: {
                return new zzgou(zzgox.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgox.zzb;
            }
            default: {
                if(zzgkq0 == null) {
                    b = 0;
                }
                this.zzk = b;
                return null;
            }
        }
    }

    public static void m(zzgox zzgox0, zzgot zzgot0) {
        zzgot0.getClass();
        zzgkz zzgkz0 = zzgox0.zzg;
        if(!zzgkz0.zzc()) {
            zzgox0.zzg = zzgkq.g(zzgkz0);
        }
        zzgox0.zzg.add(zzgot0);
    }

    public static zzgou zza() {
        return (zzgou)zzgox.zzb.j();
    }
}

