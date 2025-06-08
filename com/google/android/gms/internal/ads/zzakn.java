package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzakn {
    public static double zza(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        return ((double)(arr_b[0] << 24 & 0xFF000000 | arr_b[1] << 16 & 0xFF0000 | arr_b[2] << 8 & 0xFF00 | arr_b[3] & 0xFF)) / 1073741824.0;
    }

    public static double zzb(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        return ((double)(arr_b[0] << 24 & 0xFF000000 | arr_b[1] << 16 & 0xFF0000 | arr_b[2] << 8 & 0xFF00 | arr_b[3] & 0xFF)) / 65536.0;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 0x100 : b;
    }

    public static int zzd(ByteBuffer byteBuffer0) {
        int v = zzakn.zzc(byteBuffer0.get());
        return zzakn.zzc(byteBuffer0.get()) + (v << 8);
    }

    public static long zze(ByteBuffer byteBuffer0) {
        long v = (long)byteBuffer0.getInt();
        return v >= 0L ? v : v + 0x100000000L;
    }

    public static long zzf(ByteBuffer byteBuffer0) {
        long v = zzakn.zze(byteBuffer0);
        if(v << 0x20 < 0L) {
            throw new RuntimeException("I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt");
        }
        return zzakn.zze(byteBuffer0) + (v << 0x20);
    }
}

