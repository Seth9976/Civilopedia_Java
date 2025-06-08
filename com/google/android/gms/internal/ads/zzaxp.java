package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaxp {
    public final zzart[] a;
    public int b;
    public final int zza;

    public zzaxp(zzart[] arr_zzart) {
        this.a = arr_zzart;
        this.zza = 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaxp.class == class0 && Arrays.equals(this.a, ((zzaxp)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            v = Arrays.hashCode(this.a) + 0x20F;
            this.b = v;
        }
        return v;
    }

    public final int zza(zzart zzart0) {
        for(int v = 0; v <= 0; ++v) {
            if(zzart0 == this.a[v]) {
                return v;
            }
        }
        return -1;
    }

    public final zzart zzb(int v) {
        return this.a[v];
    }
}

