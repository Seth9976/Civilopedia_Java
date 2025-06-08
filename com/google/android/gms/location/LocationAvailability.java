package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;

@Class(creator = "LocationAvailabilityCreator")
@Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public int j;
    public long k;
    public int l;
    public zzbo[] m;

    static {
        LocationAvailability.CREATOR = new zzbe();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof LocationAvailability && this.i == ((LocationAvailability)object0).i && this.j == ((LocationAvailability)object0).j && this.k == ((LocationAvailability)object0).k && this.l == ((LocationAvailability)object0).l && Arrays.equals(this.m, ((LocationAvailability)object0).m);
    }

    public static LocationAvailability extractLocationAvailability(Intent intent0) {
        if(!LocationAvailability.hasLocationAvailability(intent0)) {
            return null;
        }
        try {
            Bundle bundle0 = intent0.getExtras();
            return bundle0 == null ? null : ((LocationAvailability)bundle0.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY"));
        }
        catch(ClassCastException unused_ex) {
        }
        return null;
    }

    public static boolean hasLocationAvailability(Intent intent0) {
        return intent0 == null ? false : intent0.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.l, this.i, this.j, this.k, this.m});
    }

    public boolean isLocationAvailable() {
        return this.l < 1000;
    }

    @Override
    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + this.isLocationAvailable() + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeLong(parcel0, 3, this.k);
        SafeParcelWriter.writeInt(parcel0, 4, this.l);
        SafeParcelWriter.writeTypedArray(parcel0, 5, this.m, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

