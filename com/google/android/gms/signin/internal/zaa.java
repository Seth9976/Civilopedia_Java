package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final Intent k;

    static {
        zaa.CREATOR = new zab();
    }

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int v, int v1, Intent intent0) {
        this.i = v;
        this.j = v1;
        this.k = intent0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.j == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.k, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

