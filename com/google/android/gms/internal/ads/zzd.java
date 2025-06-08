package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzd {
    public final zzc[] a;
    public static final zzc b;
    public static final zzd zza;
    public static final zzl zzb;
    public final int zzc;
    public final long zzd;

    static {
        zzd.zza = new zzd(new zzc[0]);
        zzd.b = new zzc(0L).zzb(0);
        zzd.zzb = zza.zza;
    }

    public zzd(zzc[] arr_zzc) {
        this.zzd = 0L;
        this.zzc = 0;
        this.a = arr_zzc;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzd.class == class0 && zzeg.zzS(null, null) && Arrays.equals(this.a, ((zzd)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) + 961;
    }

    @Override
    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }

    public final zzc zza(int v) {
        return v >= 0 ? this.a[v] : zzd.b;
    }
}

