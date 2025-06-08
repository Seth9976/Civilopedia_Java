package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class zzftl {
    static {
        new H7();  // 初始化器: Ljava/io/OutputStream;-><init>()V
    }

    public static byte[] a(ArrayDeque arrayDeque0, int v) {
        if(arrayDeque0.isEmpty()) {
            return new byte[0];
        }
        byte[] arr_b = (byte[])arrayDeque0.remove();
        if(arr_b.length == v) {
            return arr_b;
        }
        int v1 = v - arr_b.length;
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        while(v1 > 0) {
            byte[] arr_b2 = (byte[])arrayDeque0.remove();
            int v2 = Math.min(v1, arr_b2.length);
            System.arraycopy(arr_b2, 0, arr_b1, v - v1, v2);
            v1 -= v2;
        }
        return arr_b1;
    }

    public static byte[] zza(InputStream inputStream0) throws IOException {
        inputStream0.getClass();
        ArrayDeque arrayDeque0 = new ArrayDeque(20);
        int v = 0x80;
        int v1 = 0;
        while(v1 < 0x7FFFFFF7) {
            int v2 = Math.min(v, 0x7FFFFFF7 - v1);
            byte[] arr_b = new byte[v2];
            arrayDeque0.add(arr_b);
            int v3 = 0;
            while(v3 < v2) {
                int v4 = inputStream0.read(arr_b, v3, v2 - v3);
                if(v4 == -1) {
                    return zzftl.a(arrayDeque0, v1);
                }
                v3 += v4;
                v1 += v4;
            }
            long v5 = ((long)v) * ((long)(v >= 0x1000 ? 2 : 4));
            if(v5 > 0x7FFFFFFFL) {
                v = 0x7FFFFFFF;
            }
            else if(v5 < 0xFFFFFFFF80000000L) {
                v = 0x80000000;
            }
            else {
                v = (int)v5;
            }
        }
        if(inputStream0.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }
        return zzftl.a(arrayDeque0, 0x7FFFFFF7);
    }
}

