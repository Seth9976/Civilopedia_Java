package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzach extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;

    static {
        zzach.CREATOR = new i(12);
    }

    public zzach(Parcel parcel0) {
        super("PRIV");
        this.zza = parcel0.readString();
        this.zzb = (byte[])zzeg.zzG(parcel0.createByteArray());
    }

    public zzach(String s, byte[] arr_b) {
        super("PRIV");
        this.zza = s;
        this.zzb = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzach.class == class0 && zzeg.zzS(this.zza, ((zzach)object0).zza) && Arrays.equals(this.zzb, ((zzach)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza == null ? Arrays.hashCode(this.zzb) + 0x3FD1 : Arrays.hashCode(this.zzb) + (this.zza.hashCode() + 0x20F) * 0x1F;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return f.i(this.zzf, ": owner=", this.zza);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
    }
}

