package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzats implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR;
    public final zzatr[] i;
    public int j;
    public final int zza;

    static {
        zzats.CREATOR = new i(20);
    }

    public zzats(Parcel parcel0) {
        zzatr[] arr_zzatr = (zzatr[])parcel0.createTypedArray(zzatr.CREATOR);
        this.i = arr_zzatr;
        this.zza = arr_zzatr.length;
    }

    public zzats(List list0) {
        this(false, ((zzatr[])list0.toArray(new zzatr[list0.size()])));
    }

    public zzats(boolean z, zzatr[] arr_zzatr) {
        if(z) {
            arr_zzatr = (zzatr[])arr_zzatr.clone();
        }
        Arrays.sort(arr_zzatr, this);
        for(int v = 1; v < arr_zzatr.length; ++v) {
            if(arr_zzatr[v - 1].j.equals(arr_zzatr[v].j)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + arr_zzatr[v].j);
            }
        }
        this.i = arr_zzatr;
        this.zza = arr_zzatr.length;
    }

    public zzats(zzatr[] arr_zzatr) {
        this(true, arr_zzatr);
    }

    @Override
    public final int compare(Object object0, Object object1) {
        UUID uUID0 = zzare.zzb;
        if(uUID0.equals(((zzatr)object0).j)) {
            return uUID0.equals(((zzatr)object1).j) ? 0 : 1;
        }
        return ((zzatr)object0).j.compareTo(((zzatr)object1).j);
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
            return zzats.class == class0 ? Arrays.equals(this.i, ((zzats)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.j;
        if(v == 0) {
            v = Arrays.hashCode(this.i);
            this.j = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedArray(this.i, 0);
    }

    public final zzatr zza(int v) {
        return this.i[v];
    }
}

