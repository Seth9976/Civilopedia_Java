package com.google.android.gms.internal.location;

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

@Class(creator = "FusedLocationProviderResultCreator")
@Reserved({1000})
public final class zzaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator CREATOR;
    public final Status i;
    public static final zzaa zza;

    static {
        zzaa.zza = new zzaa(Status.RESULT_SUCCESS);
        zzaa.CREATOR = new zzab();
    }

    @Constructor
    public zzaa(@Param(id = 1) Status status0) {
        this.i = status0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.i, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

