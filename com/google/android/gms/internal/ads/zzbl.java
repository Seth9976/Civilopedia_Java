package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzbl implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzbk[] i;

    static {
        zzbl.CREATOR = new i(27);
    }

    public zzbl(Parcel parcel0) {
        this.i = new zzbk[parcel0.readInt()];
        for(int v = 0; true; ++v) {
            zzbk[] arr_zzbk = this.i;
            if(v >= arr_zzbk.length) {
                break;
            }
            arr_zzbk[v] = (zzbk)parcel0.readParcelable(zzbk.class.getClassLoader());
        }
    }

    public zzbl(List list0) {
        this.i = (zzbk[])list0.toArray(new zzbk[0]);
    }

    public zzbl(zzbk[] arr_zzbk) {
        this.i = arr_zzbk;
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
            return zzbl.class == class0 ? Arrays.equals(this.i, ((zzbl)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.i);
    }

    @Override
    public final String toString() {
        return "entries=" + Arrays.toString(this.i);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        zzbk[] arr_zzbk = this.i;
        parcel0.writeInt(arr_zzbk.length);
        for(int v1 = 0; v1 < arr_zzbk.length; ++v1) {
            parcel0.writeParcelable(arr_zzbk[v1], 0);
        }
    }

    public final int zza() {
        return this.i.length;
    }

    public final zzbk zzb(int v) {
        return this.i[v];
    }

    public final zzbl zzc(zzbk[] arr_zzbk) {
        return arr_zzbk.length == 0 ? this : new zzbl(((zzbk[])zzeg.zzac(this.i, arr_zzbk)));
    }

    public final zzbl zzd(zzbl zzbl0) {
        return zzbl0 == null ? this : this.zzc(zzbl0.i);
    }
}

