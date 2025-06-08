package com.google.android.gms.internal.ads;

public final class zzgid {
    public final byte[] a;

    public zzgid(byte[] arr_b, int v) {
        byte[] arr_b1 = new byte[v];
        this.a = arr_b1;
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
    }

    public static zzgid zza(byte[] arr_b, int v, int v1) {
        return new zzgid(arr_b, v1);
    }

    public final byte[] zzb() {
        byte[] arr_b = new byte[this.a.length];
        System.arraycopy(this.a, 0, arr_b, 0, this.a.length);
        return arr_b;
    }
}

