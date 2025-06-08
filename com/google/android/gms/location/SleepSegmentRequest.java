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
import java.util.List;

@Class(creator = "SleepSegmentRequestCreator")
@Reserved({1000})
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    public static final Parcelable.Creator CREATOR = null;
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    public final List i;
    public final int j;

    static {
        SleepSegmentRequest.CREATOR = new zzbw();
    }

    public SleepSegmentRequest(int v) {
        this(null, v);
    }

    @ShowFirstParty
    @Constructor
    public SleepSegmentRequest(@Param(id = 1) List list0, @Param(id = 2) int v) {
        this.i = list0;
        this.j = v;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SleepSegmentRequest ? Objects.equal(this.i, ((SleepSegmentRequest)object0).i) && this.j == ((SleepSegmentRequest)object0).j : false;
    }

    public static SleepSegmentRequest getDefaultSleepSegmentRequest() {
        return new SleepSegmentRequest(null, 0);
    }

    public int getRequestedDataType() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, this.i, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.getRequestedDataType());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

