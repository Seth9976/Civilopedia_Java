package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaue {
    public final int zza;
    public final byte[] zzb;

    public zzaue(int v, byte[] arr_b) {
        this.zza = 1;
        this.zzb = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaue.class == class0 && Arrays.equals(this.zzb, ((zzaue)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzb) + 0x1F;
    }
}

