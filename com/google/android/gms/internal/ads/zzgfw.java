package com.google.android.gms.internal.ads;

import N.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class zzgfw extends zzgkq implements zzgmb {
    private static final zzgfw zzb;
    private int zze;
    private zzgkz zzf;

    static {
        zzgfw zzgfw0 = new zzgfw();
        zzgfw.zzb = zzgfw0;
        zzgkq.i(zzgfw.class, zzgfw0);
    }

    public zzgfw() {
        this.zzf = O9.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzgkq
    public final Object k(int v, zzgkq zzgkq0) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new P9(zzgfw.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zze", "zzf", zzgfv.class});
            }
            case 3: {
                return new zzgfw();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgft(zzgfw.zzb);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgkm;-><init>(Lcom/google/android/gms/internal/ads/zzgkq;)V
                    }
                    case 5: {
                        return zzgfw.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void m(zzgfw zzgfw0, int v) {
        zzgfw0.zze = v;
    }

    public static void n(zzgfw zzgfw0, zzgfv zzgfv0) {
        zzgfv0.getClass();
        zzgkz zzgkz0 = zzgfw0.zzf;
        if(!zzgkz0.zzc()) {
            zzgfw0.zzf = zzgkq.g(zzgkz0);
        }
        zzgfw0.zzf.add(zzgfv0);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zze;
    }

    public static zzgft zzd() {
        return (zzgft)zzgfw.zzb.j();
    }

    public static zzgfw zzf(InputStream inputStream0, zzgkc zzgkc0) throws IOException {
        zzgjq zzgjq0 = zzgjq.zzH(inputStream0, 0x1000);
        zzgkq zzgkq0 = (zzgkq)zzgfw.zzb.k(4, null);
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
        zzgkq.d(zzgkq0);
        return (zzgfw)zzgkq0;
    }

    public static zzgfw zzg(byte[] arr_b, zzgkc zzgkc0) throws zzglc {
        zzgkq zzgkq0 = zzgkq.l(zzgfw.zzb, arr_b, arr_b.length, zzgkc0);
        zzgkq.d(zzgkq0);
        return (zzgfw)zzgkq0;
    }

    public final List zzh() {
        return this.zzf;
    }
}

