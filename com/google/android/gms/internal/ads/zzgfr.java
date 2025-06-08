package com.google.android.gms.internal.ads;

@Deprecated
public final class zzgfr extends zzgkq implements zzgmb {
    private static final zzgfr zzb;
    private String zze;
    private String zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;

    static {
        zzgfr zzgfr0 = new zzgfr();
        zzgfr.zzb = zzgfr0;
        zzgkq.i(zzgfr.class, zzgfr0);
    }

    public zzgfr() {
        this.zze = "";
        this.zzf = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfr.zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000B\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzgfr();
            }
            case 4: {
                return new zzgfq(zzgfr.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgfr.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public final int zza() {
        return this.zzg;
    }

    public final String zzd() [...] // Potential decryptor

    public final String zze() [...] // Potential decryptor

    public final String zzf() [...] // Potential decryptor

    public final boolean zzg() {
        return this.zzh;
    }
}

