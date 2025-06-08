package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final int k;
    public final Scope[] l;

    static {
        zax.CREATOR = new zay();
    }

    public zax(int v, int v1, int v2, Scope[] arr_scope) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = arr_scope;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeTypedArray(parcel0, 4, this.l, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

