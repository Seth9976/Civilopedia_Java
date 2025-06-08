package com.google.android.gms.internal.ads;

public final class zzuc {
    public final long zza;
    public final long zzb;

    public zzuc(long v, long v1) {
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzuc ? this.zza == ((zzuc)object0).zza && this.zzb == ((zzuc)object0).zzb : false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zza) * 0x1F + ((int)this.zzb);
    }
}

