package com.google.android.gms.internal.ads;

import A.f;
import java.util.Arrays;

public final class zzazc {
    public int a;
    public long[] b;

    public zzazc() {
        this(0x20);
    }

    public zzazc(int v) {
        this.b = new long[0x20];
    }

    public final int zza() {
        return this.a;
    }

    public final long zzb(int v) {
        if(v < 0 || v >= this.a) {
            throw new IndexOutOfBoundsException(f.d(v, this.a, "Invalid index ", ", size is "));
        }
        return this.b[v];
    }

    public final void zzc(long v) {
        int v1 = this.a;
        long[] arr_v = this.b;
        if(v1 == arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v1 + v1);
        }
        int v2 = this.a;
        this.a = v2 + 1;
        this.b[v2] = v;
    }
}

