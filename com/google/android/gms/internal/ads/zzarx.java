package com.google.android.gms.internal.ads;

public final class zzarx {
    public final int a;
    public static final zzarx zza;
    public final float zzb;
    public final float zzc;

    static {
        zzarx.zza = new zzarx(1.0f, 1.0f);
    }

    public zzarx(float f, float f1) {
        this.zzb = f;
        this.zzc = 1.0f;
        this.a = Math.round(f * 1000.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzarx.class == class0 && this.zzb == ((zzarx)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0x3F800000 + (Float.floatToRawIntBits(this.zzb) + 0x20F) * 0x1F;
    }

    public final long zza(long v) {
        return v * ((long)this.a);
    }
}

