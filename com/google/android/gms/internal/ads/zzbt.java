package com.google.android.gms.internal.ads;

public final class zzbt {
    public final int a;
    public static final zzbt zza;
    public static final zzl zzb;
    public final float zzc;
    public final float zzd;

    static {
        zzbt.zza = new zzbt(1.0f, 1.0f);
        zzbt.zzb = zzbs.zza;
    }

    public zzbt(float f, float f1) {
        boolean z = false;
        zzcw.zzd(f > 0.0f);
        if(f1 > 0.0f) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzc = f;
        this.zzd = f1;
        this.a = Math.round(f * 1000.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbt.class == class0 && this.zzc == ((zzbt)object0).zzc && this.zzd == ((zzbt)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzd) + (Float.floatToRawIntBits(this.zzc) + 0x20F) * 0x1F;
    }

    @Override
    public final String toString() {
        return zzeg.zzH("PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[]{this.zzc, this.zzd});
    }

    public final long zza(long v) {
        return v * ((long)this.a);
    }
}

