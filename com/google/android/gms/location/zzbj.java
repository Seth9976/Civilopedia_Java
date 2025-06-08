package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@ShowFirstParty
@Class(creator = "LocationSettingsConfigurationCreator")
@Reserved({3, 4, 1000})
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final String j;
    public final String k;

    static {
        zzbj.CREATOR = new zzbk();
    }

    public zzbj(String s, String s1, String s2) {
        this.k = s;
        this.i = s1;
        this.j = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.i, false);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.writeString(parcel0, 5, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

