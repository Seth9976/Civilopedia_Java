package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzazr implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;

    static {
        zzazr.CREATOR = new i(26);
    }

    public zzazr(int v, int v1, int v2, byte[] arr_b) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = arr_b;
    }

    public zzazr(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readInt() == 0 ? null : parcel0.createByteArray();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzazr.class == class0 && this.zza == ((zzazr)object0).zza && this.zzb == ((zzazr)object0).zzb && this.zzc == ((zzazr)object0).zzc && Arrays.equals(this.zzd, ((zzazr)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzd) + (((this.zza + 0x20F) * 0x1F + this.zzb) * 0x1F + this.zzc) * 0x1F;
            this.i = v1;
            return v1;
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = f.n("ColorInfo(", this.zza, ", ", this.zzb, ", ");
        stringBuilder0.append(this.zzc);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzd != null);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeInt((this.zzd == null ? 0 : 1));
        byte[] arr_b = this.zzd;
        if(arr_b != null) {
            parcel0.writeByteArray(arr_b);
        }
    }
}

