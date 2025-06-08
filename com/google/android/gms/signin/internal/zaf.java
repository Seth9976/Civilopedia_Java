package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zaf extends zaa implements IInterface {
    public final void zae(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.b(parcel0, 7);
    }

    public final void zaf(IAccountAccessor iAccountAccessor0, int v, boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zac.zad(parcel0, iAccountAccessor0);
        parcel0.writeInt(v);
        parcel0.writeInt(((int)z));
        this.b(parcel0, 9);
    }

    public final void zag(zai zai0, zae zae0) throws RemoteException {
        Parcel parcel0 = this.a();
        zac.zac(parcel0, zai0);
        zac.zad(parcel0, zae0);
        this.b(parcel0, 12);
    }
}

