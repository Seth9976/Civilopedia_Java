package com.google.android.gms.internal.ads;

import N.n;
import java.io.IOException;

public final class zzaqv extends zzgkq implements zzgmb {
    private static final zzaqv zzb;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaqv zzaqv0 = new zzaqv();
        zzaqv.zzb = zzaqv0;
        zzgkq.i(zzaqv.class, zzaqv0);
    }

    public zzaqv() {
        this.zzf = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzaqv.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzaqv();
            }
            case 4: {
                return new zzaqu(zzaqv.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
            }
            case 5: {
                return zzaqv.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void m(zzaqv zzaqv0, String s) {
        s.getClass();
        zzaqv0.zze |= 1;
        zzaqv0.zzf = s;
    }

    public static void n(zzaqv zzaqv0, long v) {
        zzaqv0.zze |= 16;
        zzaqv0.zzj = v;
    }

    public static void o(zzaqv zzaqv0, String s) {
        s.getClass();
        zzaqv0.zze |= 2;
        zzaqv0.zzg = s;
    }

    public static void p(zzaqv zzaqv0, long v) {
        zzaqv0.zze |= 4;
        zzaqv0.zzh = v;
    }

    public static void q(zzaqv zzaqv0, long v) {
        zzaqv0.zze |= 8;
        zzaqv0.zzi = v;
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public static zzaqu zze() {
        return (zzaqu)zzaqv.zzb.j();
    }

    public static zzaqv zzg() {
        return zzaqv.zzb;
    }

    public static zzaqv zzh(zzgji zzgji0) throws zzglc {
        zzgkc zzgkc0 = zzgkc.zza();
        zzgjq zzgjq0 = zzgji0.zzl();
        zzgkq zzgkq0 = (zzgkq)zzaqv.zzb.k(4, null);
        try {
            Class class0 = zzgkq0.getClass();
            T9 t90 = N9.c.a(class0);
            t90.g(zzgkq0, (zzgjq0.b == null ? new n(zzgjq0) : zzgjq0.b), zzgkc0);
            t90.zzf(zzgkq0);
        }
        catch(zzglc zzglc0) {
            if(zzglc0.j) {
                zzglc0 = new zzglc(zzglc0);
            }
            zzglc0.zzh(zzgkq0);
            throw zzglc0;
        }
        catch(zzgnj zzgnj0) {
            zzglc zzglc1 = zzgnj0.zza();
            zzglc1.zzh(zzgkq0);
            throw zzglc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzglc) {
                throw (zzglc)iOException0.getCause();
            }
            zzglc zzglc2 = new zzglc(iOException0);
            zzglc2.zzh(zzgkq0);
            throw zzglc2;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzglc) {
                throw (zzglc)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            zzgjq0.zzz(0);
        }
        catch(zzglc zzglc3) {
            zzglc3.zzh(zzgkq0);
            throw zzglc3;
        }
        zzgkq.d(zzgkq0);
        zzgkq.d(zzgkq0);
        return (zzaqv)zzgkq0;
    }

    public static zzaqv zzi(zzgji zzgji0, zzgkc zzgkc0) throws zzglc {
        return (zzaqv)zzgkq.f(zzaqv.zzb, zzgji0, zzgkc0);
    }

    public final String zzj() [...] // Potential decryptor

    public final String zzk() [...] // Potential decryptor
}

