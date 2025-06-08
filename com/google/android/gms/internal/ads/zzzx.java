package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzzx {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzx(int v, byte[] arr_b, int v1, int v2) {
        this.zza = v;
        this.zzb = arr_b;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzzx.class == class0 && this.zza == ((zzzx)object0).zza && this.zzc == ((zzzx)object0).zzc && this.zzd == ((zzzx)object0).zzd && Arrays.equals(this.zzb, ((zzzx)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.zzb) + this.zza * 0x1F) * 0x1F + this.zzc) * 0x1F + this.zzd;
    }
}

