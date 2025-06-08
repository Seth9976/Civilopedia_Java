package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzhp {
    public static final Charset a;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zzhp.a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzhp.zzb = arr_b;
        ByteBuffer.wrap(arr_b);
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }
}

