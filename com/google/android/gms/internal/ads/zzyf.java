package com.google.android.gms.internal.ads;

public final class zzyf {
    public final int a;
    public final long b;
    public final long c;
    public static final zzyf zza;

    static {
        zzyf.zza = new zzyf(-3, 0x8000000000000001L, -1L);
    }

    public zzyf(int v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public static zzyf zzd(long v, long v1) {
        return new zzyf(-1, v, v1);
    }

    public static zzyf zze(long v) {
        return new zzyf(0, 0x8000000000000001L, v);
    }

    public static zzyf zzf(long v, long v1) {
        return new zzyf(-2, v, v1);
    }
}

