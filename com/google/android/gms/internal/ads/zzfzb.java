package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfzb {
    public static long a(int v, byte[] arr_b) {
        return ((long)((arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16))) & 0xFFFFFFFFL;
    }

    public static void b(int v, long v1, byte[] arr_b) {
        int v2 = 0;
        while(v2 < 4) {
            arr_b[v + v2] = (byte)(((int)(0xFFL & v1)));
            ++v2;
            v1 >>= 8;
        }
    }

    public static byte[] zza(byte[] arr_b, byte[] arr_b1) {
        long v = zzfzb.a(0, arr_b);
        long v1 = zzfzb.a(3, arr_b) >> 2 & 0x3FFFF03L;
        long v2 = zzfzb.a(6, arr_b) >> 4 & 0x3FFC0FFL;
        long v3 = zzfzb.a(9, arr_b) >> 6 & 0x3F03FFFL;
        long v4 = zzfzb.a(12, arr_b) >> 8 & 0xFFFFFL;
        byte[] arr_b2 = new byte[17];
        long v5 = 0L;
        long v6 = 0L;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        int v10 = 0;
        while(v10 < arr_b1.length) {
            int v11 = Math.min(16, arr_b1.length - v10);
            System.arraycopy(arr_b1, v10, arr_b2, 0, v11);
            arr_b2[v11] = 1;
            if(v11 != 16) {
                Arrays.fill(arr_b2, v11 + 1, 17, 0);
            }
            long v12 = v9 + (zzfzb.a(0, arr_b2) & 0x3FFFFFFL);
            long v13 = v6 + (zzfzb.a(3, arr_b2) >> 2 & 0x3FFFFFFL);
            long v14 = v5 + (zzfzb.a(6, arr_b2) >> 4 & 0x3FFFFFFL);
            long v15 = v7 + (zzfzb.a(9, arr_b2) >> 6 & 0x3FFFFFFL);
            long v16 = v8 + (zzfzb.a(12, arr_b2) >> 8 & 0x3FFFFFFL | ((long)(arr_b2[16] << 24)));
            long v17 = v16 * (v1 * 5L) + (v15 * (v2 * 5L) + (v14 * (v3 * 5L) + (v13 * (v4 * 5L) + v12 * (v & 0x3FFFFFFL))));
            long v18 = v16 * (v2 * 5L) + (v15 * (v3 * 5L) + (v14 * (v4 * 5L) + (v13 * (v & 0x3FFFFFFL) + v12 * v1))) + (v17 >> 26);
            long v19 = v16 * (v3 * 5L) + (v15 * (v4 * 5L) + (v14 * (v & 0x3FFFFFFL) + (v13 * v1 + v12 * v2))) + (v18 >> 26);
            long v20 = v16 * (v4 * 5L) + (v15 * (v & 0x3FFFFFFL) + (v14 * v1 + (v13 * v2 + v12 * v3))) + (v19 >> 26);
            long v21 = v16 * (v & 0x3FFFFFFL) + (v15 * v1 + (v14 * v2 + (v13 * v3 + v12 * v4))) + (v20 >> 26);
            long v22 = (v21 >> 26) * 5L + (v17 & 0x3FFFFFFL);
            v9 = v22 & 0x3FFFFFFL;
            v6 = (v18 & 0x3FFFFFFL) + (v22 >> 26);
            v10 += 16;
            v8 = v21 & 0x3FFFFFFL;
            v7 = v20 & 0x3FFFFFFL;
            v5 = v19 & 0x3FFFFFFL;
        }
        long v23 = v5 + (v6 >> 26);
        long v24 = v7 + (v23 >> 26);
        long v25 = v8 + (v24 >> 26);
        long v26 = (v25 >> 26) * 5L + v9;
        long v27 = (v6 & 0x3FFFFFFL) + (v26 >> 26);
        long v28 = (v23 & 0x3FFFFFFL) + (v27 >> 26);
        long v29 = (v24 & 0x3FFFFFFL) + (v28 >> 26);
        long v30 = (v25 & 0x3FFFFFFL) + (v29 >> 26) - 0x4000000L;
        long v31 = v23 & 0x3FFFFFFL & v30 >> 0x3F | v28 & 0x3FFFFFFL & ~(v30 >> 0x3F);
        long v32 = v24 & 0x3FFFFFFL & v30 >> 0x3F | v29 & 0x3FFFFFFL & ~(v30 >> 0x3F);
        long v33 = zzfzb.a(16, arr_b) + ((v26 & 0x3FFFFFFL & v30 >> 0x3F | (v26 & 0x3FFFFFFL) + 5L & 0x3FFFFFFL & ~(v30 >> 0x3F) | v27 << 26) & 0xFFFFFFFFL);
        long v34 = zzfzb.a(20, arr_b) + ((v27 >> 6 | v31 << 20) & 0xFFFFFFFFL) + (v33 >> 0x20);
        long v35 = zzfzb.a(24, arr_b) + ((v31 >> 12 | v32 << 14) & 0xFFFFFFFFL) + (v34 >> 0x20);
        long v36 = zzfzb.a(28, arr_b);
        byte[] arr_b3 = new byte[16];
        zzfzb.b(0, v33 & 0xFFFFFFFFL, arr_b3);
        zzfzb.b(4, v34 & 0xFFFFFFFFL, arr_b3);
        zzfzb.b(8, v35 & 0xFFFFFFFFL, arr_b3);
        zzfzb.b(12, (((v30 & ~(v30 >> 0x3F) | v25 & 0x3FFFFFFL & v30 >> 0x3F) << 8 | v32 >> 18) & 0xFFFFFFFFL) + v36 + (v35 >> 0x20) & 0xFFFFFFFFL, arr_b3);
        return arr_b3;
    }
}

