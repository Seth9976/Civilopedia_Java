package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {
    public final IBinder i;
    public final String j;

    public zza(IBinder iBinder0, String s) {
        this.i = iBinder0;
        this.j = s;
    }

    public final Parcel a(Parcel parcel0, int v) {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.i.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1;
        }
        catch(RuntimeException runtimeException0) {
            parcel1.recycle();
            throw runtimeException0;
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final Parcel b() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.j);
        return parcel0;
    }
}

