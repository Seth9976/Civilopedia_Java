package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "ActivityTransitionEventCreator")
@Reserved({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final long k;

    static {
        ActivityTransitionEvent.CREATOR = new zzm();
    }

    @Constructor
    public ActivityTransitionEvent(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) long v2) {
        ActivityTransition.zza(v1);
        this.i = v;
        this.j = v1;
        this.k = v2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ActivityTransitionEvent ? this.i == ((ActivityTransitionEvent)object0).i && this.j == ((ActivityTransitionEvent)object0).j && this.k == ((ActivityTransitionEvent)object0).k : false;
    }

    public int getActivityType() {
        return this.i;
    }

    public long getElapsedRealTimeNanos() {
        return this.k;
    }

    public int getTransitionType() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j, this.k});
    }

    @Override
    public String toString() {
        return "ActivityType " + this.i + " " + ("TransitionType " + this.j) + " " + ("ElapsedRealTimeNanos " + this.k);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getActivityType());
        SafeParcelWriter.writeInt(parcel0, 2, this.getTransitionType());
        SafeParcelWriter.writeLong(parcel0, 3, this.getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

