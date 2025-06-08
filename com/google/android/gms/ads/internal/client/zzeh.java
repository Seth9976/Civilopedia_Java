package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "LiteSdkVersionsParcelCreator")
public final class zzeh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final String k;

    static {
        zzeh.CREATOR = new zzei();
    }

    public zzeh() {
        this(221908400, 221908000, "21.1.0");
    }

    @Constructor
    public zzeh(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) String s) {
        this.i = v;
        this.j = v1;
        this.k = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeString(parcel0, 3, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final int zza() {
        return this.j;
    }
}

