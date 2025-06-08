package com.google.android.gms.internal.ads;

public final class zzcv {
    public static final zzcv zza;
    public static final zzl zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    static {
        zzcv.zza = new zzcv(0, 0, 0, 1.0f);
        zzcv.zzb = zzcu.zza;
    }

    public zzcv(int v, int v1, int v2, float f) {
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = f;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zzcv && this.zzc == ((zzcv)object0).zzc && this.zzd == ((zzcv)object0).zzd && this.zze == ((zzcv)object0).zze && this.zzf == ((zzcv)object0).zzf;
    }

    @Override
    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzf) + (((this.zzc + 0xD9) * 0x1F + this.zzd) * 0x1F + this.zze) * 0x1F;
    }
}

