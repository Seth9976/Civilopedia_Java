package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;

    static {
        zzak.CREATOR = new zzal();
    }

    public zzak(int v) {
        this.i = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

