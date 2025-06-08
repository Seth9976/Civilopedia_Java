package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

public final class c extends Binder implements b {
    public final ResultReceiver i;
    public static final int j;

    public c(ResultReceiver resultReceiver0) {
        this.i = resultReceiver0;
        super();
        this.attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                parcel0.enforceInterface("android.support.v4.os.IResultReceiver");
                int v2 = parcel0.readInt();
                Bundle bundle0 = parcel0.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel0));
                this.i.a(v2, bundle0);
                return true;
            }
            case 0x5F4E5446: {
                parcel1.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
    }
}

