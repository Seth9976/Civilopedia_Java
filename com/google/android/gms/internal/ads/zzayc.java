package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzayc {
    public int a;
    public final zzaxu[] b;

    public zzayc(zzaxu[] arr_zzaxu, byte[] arr_b) {
        this.b = arr_zzaxu;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzayc.class == class0 ? Arrays.equals(this.b, ((zzayc)object0).b) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            v = Arrays.hashCode(this.b) + 0x20F;
            this.a = v;
        }
        return v;
    }

    public final zzaxu zza(int v) {
        return this.b[v];
    }

    public final zzaxu[] zzb() {
        return (zzaxu[])this.b.clone();
    }
}

