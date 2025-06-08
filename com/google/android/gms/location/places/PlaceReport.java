package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.util.VisibleForTesting;

@Class(creator = "PlaceReportCreator")
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final String j;
    public final String k;
    public final String l;

    static {
        PlaceReport.CREATOR = new zza();
    }

    public PlaceReport(int v, String s, String s1, String s2) {
        this.i = v;
        this.j = s;
        this.k = s1;
        this.l = s2;
    }

    @VisibleForTesting
    public static PlaceReport create(String s, String s1) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotEmpty(s1);
        new String("unknown");
        Preconditions.checkArgument(true, "Invalid source");
        return new PlaceReport(1, s, s1, "unknown");
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof PlaceReport ? Objects.equal(this.j, ((PlaceReport)object0).j) && Objects.equal(this.k, ((PlaceReport)object0).k) && Objects.equal(this.l, ((PlaceReport)object0).l) : false;
    }

    public String getPlaceId() {
        return this.j;
    }

    public String getTag() {
        return this.k;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.j, this.k, this.l});
    }

    @Override
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("placeId", this.j);
        objects$ToStringHelper0.add("tag", this.k);
        String s = this.l;
        if(!"unknown".equals(s)) {
            objects$ToStringHelper0.add("source", s);
        }
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeString(parcel0, 2, this.getPlaceId(), false);
        SafeParcelWriter.writeString(parcel0, 3, this.getTag(), false);
        SafeParcelWriter.writeString(parcel0, 4, this.l, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

