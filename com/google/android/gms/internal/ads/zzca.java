package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzca {
    public static final zzl zza;
    public final Object zzb;
    public final int zzc;
    public final zzbb zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    static {
        zzca.zza = zzbz.zza;
    }

    public zzca(Object object0, int v, zzbb zzbb0, Object object1, int v1, long v2, long v3, int v4, int v5) {
        this.zzb = object0;
        this.zzc = v;
        this.zzd = zzbb0;
        this.zze = object1;
        this.zzf = v1;
        this.zzg = v2;
        this.zzh = v3;
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
            return zzca.class == class0 && this.zzc == ((zzca)object0).zzc && this.zzf == ((zzca)object0).zzf && this.zzg == ((zzca)object0).zzg && this.zzh == ((zzca)object0).zzh && this.zzi == ((zzca)object0).zzi && this.zzj == ((zzca)object0).zzj && zzfoq.zza(this.zzb, ((zzca)object0).zzb) && zzfoq.zza(this.zze, ((zzca)object0).zze) && zzfoq.zza(this.zzd, ((zzca)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }
}

