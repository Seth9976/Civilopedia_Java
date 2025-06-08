package com.google.android.gms.internal.ads;

public final class zzjw {
    public static final zzjw zza;
    public static final zzjw zzb;
    public static final zzjw zzc;
    public static final zzjw zzd;
    public static final zzjw zze;
    public final long zzf;
    public final long zzg;

    static {
        zzjw zzjw0 = new zzjw(0L, 0L);
        zzjw.zza = zzjw0;
        zzjw.zzb = new zzjw(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL);
        zzjw.zzc = new zzjw(0x7FFFFFFFFFFFFFFFL, 0L);
        zzjw.zzd = new zzjw(0L, 0x7FFFFFFFFFFFFFFFL);
        zzjw.zze = zzjw0;
    }

    public zzjw(long v, long v1) {
        boolean z = false;
        zzcw.zzd(v >= 0L);
        if(v1 >= 0L) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzf = v;
        this.zzg = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzjw.class == class0 && this.zzf == ((zzjw)object0).zzf && this.zzg == ((zzjw)object0).zzg;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzf) * 0x1F + ((int)this.zzg);
    }
}

