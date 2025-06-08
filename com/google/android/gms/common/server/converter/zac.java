package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final String j;
    public final int k;

    static {
        zac.CREATOR = new zae();
    }

    public zac(int v, String s, int v1) {
        this.i = v;
        this.j = s;
        this.k = v1;
    }

    public zac(String s, int v) {
        this.i = 1;
        this.j = s;
        this.k = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

