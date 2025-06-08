package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public final class zzjz extends zzhk implements zzin {
    private static final zzjz zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private int zzg;
    private zzki zzh;

    static {
        zzjz zzjz0 = new zzjz();
        zzjz.zzb = zzjz0;
        zzhk.h(zzjz.class, zzjz0);
    }

    public zzjz() {
        this.zze = 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzjz.zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", a0.c, "zzh", zzlb.class});
            }
            case 3: {
                return new zzjz();
            }
            case 4: {
                return new zzjx(zzjz.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
            }
            case 5: {
                return zzjz.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static void k(zzjz zzjz0, zzki zzki0) {
        zzki0.getClass();
        zzjz0.zzh = zzki0;
        zzjz0.zzd |= 2;
    }

    public static void l(zzjz zzjz0, zzlb zzlb0) {
        zzlb0.getClass();
        zzjz0.zzf = zzlb0;
        zzjz0.zze = 4;
    }

    public static void m(zzjz zzjz0, int v) {
        zzjz0.zzg = v - 1;
        zzjz0.zzd |= 1;
    }

    public static zzjz zzC(byte[] arr_b, zzgw zzgw0) throws zzhr {
        zzhk zzhk0 = zzjz.zzb;
        if(arr_b.length != 0) {
            zzhk0 = (zzhk)((zzjz)zzhk0).c(4);
            try {
                Class class0 = zzhk0.getClass();
                I0 i00 = F0.c.a(class0);
                d0 d00 = new d0(zzgw0);
                i00.c(zzhk0, arr_b, 0, arr_b.length, d00);
                i00.zzf(zzhk0);
            }
            catch(zzhr zzhr0) {
                throw zzhr0;
            }
            catch(zzji zzji0) {
                throw zzji0.zza();
            }
            catch(IOException iOException0) {
                throw iOException0.getCause() instanceof zzhr ? ((zzhr)iOException0.getCause()) : new zzhr(iOException0);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if(zzhk0 != null && !zzhk.j(zzhk0, true)) {
            throw new zzji(zzhk0).zza();
        }
        return (zzjz)zzhk0;
    }

    public static zzjx zzc() {
        return (zzjx)zzjz.zzb.d();
    }
}

