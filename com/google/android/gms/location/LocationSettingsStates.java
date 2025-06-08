package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@Class(creator = "LocationSettingsStatesCreator")
@Reserved({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    static {
        LocationSettingsStates.CREATOR = new zzbn();
    }

    @Constructor
    public LocationSettingsStates(@Param(id = 1) boolean z, @Param(id = 2) boolean z1, @Param(id = 3) boolean z2, @Param(id = 4) boolean z3, @Param(id = 5) boolean z4, @Param(id = 6) boolean z5) {
        this.i = z;
        this.j = z1;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
    }

    public static LocationSettingsStates fromIntent(Intent intent0) {
        return (LocationSettingsStates)SafeParcelableSerializer.deserializeFromIntentExtra(intent0, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", LocationSettingsStates.CREATOR);
    }

    public boolean isBlePresent() {
        return this.n;
    }

    public boolean isBleUsable() {
        return this.k;
    }

    public boolean isGpsPresent() {
        return this.l;
    }

    public boolean isGpsUsable() {
        return this.i;
    }

    // 去混淆评级： 低(20)
    public boolean isLocationPresent() {
        return this.l || this.m;
    }

    // 去混淆评级： 低(20)
    public boolean isLocationUsable() {
        return this.i || this.j;
    }

    public boolean isNetworkLocationPresent() {
        return this.m;
    }

    public boolean isNetworkLocationUsable() {
        return this.j;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel0, 2, this.isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.isBleUsable());
        SafeParcelWriter.writeBoolean(parcel0, 4, this.isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel0, 6, this.isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

