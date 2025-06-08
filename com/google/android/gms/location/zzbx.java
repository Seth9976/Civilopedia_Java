package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@ShowFirstParty
@Class(creator = "UserPreferredSleepWindowCreator")
@Reserved({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    static {
        zzbx.CREATOR = new zzby();
    }

    @Constructor
    public zzbx(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) int v3) {
        boolean z = true;
        Preconditions.checkState(v >= 0 && v <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(v1 >= 0 && v1 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(v2 >= 0 && v2 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(v3 >= 0 && v3 <= 59, "End minute must be in range [0, 59].");
        if(v + v1 + v2 + v3 <= 0) {
            z = false;
        }
        Preconditions.checkState(z, "Parameters can\'t be all 0.");
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbx ? this.i == ((zzbx)object0).i && this.j == ((zzbx)object0).j && this.k == ((zzbx)object0).k && this.l == ((zzbx)object0).l : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j, this.k, this.l});
    }

    @Override
    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.i + ", startMinute=" + this.j + ", endHour=" + this.k + ", endMinute=" + this.l + ']';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeInt(parcel0, 4, this.l);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

