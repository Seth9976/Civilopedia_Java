package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ConnectionInfoCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Bundle i;
    public Feature[] j;
    public int k;
    public ConnectionTelemetryConfiguration l;

    static {
        zzk.CREATOR = new zzl();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 1, this.i, false);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.j, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.l, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

