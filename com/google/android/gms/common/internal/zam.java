package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zam extends zaa implements IInterface {
    public final IObjectWrapper zae(IObjectWrapper iObjectWrapper0, zax zax0) throws RemoteException {
        Parcel parcel0 = this.a();
        zac.zad(parcel0, iObjectWrapper0);
        zac.zac(parcel0, zax0);
        Parcel parcel1 = Parcel.obtain();
        try {
            this.i.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
        }
        catch(RuntimeException runtimeException0) {
            parcel1.recycle();
            throw runtimeException0;
        }
        finally {
            parcel0.recycle();
        }
        IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel1.readStrongBinder());
        parcel1.recycle();
        return iObjectWrapper1;
    }
}

