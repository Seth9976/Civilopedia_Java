package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class zzgin {
    public static byte[] zza(byte[] arr_b, byte[] arr_b1) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] arr_v = new long[11];
        byte[] arr_b2 = Arrays.copyOf(arr_b, 0x20);
        arr_b2[0] = (byte)(arr_b2[0] & 0xF8);
        int v = arr_b2[0x1F] & 0x7F;
        arr_b2[0x1F] = (byte)v;
        arr_b2[0x1F] = (byte)(v | 0x40);
        if(arr_b1.length != 0x20) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] arr_b3 = Arrays.copyOf(arr_b1, 0x20);
        arr_b3[0x1F] = (byte)(arr_b3[0x1F] & 0x7F);
        for(int v1 = 0; v1 < 7; ++v1) {
            byte[][] arr2_b = h.f;
            if(zzghh.zzb(arr2_b[v1], arr_b3)) {
                throw new InvalidKeyException("Banned public key: " + zzgic.zza(arr2_b[v1]));
            }
        }
        long[] arr_v1 = new long[10];
        for(int v2 = 0; v2 < 10; ++v2) {
            int v3 = h.g[v2];
            arr_v1[v2] = (((long)(arr_b3[v3 + 3] & 0xFF)) << 24 | (((long)(arr_b3[v3] & 0xFF)) | ((long)(arr_b3[v3 + 1] & 0xFF)) << 8 | ((long)(arr_b3[v3 + 2] & 0xFF)) << 16)) >> h.h[v2] & ((long)h.i[v2 & 1]);
        }
        long[] arr_v2 = new long[19];
        long[] arr_v3 = new long[19];
        arr_v3[0] = 1L;
        long[] arr_v4 = new long[19];
        arr_v4[0] = 1L;
        long[] arr_v5 = new long[19];
        long[] arr_v6 = new long[19];
        long[] arr_v7 = new long[19];
        arr_v7[0] = 1L;
        long[] arr_v8 = new long[19];
        long[] arr_v9 = new long[19];
        arr_v9[0] = 1L;
        System.arraycopy(arr_v1, 0, arr_v2, 0, 10);
        for(int v4 = 0; v4 < 0x20; ++v4) {
            int v5 = arr_b2[0x1F - v4] & 0xFF;
            int v6 = 0;
            while(v6 < 8) {
                int v7 = v5 >> 7 - v6 & 1;
                h.k(arr_v4, arr_v2, v7);
                h.k(arr_v5, arr_v3, v7);
                long[] arr_v10 = Arrays.copyOf(arr_v4, 10);
                long[] arr_v11 = new long[19];
                long[] arr_v12 = new long[19];
                long[] arr_v13 = new long[19];
                long[] arr_v14 = new long[19];
                long[] arr_v15 = new long[19];
                long[] arr_v16 = new long[19];
                h.d0(arr_v4, arr_v4, arr_v5);
                h.b0(arr_v5, arr_v10, arr_v5);
                long[] arr_v17 = Arrays.copyOf(arr_v2, 10);
                h.d0(arr_v2, arr_v2, arr_v3);
                h.b0(arr_v3, arr_v17, arr_v3);
                h.w(arr_v13, arr_v2, arr_v5);
                h.w(arr_v14, arr_v4, arr_v3);
                h.S(arr_v13);
                h.O(arr_v13);
                h.S(arr_v14);
                h.O(arr_v14);
                long[] arr_v18 = arr_v2;
                System.arraycopy(arr_v13, 0, arr_v17, 0, 10);
                h.d0(arr_v13, arr_v13, arr_v14);
                h.b0(arr_v14, arr_v17, arr_v14);
                h.X(arr_v16, arr_v13);
                h.X(arr_v15, arr_v14);
                h.w(arr_v14, arr_v15, arr_v1);
                h.S(arr_v14);
                h.O(arr_v14);
                System.arraycopy(arr_v16, 0, arr_v6, 0, 10);
                System.arraycopy(arr_v14, 0, arr_v7, 0, 10);
                h.X(arr_v11, arr_v4);
                h.X(arr_v12, arr_v5);
                h.w(arr_v8, arr_v11, arr_v12);
                h.S(arr_v8);
                h.O(arr_v8);
                h.b0(arr_v12, arr_v11, arr_v12);
                long[] arr_v19 = new long[19];
                Arrays.fill(arr_v19, 10, 18, 0L);
                for(int v8 = 0; v8 < 10; ++v8) {
                    arr_v19[v8] = arr_v12[v8] * 0x1DB41L;
                }
                h.O(arr_v19);
                h.d0(arr_v19, arr_v19, arr_v11);
                h.w(arr_v9, arr_v12, arr_v19);
                h.S(arr_v9);
                h.O(arr_v9);
                h.k(arr_v8, arr_v6, v7);
                h.k(arr_v9, arr_v7, v7);
                ++v6;
                arr_v2 = arr_v6;
                arr_v6 = arr_v18;
                long[] arr_v20 = arr_v5;
                arr_v5 = arr_v9;
                arr_v9 = arr_v20;
                long[] arr_v21 = arr_v4;
                arr_v4 = arr_v8;
                arr_v8 = arr_v21;
                long[] arr_v22 = arr_v3;
                arr_v3 = arr_v7;
                arr_v7 = arr_v22;
            }
        }
        long[] arr_v23 = new long[10];
        long[] arr_v24 = new long[10];
        long[] arr_v25 = new long[10];
        long[] arr_v26 = new long[10];
        long[] arr_v27 = new long[10];
        long[] arr_v28 = new long[10];
        long[] arr_v29 = new long[10];
        long[] arr_v30 = new long[10];
        long[] arr_v31 = new long[10];
        long[] arr_v32 = new long[10];
        long[] arr_v33 = new long[10];
        h.X(arr_v24, arr_v5);
        h.X(arr_v33, arr_v24);
        h.X(arr_v32, arr_v33);
        h.l(arr_v25, arr_v32, arr_v5);
        h.l(arr_v26, arr_v25, arr_v24);
        h.X(arr_v32, arr_v26);
        h.l(arr_v27, arr_v32, arr_v25);
        h.X(arr_v32, arr_v27);
        h.X(arr_v33, arr_v32);
        h.X(arr_v32, arr_v33);
        h.X(arr_v33, arr_v32);
        h.X(arr_v32, arr_v33);
        h.l(arr_v28, arr_v32, arr_v27);
        h.X(arr_v32, arr_v28);
        h.X(arr_v33, arr_v32);
        for(int v10 = 2; v10 < 10; v10 += 2) {
            h.X(arr_v32, arr_v33);
            h.X(arr_v33, arr_v32);
        }
        h.l(arr_v29, arr_v33, arr_v28);
        h.X(arr_v32, arr_v29);
        h.X(arr_v33, arr_v32);
        for(int v11 = 2; v11 < 20; v11 += 2) {
            h.X(arr_v32, arr_v33);
            h.X(arr_v33, arr_v32);
        }
        h.l(arr_v32, arr_v33, arr_v29);
        h.X(arr_v33, arr_v32);
        h.X(arr_v32, arr_v33);
        for(int v12 = 2; v12 < 10; v12 += 2) {
            h.X(arr_v33, arr_v32);
            h.X(arr_v32, arr_v33);
        }
        h.l(arr_v30, arr_v32, arr_v28);
        h.X(arr_v32, arr_v30);
        h.X(arr_v33, arr_v32);
        for(int v13 = 2; v13 < 50; v13 += 2) {
            h.X(arr_v32, arr_v33);
            h.X(arr_v33, arr_v32);
        }
        h.l(arr_v31, arr_v33, arr_v30);
        h.X(arr_v33, arr_v31);
        h.X(arr_v32, arr_v33);
        for(int v14 = 2; v14 < 100; v14 += 2) {
            h.X(arr_v33, arr_v32);
            h.X(arr_v32, arr_v33);
        }
        h.l(arr_v33, arr_v32, arr_v31);
        h.X(arr_v32, arr_v33);
        h.X(arr_v33, arr_v32);
        for(int v9 = 2; v9 < 50; v9 += 2) {
            h.X(arr_v32, arr_v33);
            h.X(arr_v33, arr_v32);
        }
        h.l(arr_v32, arr_v33, arr_v30);
        h.X(arr_v33, arr_v32);
        h.X(arr_v32, arr_v33);
        h.X(arr_v33, arr_v32);
        h.X(arr_v32, arr_v33);
        h.X(arr_v33, arr_v32);
        h.l(arr_v23, arr_v33, arr_v26);
        h.l(arr_v, arr_v4, arr_v23);
        long[] arr_v34 = new long[10];
        long[] arr_v35 = new long[10];
        long[] arr_v36 = new long[11];
        long[] arr_v37 = new long[11];
        long[] arr_v38 = new long[11];
        h.l(arr_v34, arr_v1, arr_v);
        h.d0(arr_v35, arr_v1, arr_v);
        long[] arr_v39 = new long[10];
        arr_v39[0] = 0x76D06L;
        h.d0(arr_v37, arr_v35, arr_v39);
        h.l(arr_v37, arr_v37, arr_v3);
        h.d0(arr_v37, arr_v37, arr_v2);
        h.l(arr_v37, arr_v37, arr_v34);
        h.l(arr_v37, arr_v37, arr_v2);
        for(int v15 = 0; v15 < 10; ++v15) {
            arr_v36[v15] = arr_v37[v15] * 4L;
        }
        h.O(arr_v36);
        h.l(arr_v37, arr_v34, arr_v3);
        h.b0(arr_v37, arr_v37, arr_v3);
        h.l(arr_v38, arr_v35, arr_v2);
        h.d0(arr_v37, arr_v37, arr_v38);
        h.X(arr_v37, arr_v37);
        if(!zzghh.zzb(h.f0(arr_v36), h.f0(arr_v37))) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzgic.zza(arr_b1));
        }
        return h.f0(arr_v);
    }

    public static byte[] zzb() {
        byte[] arr_b = zzgik.zza(0x20);
        arr_b[0] = (byte)(arr_b[0] | 7);
        int v = arr_b[0x1F] & 0x3F;
        arr_b[0x1F] = (byte)v;
        arr_b[0x1F] = (byte)(v | 0x80);
        return arr_b;
    }

    public static byte[] zzc(byte[] arr_b) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] arr_b1 = new byte[0x20];
        arr_b1[0] = 9;
        return zzgin.zza(arr_b, arr_b1);
    }
}

