package com.google.android.gms.internal.ads;

import i3.e;
import java.util.Arrays;

public final class zzmv {
    public final int[] a;
    public static final zzmv zza;

    static {
        zzmv.zza = new zzmv(new int[]{2}, 8);
        new zzmv(new int[]{2, 5, 6}, 8);
    }

    public zzmv(int[] arr_v, int v) {
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        this.a = arr_v1;
        Arrays.sort(arr_v1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzmv ? Arrays.equals(this.a, ((zzmv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) * 0x1F + 8;
    }

    @Override
    public final String toString() {
        return e.f("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.a), "]");
    }

    public final boolean zza(int v) {
        return Arrays.binarySearch(this.a, v) >= 0;
    }
}

