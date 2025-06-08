package com.google.android.gms.internal.ads;

public final class m {
    public final byte[] a;
    public int b;
    public int c;
    public static final long[] d;
    public static final long[] e;

    static {
        m.d = new long[]{0x80L, 0x40L, 0x20L, 16L, 8L, 4L, 2L, 1L};
        m.e = new long[]{0x80L, 0x40L, 0x20L, 16L, 8L, 4L, 2L, 1L};
    }

    public m(int v) {
        if(v != 1) {
            super();
            this.a = new byte[8];
            return;
        }
        super();
        this.a = new byte[8];
    }

    public static int a(int v) {
        int v1 = 0;
        while(v1 < 8) {
            int v2 = Long.compare(m.d[v1] & ((long)v), 0L);
            ++v1;
            if(v2 != 0) {
                return v1;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    public static int b(int v) {
        int v1 = 0;
        while(v1 < 8) {
            int v2 = Long.compare(m.e[v1] & ((long)v), 0L);
            ++v1;
            if(v2 != 0) {
                return v1;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    public static long c(boolean z, int v, byte[] arr_b) {
        long v1 = ((long)arr_b[0]) & 0xFFL;
        if(z) {
            v1 &= ~m.d[v - 1];
        }
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = v1 << 8 | ((long)arr_b[v2]) & 0xFFL;
        }
        return v1;
    }

    public static long d(boolean z, int v, byte[] arr_b) {
        long v1 = ((long)arr_b[0]) & 0xFFL;
        if(z) {
            v1 &= ~m.e[v - 1];
        }
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = v1 << 8 | ((long)arr_b[v2]) & 0xFFL;
        }
        return v1;
    }

    public long e(zzys zzys0, boolean z, boolean z1, int v) {
        byte[] arr_b = this.a;
        if(this.b == 0) {
            if(!zzys0.zzn(arr_b, 0, 1, z)) {
                return -1L;
            }
            int v1 = m.a(arr_b[0] & 0xFF);
            this.c = v1;
            if(v1 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int v2 = this.c;
        if(v2 > v) {
            this.b = 0;
            return -2L;
        }
        if(v2 != 1) {
            ((zzyl)zzys0).zzn(arr_b, 1, v2 - 1, false);
        }
        this.b = 0;
        return m.c(z1, this.c, arr_b);
    }

    public long f(zzatv zzatv0, boolean z, boolean z1, int v) {
        byte[] arr_b = this.a;
        if(this.b == 0) {
            if(!zzatv0.zzh(arr_b, 0, 1, z)) {
                return -1L;
            }
            int v1 = m.b(arr_b[0] & 0xFF);
            this.c = v1;
            if(v1 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int v2 = this.c;
        if(v2 > v) {
            this.b = 0;
            return -2L;
        }
        if(v2 != 1) {
            zzatv0.zzh(arr_b, 1, v2 - 1, false);
        }
        this.b = 0;
        return m.d(z1, this.c, arr_b);
    }
}

