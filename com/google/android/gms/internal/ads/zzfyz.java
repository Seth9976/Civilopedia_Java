package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class zzfyz extends K8 {
    public zzfyz(byte[] arr_b, int v) throws InvalidKeyException {
        super(arr_b, v);
    }

    @Override  // com.google.android.gms.internal.ads.K8
    public final int zza() {
        return 24;
    }

    @Override  // com.google.android.gms.internal.ads.K8
    public final int[] zzb(int[] arr_v, int v) {
        if(arr_v.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        int[] arr_v2 = new int[16];
        System.arraycopy(J8.a, 0, arr_v2, 0, J8.a.length);
        System.arraycopy(this.a, 0, arr_v2, J8.a.length, 8);
        arr_v2[12] = arr_v[0];
        arr_v2[13] = arr_v[1];
        arr_v2[14] = arr_v[2];
        arr_v2[15] = arr_v[3];
        J8.b(arr_v2);
        arr_v2[4] = arr_v2[12];
        arr_v2[5] = arr_v2[13];
        arr_v2[6] = arr_v2[14];
        arr_v2[7] = arr_v2[15];
        int[] arr_v3 = Arrays.copyOf(arr_v2, 8);
        System.arraycopy(J8.a, 0, arr_v1, 0, J8.a.length);
        System.arraycopy(arr_v3, 0, arr_v1, J8.a.length, 8);
        arr_v1[12] = v;
        arr_v1[13] = 0;
        arr_v1[14] = arr_v[4];
        arr_v1[15] = arr_v[5];
        return arr_v1;
    }
}

