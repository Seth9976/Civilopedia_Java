package com.google.android.gms.internal.ads;

public final class zzbeh extends zzgkq implements zzgmb {
    private static final zzbeh zzb;
    private zzgkz zze;

    static {
        zzbeh zzbeh0 = new zzbeh();
        zzbeh.zzb = zzbeh0;
        zzgkq.i(zzbeh.class, zzbeh0);
    }

    public zzbeh() {
        this.zze = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzbeh.zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zze", zzbea.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzbeh();
                    }
                    case 4: {
                        return new zzbeb(zzbeh.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzbeh.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzbeh zzbeh0, zzbea zzbea0) {
        zzbea0.getClass();
        zzgkz zzgkz0 = zzbeh0.zze;
        if(!zzgkz0.zzc()) {
            zzbeh0.zze = zzgkq.g(zzgkz0);
        }
        zzbeh0.zze.add(zzbea0);
    }

    public static zzbeb zza() {
        return (zzbeb)zzbeh.zzb.j();
    }
}

