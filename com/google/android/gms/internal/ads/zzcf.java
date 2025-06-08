package com.google.android.gms.internal.ads;

public final class zzcf {
    public zzd a;
    public static final zzl zza;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;

    static {
        zzcf.zza = zzce.zza;
    }

    public zzcf() {
        this.a = zzd.zza;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzcf.class.equals(class0) && zzeg.zzS(this.zzb, ((zzcf)object0).zzb) && zzeg.zzS(this.zzc, ((zzcf)object0).zzc) && this.zzd == ((zzcf)object0).zzd && this.zze == ((zzcf)object0).zze && this.zzg == ((zzcf)object0).zzg && zzeg.zzS(this.a, ((zzcf)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zzb == null ? 0 : this.zzb.hashCode();
        Object object0 = this.zzc;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return this.a.hashCode() + (((((v1 + 0xD9) * 0x1F + v) * 0x1F + this.zzd) * 0x1F + ((int)(this.zze >>> 0x20 ^ this.zze))) * 961 + this.zzg) * 0x1F;
    }

    public final int zza(int v) {
        return this.a.zza(v).zzc;
    }

    public final int zzb() [...] // Inlined contents

    public final int zzc(long v) [...] // Inlined contents

    public final int zzd(long v) [...] // Inlined contents

    public final int zze(int v) {
        return this.a.zza(v).zza(-1);
    }

    public final int zzf(int v, int v1) {
        return this.a.zza(v).zza(v1);
    }

    public final long zzg(int v, int v1) {
        zzc zzc0 = this.a.zza(v);
        return zzc0.zzc == -1 ? 0x8000000000000001L : zzc0.zzf[v1];
    }

    public final long zzh(int v) {
        return 0L;
    }

    public final long zzi() [...] // Inlined contents

    public final long zzj(int v) {
        return 0L;
    }

    public final zzcf zzk(Object object0, Object object1, int v, long v1, long v2, zzd zzd0, boolean z) {
        this.zzb = object0;
        this.zzc = object1;
        this.zzd = 0;
        this.zze = v1;
        this.zzf = 0L;
        this.a = zzd0;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int v) {
        return false;
    }
}

