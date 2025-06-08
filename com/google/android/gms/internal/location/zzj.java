package com.google.android.gms.internal.location;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;

@Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzs i;
    public final List j;
    public final String k;
    public static final List l;
    public static final zzs m;

    static {
        zzj.l = Collections.emptyList();
        zzj.m = new zzs();
        zzj.CREATOR = new zzk();
    }

    public zzj(zzs zzs0, List list0, String s) {
        this.i = zzs0;
        this.j = list0;
        this.k = s;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzj ? Objects.equal(this.i, ((zzj)object0).i) && Objects.equal(this.j, ((zzj)object0).j) && Objects.equal(this.k, ((zzj)object0).k) : false;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.i);
        String s1 = String.valueOf(this.j);
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 77 + s1.length() + String.valueOf(this.k).length());
        f.t(stringBuilder0, "DeviceOrientationRequestInternal{deviceOrientationRequest=", s, ", clients=", s1);
        stringBuilder0.append(", tag=\'");
        stringBuilder0.append(this.k);
        stringBuilder0.append("\'}");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.i, v, false);
        SafeParcelWriter.writeTypedList(parcel0, 2, this.j, false);
        SafeParcelWriter.writeString(parcel0, 3, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

