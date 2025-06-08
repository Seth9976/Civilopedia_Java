package com.google.android.gms.internal.ads;

import L2.b;
import java.security.SecureRandom;

public final class zzgik {
    public static final b a;

    static {
        zzgik.a = new b(9);
    }

    public static byte[] zza(int v) {
        byte[] arr_b = new byte[v];
        ((SecureRandom)zzgik.a.get()).nextBytes(arr_b);
        return arr_b;
    }
}

