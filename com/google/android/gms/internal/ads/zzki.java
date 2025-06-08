package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzki {
    public final long zza;
    public final zzci zzb;
    public final int zzc;
    public final zzsa zzd;
    public final long zze;
    public final zzci zzf;
    public final int zzg;
    public final zzsa zzh;
    public final long zzi;
    public final long zzj;

    public zzki(long v, zzci zzci0, int v1, zzsa zzsa0, long v2, zzci zzci1, int v3, zzsa zzsa1, long v4, long v5) {
        this.zza = v;
        this.zzb = zzci0;
        this.zzc = v1;
        this.zzd = zzsa0;
        this.zze = v2;
        this.zzf = zzci1;
        this.zzg = v3;
        this.zzh = zzsa1;
        this.zzi = v4;
        this.zzj = v5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzki.class == class0 && this.zza == ((zzki)object0).zza && this.zzc == ((zzki)object0).zzc && this.zze == ((zzki)object0).zze && this.zzg == ((zzki)object0).zzg && this.zzi == ((zzki)object0).zzi && this.zzj == ((zzki)object0).zzj && zzfoq.zza(this.zzb, ((zzki)object0).zzb) && zzfoq.zza(this.zzd, ((zzki)object0).zzd) && zzfoq.zza(this.zzf, ((zzki)object0).zzf) && zzfoq.zza(this.zzh, ((zzki)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }
}

