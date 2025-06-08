package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class z8 implements Comparable {
    public final byte[] i;

    public z8(byte[] arr_b) {
        this.i = Arrays.copyOf(arr_b, arr_b.length);
    }

    @Override
    public final int compareTo(Object object0) {
        byte[] arr_b = this.i;
        if(arr_b.length != ((z8)object0).i.length) {
            return arr_b.length - ((z8)object0).i.length;
        }
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            int v2 = ((z8)object0).i[v];
            if(v1 != v2) {
                return v1 - v2;
            }
        }
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof z8 ? Arrays.equals(this.i, ((z8)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.i);
    }

    @Override
    public final String toString() {
        return zzgic.zza(this.i);
    }
}

