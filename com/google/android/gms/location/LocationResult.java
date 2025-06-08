package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Class(creator = "LocationResultCreator")
@Reserved({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List i;
    public static final List j;

    static {
        LocationResult.j = Collections.emptyList();
        LocationResult.CREATOR = new zzbg();
    }

    public LocationResult(List list0) {
        this.i = list0;
    }

    public static LocationResult create(List list0) {
        if(list0 == null) {
            list0 = LocationResult.j;
        }
        return new LocationResult(list0);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 instanceof LocationResult) {
            List list0 = this.i;
            if(((LocationResult)object0).i.size() != list0.size()) {
                return false;
            }
            Iterator iterator0 = ((LocationResult)object0).i.iterator();
            Iterator iterator1 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator1.next();
                Object object2 = iterator0.next();
                if(((Location)object1).getTime() != ((Location)object2).getTime()) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static LocationResult extractResult(Intent intent0) {
        return LocationResult.hasResult(intent0) ? ((LocationResult)intent0.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT")) : null;
    }

    public Location getLastLocation() {
        int v = this.i.size();
        return v == 0 ? null : ((Location)this.i.get(v - 1));
    }

    public List getLocations() {
        return this.i;
    }

    public static boolean hasResult(Intent intent0) {
        return intent0 == null ? false : intent0.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    @Override
    public int hashCode() {
        int v = 17;
        for(Object object0: this.i) {
            long v1 = ((Location)object0).getTime();
            v = v * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
        }
        return v;
    }

    @Override
    public String toString() {
        return "LocationResult[locations: " + this.i + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, this.getLocations(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

