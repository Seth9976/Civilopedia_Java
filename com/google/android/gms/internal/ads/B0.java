package com.google.android.gms.internal.ads;

public final class b0 {
    public final zzee a;
    public final zzdy b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public b0(int v) {
        if(v != 1) {
            super();
            this.a = new zzee(0L);
            this.f = 0x8000000000000001L;
            this.g = 0x8000000000000001L;
            this.h = 0x8000000000000001L;
            this.b = new zzdy();
            return;
        }
        super();
        this.a = new zzee(0L);
        this.f = 0x8000000000000001L;
        this.g = 0x8000000000000001L;
        this.h = 0x8000000000000001L;
        this.b = new zzdy();
    }

    public static long a(zzdy zzdy0) {
        int v = zzdy0.zzc();
        if(zzdy0.zza() < 9) {
            return 0x8000000000000001L;
        }
        byte[] arr_b = new byte[9];
        zzdy0.zzB(arr_b, 0, 9);
        zzdy0.zzF(v);
        int v1 = arr_b[0];
        if((v1 & 0xC4) == 68) {
            int v2 = arr_b[2];
            if((v2 & 4) == 4) {
                int v3 = arr_b[4];
                return (v3 & 4) != 4 || (arr_b[5] & 1) != 1 || (arr_b[8] & 3) != 3 ? 0x8000000000000001L : (((long)arr_b[1]) & 0xFFL) << 20 | ((((long)v1) & 3L) << 28 | (56L & ((long)v1)) >> 3 << 30) | (((long)v2) & 0xF8L) >> 3 << 15 | (((long)v2) & 3L) << 13 | (((long)arr_b[3]) & 0xFFL) << 5 | (((long)v3) & 0xF8L) >> 3;
            }
        }
        return 0x8000000000000001L;
    }

    public void b(zzys zzys0) {
        this.b.zzD(zzeg.zzf, 0);
        this.c = true;
        zzys0.zzj();
    }

    public static final int c(int v, byte[] arr_b) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }
}

