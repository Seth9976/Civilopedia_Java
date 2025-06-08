package com.google.android.gms.internal.ads;

public final class zzbx {
    public final zzy a;
    public static final zzbx zza;
    public static final zzl zzb;

    static {
        zzbx.zza = new zzbv().zze();
        zzbx.zzb = zzbu.zza;
    }

    public zzbx(zzy zzy0) {
        this.a = zzy0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbx ? this.a.equals(((zzbx)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

