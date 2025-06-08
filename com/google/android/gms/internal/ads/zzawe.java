package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzawe implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzawd[] i;

    static {
        zzawe.CREATOR = new i(22);
    }

    public zzawe(Parcel parcel0) {
        this.i = new zzawd[parcel0.readInt()];
        for(int v = 0; true; ++v) {
            zzawd[] arr_zzawd = this.i;
            if(v >= arr_zzawd.length) {
                break;
            }
            arr_zzawd[v] = (zzawd)parcel0.readParcelable(zzawd.class.getClassLoader());
        }
    }

    public zzawe(List list0) {
        zzawd[] arr_zzawd = new zzawd[list0.size()];
        this.i = arr_zzawd;
        list0.toArray(arr_zzawd);
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
            return zzawe.class == class0 ? Arrays.equals(this.i, ((zzawe)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.i);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        zzawd[] arr_zzawd = this.i;
        parcel0.writeInt(arr_zzawd.length);
        for(int v1 = 0; v1 < arr_zzawd.length; ++v1) {
            parcel0.writeParcelable(arr_zzawd[v1], 0);
        }
    }

    public final int zza() {
        return this.i.length;
    }

    public final zzawd zzb(int v) {
        return this.i[v];
    }
}

