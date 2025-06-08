package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Class(creator = "ActivityTransitionCreator")
@Reserved({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    public static class Builder {
        public int a;
        public int b;

        public Builder() {
            this.a = -1;
            this.b = -1;
        }

        public ActivityTransition build() {
            boolean z = false;
            Preconditions.checkState(this.a != -1, "Activity type not set.");
            if(this.b != -1) {
                z = true;
            }
            Preconditions.checkState(z, "Activity transition type not set.");
            return new ActivityTransition(this.a, this.b);
        }

        public Builder setActivityTransition(int v) {
            ActivityTransition.zza(v);
            this.b = v;
            return this;
        }

        public Builder setActivityType(int v) {
            this.a = v;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;

    static {
        ActivityTransition.CREATOR = new zzl();
    }

    public ActivityTransition(int v, int v1) {
        this.i = v;
        this.j = v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ActivityTransition ? this.i == ((ActivityTransition)object0).i && this.j == ((ActivityTransition)object0).j : false;
    }

    public int getActivityType() {
        return this.i;
    }

    public int getTransitionType() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j});
    }

    @Override
    public String toString() {
        return "ActivityTransition [mActivityType=" + this.i + ", mTransitionType=" + this.j + ']';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getActivityType());
        SafeParcelWriter.writeInt(parcel0, 2, this.getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static void zza(int v) {
        Preconditions.checkArgument(v >= 0 && v <= 1, "Transition type " + v + " is not valid.");
    }
}

