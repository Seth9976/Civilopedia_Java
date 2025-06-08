package com.google.android.gms.internal.ads;

public final class a extends zzyh {
    public static int b(int v, byte[] arr_b) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }
}

