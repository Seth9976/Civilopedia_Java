package com.google.android.gms.internal.ads;

public class zzbi {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbi(zzbi zzbi0) {
        this.zza = zzbi0.zza;
        this.zzb = zzbi0.zzb;
        this.zzc = zzbi0.zzc;
        this.zzd = zzbi0.zzd;
        this.zze = zzbi0.zze;
    }

    public zzbi(Object object0, int v, int v1, long v2) {
        this(object0, v, v1, v2, -1);
    }

    public zzbi(Object object0, int v, int v1, long v2, int v3) {
        this.zza = object0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
    }

    public zzbi(Object object0, long v) {
        this(object0, -1, -1, v, -1);
    }

    public zzbi(Object object0, long v, int v1) {
        this(object0, -1, -1, v, v1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbi ? this.zza.equals(((zzbi)object0).zza) && this.zzb == ((zzbi)object0).zzb && this.zzc == ((zzbi)object0).zzc && this.zzd == ((zzbi)object0).zzd && this.zze == ((zzbi)object0).zze : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.zza.hashCode() + 0x20F) * 0x1F + this.zzb) * 0x1F + this.zzc) * 0x1F + ((int)this.zzd)) * 0x1F + this.zze;
    }

    // 去混淆评级： 低(20)
    public final zzbi zza(Object object0) {
        return this.zza.equals(object0) ? this : new zzbi(object0, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }
}

