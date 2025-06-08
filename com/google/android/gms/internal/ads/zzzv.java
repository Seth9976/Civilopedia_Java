package com.google.android.gms.internal.ads;

public final class zzzv {
    public static final zzzv zza;
    public final long zzb;
    public final long zzc;

    static {
        zzzv.zza = new zzzv(0L, 0L);
    }

    public zzzv(long v, long v1) {
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzzv.class == class0 && this.zzb == ((zzzv)object0).zzb && this.zzc == ((zzzv)object0).zzc;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzb) * 0x1F + ((int)this.zzc);
    }

    @Override
    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}

