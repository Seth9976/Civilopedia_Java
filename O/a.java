package o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a extends Binder implements IInterface {
    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v != 0x5F4E5446) {
            switch(v) {
                case 2: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel0.readInt();
                    if(parcel0.readInt() != 0) {
                        Bundle bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        Bundle bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    return true;
                }
                case 4: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if(parcel0.readInt() != 0) {
                        Bundle bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    return true;
                }
                case 5: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        Bundle bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    return true;
                }
                case 6: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel0.readInt();
                    if(parcel0.readInt() != 0) {
                        Uri uri0 = (Uri)Uri.CREATOR.createFromParcel(parcel0);
                    }
                    parcel0.readInt();
                    if(parcel0.readInt() != 0) {
                        Bundle bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    return true;
                }
                case 7: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        Bundle bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    parcel1.writeNoException();
                    parcel1.writeInt(0);
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
        parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}

