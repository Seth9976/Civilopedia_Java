package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final Account j;
    public final int k;
    public final GoogleSignInAccount l;

    static {
        zat.CREATOR = new zau();
    }

    public zat(int v, Account account0, int v1, GoogleSignInAccount googleSignInAccount0) {
        this.i = v;
        this.j = account0;
        this.k = v1;
        this.l = googleSignInAccount0;
    }

    public zat(Account account0, int v, GoogleSignInAccount googleSignInAccount0) {
        this(2, account0, v, googleSignInAccount0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.j, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.l, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

