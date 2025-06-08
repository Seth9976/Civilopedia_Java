package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final String j;

    static {
        Scope.CREATOR = new zza();
    }

    public Scope(int v, String s) {
        Preconditions.checkNotEmpty(s, "scopeUri must not be null or empty");
        this.i = v;
        this.j = s;
    }

    public Scope(String s) {
        this(1, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Scope ? this.j.equals(((Scope)object0).j) : false;
    }

    @KeepForSdk
    public String getScopeUri() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return this.j.hashCode();
    }

    @Override
    public String toString() {
        return this.j;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeString(parcel0, 2, this.getScopeUri(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

