package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Class(creator = "LocationSettingsRequestCreator")
@Reserved({1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final class Builder {
        public final ArrayList a;
        public boolean b;
        public boolean c;

        public Builder() {
            this.a = new ArrayList();
            this.b = false;
            this.c = false;
        }

        public Builder addAllLocationRequests(Collection collection0) {
            for(Object object0: collection0) {
                LocationRequest locationRequest0 = (LocationRequest)object0;
                if(locationRequest0 != null) {
                    this.a.add(locationRequest0);
                }
            }
            return this;
        }

        public Builder addLocationRequest(LocationRequest locationRequest0) {
            if(locationRequest0 != null) {
                this.a.add(locationRequest0);
            }
            return this;
        }

        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.a, this.b, this.c, null);
        }

        public Builder setAlwaysShow(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setNeedBle(boolean z) {
            this.c = z;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final ArrayList i;
    public final boolean j;
    public final boolean k;
    public final zzbj l;

    static {
        LocationSettingsRequest.CREATOR = new zzbl();
    }

    public LocationSettingsRequest(ArrayList arrayList0, boolean z, boolean z1, zzbj zzbj0) {
        this.i = arrayList0;
        this.j = z;
        this.k = z1;
        this.l = zzbj0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, Collections.unmodifiableList(this.i), false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.j);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.k);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.l, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

