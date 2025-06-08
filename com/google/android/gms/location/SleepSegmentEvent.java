package com.google.android.gms.location;

import android.content.Intent;
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
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Class(creator = "SleepSegmentEventCreator")
@Reserved({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    static {
        SleepSegmentEvent.CREATOR = new zzbv();
    }

    @ShowFirstParty
    @Constructor
    public SleepSegmentEvent(@Param(id = 1) long v, @Param(id = 2) long v1, @Param(id = 3) int v2, @Param(id = 4) int v3, @Param(id = 5) int v4) {
        Preconditions.checkArgument(v <= v1, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = v3;
        this.m = v4;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 instanceof SleepSegmentEvent) {
            long v = ((SleepSegmentEvent)object0).getStartTimeMillis();
            if(this.i == v) {
                long v1 = ((SleepSegmentEvent)object0).getEndTimeMillis();
                if(this.j == v1) {
                    int v2 = ((SleepSegmentEvent)object0).getStatus();
                    return this.k == v2 && this.l == ((SleepSegmentEvent)object0).l && this.m == ((SleepSegmentEvent)object0).m;
                }
            }
        }
        return false;
    }

    public static List extractEvents(Intent intent0) {
        Preconditions.checkNotNull(intent0);
        if(!SleepSegmentEvent.hasEvents(intent0)) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = (ArrayList)intent0.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if(arrayList0 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            byte[] arr_b = (byte[])arrayList0.get(v1);
            Preconditions.checkNotNull(arr_b);
            arrayList1.add(((SleepSegmentEvent)SafeParcelableSerializer.deserializeFromBytes(arr_b, SleepSegmentEvent.CREATOR)));
        }
        return Collections.unmodifiableList(arrayList1);
    }

    public long getEndTimeMillis() {
        return this.j;
    }

    public long getSegmentDurationMillis() {
        return this.j - this.i;
    }

    public long getStartTimeMillis() {
        return this.i;
    }

    public int getStatus() {
        return this.k;
    }

    public static boolean hasEvents(Intent intent0) {
        return intent0 == null ? false : intent0.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j, this.k});
    }

    @Override
    public String toString() {
        return "startMillis=" + this.i + ", endMillis=" + this.j + ", status=" + this.k;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeLong(parcel0, 1, this.getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel0, 2, this.getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel0, 3, this.getStatus());
        SafeParcelWriter.writeInt(parcel0, 4, this.l);
        SafeParcelWriter.writeInt(parcel0, 5, this.m);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

