package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabo extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final byte[] zza;

    static {
        zzabo.CREATOR = new i(5);
    }

    public zzabo(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = (byte[])zzeg.zzG(parcel0.createByteArray());
    }

    public zzabo(String s, byte[] arr_b) {
        super(s);
        this.zza = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzabo.class == class0 && this.zzf.equals(((zzabo)object0).zzf) && Arrays.equals(this.zza, ((zzabo)object0).zza);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zza) + f.b(0x20F, 0x1F, this.zzf);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeByteArray(this.zza);
    }
}

