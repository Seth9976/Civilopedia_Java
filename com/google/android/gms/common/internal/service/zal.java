package com.google.android.gms.common.internal.service;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zal extends zaa implements IInterface {
    public final void zae(zak zak0) throws RemoteException {
        Parcel parcel0 = this.a();
        zac.zad(parcel0, zak0);
        try {
            this.i.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

