package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

@Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final Context l;
    public final boolean m;
    public final boolean n;

    static {
        zzo.CREATOR = new zzp();
    }

    public zzo(String s, boolean z, boolean z1, IBinder iBinder0, boolean z2, boolean z3) {
        this.i = s;
        this.j = z;
        this.k = z1;
        this.l = (Context)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.m = z2;
        this.n = z3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.i, false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.j);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.k);
        SafeParcelWriter.writeIBinder(parcel0, 4, ((IBinder)ObjectWrapper.wrap(this.l)), false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.m);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.n);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

