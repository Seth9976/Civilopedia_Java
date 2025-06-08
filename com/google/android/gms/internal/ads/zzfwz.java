package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfwz {
    public final Object a;
    public final byte[] b;
    public final int c;
    public final int d;

    public zzfwz(Object object0, byte[] arr_b, int v, int v1) {
        this.a = object0;
        this.b = Arrays.copyOf(arr_b, arr_b.length);
        this.c = v;
        this.d = v1;
    }

    public final Object zza() {
        return this.a;
    }

    public final byte[] zzb() {
        return this.b == null ? null : Arrays.copyOf(this.b, this.b.length);
    }

    public final int zzc() {
        return this.c;
    }

    public final int zzd() {
        return this.d;
    }
}

