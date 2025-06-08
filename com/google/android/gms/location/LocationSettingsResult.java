package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "LocationSettingsResultCreator")
@Reserved({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator CREATOR;
    public final Status i;
    public final LocationSettingsStates j;

    static {
        LocationSettingsResult.CREATOR = new zzbm();
    }

    @Constructor
    public LocationSettingsResult(@Param(id = 1) Status status0, @Param(id = 2) LocationSettingsStates locationSettingsStates0) {
        this.i = status0;
        this.j = locationSettingsStates0;
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return this.j;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getStatus(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.getLocationSettingsStates(), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

