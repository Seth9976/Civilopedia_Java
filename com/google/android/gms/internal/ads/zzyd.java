package com.google.android.gms.internal.ads;

public final class zzyd {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public zzyd(long v, long v1, long v2, long v3, long v4, long v5) {
        this.a = v;
        this.b = v1;
        this.d = 0L;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.c = v5;
        this.h = zzyd.a(v1, 0L, v2, v3, v4, v5);
    }

    public static long a(long v, long v1, long v2, long v3, long v4, long v5) {
        if(v3 + 1L < v4 && v1 + 1L < v2) {
            long v6 = (long)(((float)(v4 - v3)) / ((float)(v2 - v1)) * ((float)(v - v1)));
            return zzeg.zzr(v3 + v6 - v5 - v6 / 20L, v3, v4 - 1L);
        }
        return v3;
    }
}

