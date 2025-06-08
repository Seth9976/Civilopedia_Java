package com.google.android.gms.internal.ads;

public final class zzgpk extends zzgkq implements zzgmb {
    private static final zzgpk zzb;
    private int zze;
    private int zzf;
    private String zzg;
    private zzgox zzh;
    private zzgpb zzi;
    private int zzj;
    private zzgkv zzk;
    private String zzl;
    private int zzm;
    private zzgkz zzn;
    private byte zzo;

    static {
        zzgpk zzgpk0 = new zzgpk();
        zzgpk.zzb = zzgpk0;
        zzgkq.i(zzgpk.class, zzgpk0);
    }

    public zzgpk() {
        this.zzo = 2;
        this.zzg = "";
        this.zzk = x9.l;
        this.zzl = "";
        this.zzn = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        byte b = 1;
        switch(v - 1) {
            case 0: {
                return this.zzo;
            }
            case 2: {
                return new P9(zzgpk.zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001A", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", w0.A, "zzn"});
            }
            case 3: {
                return new zzgpk();
            }
            case 4: {
                return new zzgpj(zzgpk.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzgpk.zzb;
            }
            default: {
                if(zzgkq0 == null) {
                    b = 0;
                }
                this.zzo = b;
                return null;
            }
        }
    }

    public static void m(zzgpk zzgpk0, int v) {
        zzgpk0.zze |= 1;
        zzgpk0.zzf = v;
    }

    public static void n(zzgpk zzgpk0, String s) {
        s.getClass();
        zzgpk0.zze |= 2;
        zzgpk0.zzg = s;
    }

    public static void o(zzgpk zzgpk0, zzgox zzgox0) {
        zzgox0.getClass();
        zzgpk0.zzh = zzgox0;
        zzgpk0.zze |= 4;
    }

    public static void p(zzgpk zzgpk0, String s) {
        s.getClass();
        zzgkz zzgkz0 = zzgpk0.zzn;
        if(!zzgkz0.zzc()) {
            zzgpk0.zzn = zzgkq.g(zzgkz0);
        }
        zzgpk0.zzn.add(s);
    }

    public static void q(zzgpk zzgpk0, int v) {
        zzgpk0.zzm = v - 1;
        zzgpk0.zze |= 0x40;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public static zzgpj zzc() {
        return (zzgpj)zzgpk.zzb.j();
    }

    public final String zze() [...] // Potential decryptor
}

