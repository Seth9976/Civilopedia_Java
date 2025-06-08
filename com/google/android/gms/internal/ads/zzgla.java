package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzgla {
    public static final Charset a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzgjq zzf;

    static {
        Charset.forName("US-ASCII");
        zzgla.a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzgla.zzd = arr_b;
        zzgla.zze = ByteBuffer.wrap(arr_b);
        i9 i90 = new i9(arr_b, 0, 0);
        try {
            i90.zze(0);
            zzgla.zzf = i90;
        }
        catch(zzglc zzglc0) {
            throw new IllegalArgumentException(zzglc0);
        }
    }

    public static zzgma a(Object object0, Object object1) {
        return ((zzgma)object0).zzaM().zzah(((zzgma)object1)).zzan();
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int zzb(byte[] arr_b) {
        int v1 = arr_b.length;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 = v1 * 0x1F + arr_b[v];
        }
        return v1 == 0 ? 1 : v1;
    }

    public static int zzc(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String zzh(byte[] arr_b) {
        return new String(arr_b, zzgla.a);
    }

    public static boolean zzi(byte[] arr_b) {
        ka.a.getClass();
        return S.e(0, 0, arr_b.length, arr_b) == 0;
    }
}

