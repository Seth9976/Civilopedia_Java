package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.zav;

@Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final ConnectionResult j;
    public final zav k;

    static {
        zak.CREATOR = new zal();
    }

    public zak(int v, ConnectionResult connectionResult0, zav zav0) {
        this.i = v;
        this.j = connectionResult0;
        this.k = zav0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.j, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.k, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final ConnectionResult zaa() {
        return this.j;
    }

    public final zav zab() {
        return this.k;
    }
}

