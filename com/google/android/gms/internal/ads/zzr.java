package com.google.android.gms.internal.ads;

public final class zzr {
    public static final zzr zza;
    public static final zzl zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        zzr.zza = new zzr(0, 0, 0);
        zzr.zzb = zzq.zza;
    }

    public zzr(int v, int v1, int v2) {
        this.zzc = 0;
        this.zzd = v1;
        this.zze = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzr ? this.zzd == ((zzr)object0).zzd && this.zze == ((zzr)object0).zze : false;
    }

    @Override
    public final int hashCode() {
        return (this.zzd + 0x3FD1) * 0x1F + this.zze;
    }
}

