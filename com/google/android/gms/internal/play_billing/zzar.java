package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzar extends Binder implements IInterface {
    public zzar(String s) {
        this.attachInterface(this, s);
    }

    public boolean a(int v, Parcel parcel0, Parcel parcel1) {
        throw null;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v > 0xFFFFFF) {
            return super.onTransact(v, parcel0, parcel1, v1) ? true : this.a(v, parcel0, parcel1);
        }
        parcel0.enforceInterface(this.getInterfaceDescriptor());
        return this.a(v, parcel0, parcel1);
    }
}

