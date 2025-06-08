package a;

import android.os.IBinder;
import android.os.Parcel;

public final class a implements c {
    public IBinder i;

    public final boolean a(o.a a0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder(a0);
            boolean z = false;
            this.i.transact(3, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() != 0) {
                z = true;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final boolean b() {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeLong(0L);
            boolean z = false;
            this.i.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() != 0) {
                z = true;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

