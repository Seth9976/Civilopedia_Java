package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;

@Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator CREATOR;
    public final List i;
    public final String j;

    static {
        zag.CREATOR = new zah();
    }

    @Constructor
    public zag(@Param(id = 1) List list0, @Param(id = 2) String s) {
        this.i = list0;
        this.j = s;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.j == null ? Status.RESULT_CANCELED : Status.RESULT_SUCCESS;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeStringList(parcel0, 1, this.i, false);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

