package com.google.android.gms.internal.ads;

public final class zzzl {
    public static final String[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static {
        zzzl.a = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        zzzl.b = new int[]{44100, 48000, 32000};
        zzzl.c = new int[]{32000, 0xFA00, 96000, 0x1F400, 160000, 192000, 224000, 256000, 288000, 320000, 0x55F00, 384000, 416000, 448000};
        zzzl.d = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000, 176000, 192000, 224000, 256000};
        zzzl.e = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000, 384000};
        zzzl.f = new int[]{32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000};
        zzzl.g = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000};
    }

    public static int zzb(int v) {
        int v7;
        if((v & 0xFFE00000) != 0xFFE00000) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        int v3 = v >>> 12 & 15;
        if(v3 != 0 && v3 != 15) {
            int v4 = v >>> 10 & 3;
            if(v4 == 3) {
                return -1;
            }
            int v5 = zzzl.b[v4];
            if(v1 == 2) {
                v5 /= 2;
            }
            else if(v1 == 0) {
                v5 /= 4;
            }
            int v6 = v >>> 9 & 1;
            if(v2 == 3) {
                return v1 == 3 ? (zzzl.c[v3 - 1] * 12 / v5 + v6) * 4 : (zzzl.d[v3 - 1] * 12 / v5 + v6) * 4;
            }
            if(v1 != 3) {
                v7 = zzzl.g[v3 - 1];
            }
            else if(v2 == 2) {
                v7 = zzzl.e[v3 - 1];
            }
            else {
                v7 = zzzl.f[v3 - 1];
            }
            int v8 = 0x90;
            if(v1 == 3) {
                return v7 * 0x90 / v5 + v6;
            }
            if(v2 == 1) {
                v8 = 72;
            }
            return v8 * v7 / v5 + v6;
        }
        return -1;
    }

    public static int zzc(int v) {
        if((v & 0xFFE00000) != 0xFFE00000) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        if((v >>> 12 & 15) != 0 && (v >>> 12 & 15) != 15 && (v >>> 10 & 3) != 3) {
            if(v2 != 1) {
                return v2 == 2 ? 0x480 : 0x180;
            }
            return v1 == 3 ? 0x480 : 0x240;
        }
        return -1;
    }
}

