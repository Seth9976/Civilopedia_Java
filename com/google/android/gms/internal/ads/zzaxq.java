package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaxq {
    public final zzaxp[] a;
    public int b;
    public static final zzaxq zza;
    public final int zzb;

    static {
        zzaxq.zza = new zzaxq(new zzaxp[0]);
    }

    public zzaxq(zzaxp[] arr_zzaxp) {
        this.a = arr_zzaxp;
        this.zzb = arr_zzaxp.length;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaxq.class == class0 && this.zzb == ((zzaxq)object0).zzb && Arrays.equals(this.a, ((zzaxq)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            v = Arrays.hashCode(this.a);
            this.b = v;
        }
        return v;
    }

    public final int zza(zzaxp zzaxp0) {
        for(int v = 0; v < this.zzb; ++v) {
            if(this.a[v] == zzaxp0) {
                return v;
            }
        }
        return -1;
    }

    public final zzaxp zzb(int v) {
        return this.a[v];
    }
}

