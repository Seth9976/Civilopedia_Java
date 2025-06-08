package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final IBinder j;
    public final ConnectionResult k;
    public final boolean l;
    public final boolean m;

    static {
        zav.CREATOR = new zaw();
    }

    public zav(int v, IBinder iBinder0, ConnectionResult connectionResult0, boolean z, boolean z1) {
        this.i = v;
        this.j = iBinder0;
        this.k = connectionResult0;
        this.l = z;
        this.m = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        return object0 instanceof zav ? this.k.equals(((zav)object0).k) && Objects.equal(this.zab(), ((zav)object0).zab()) : false;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeIBinder(parcel0, 2, this.j, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.k, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.l);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.m);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final ConnectionResult zaa() {
        return this.k;
    }

    public final IAccountAccessor zab() {
        return this.j == null ? null : Stub.asInterface(this.j);
    }

    public final boolean zac() {
        return this.l;
    }

    public final boolean zad() {
        return this.m;
    }
}

