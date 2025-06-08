package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "AppSetIdRequestParamsCreator")
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final String j;

    static {
        zza.CREATOR = new zzb();
    }

    @Constructor
    public zza(@Param(id = 1) String s, @Param(id = 2) String s1) {
        this.i = s;
        this.j = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.i, false);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

