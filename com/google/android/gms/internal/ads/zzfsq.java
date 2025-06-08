package com.google.android.gms.internal.ads;

public final class zzfsq {
    public static void a(int v, Object[] arr_object) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_object[v1] == null) {
                throw new NullPointerException("at index " + v1);
            }
        }
    }
}

