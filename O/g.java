package O;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

public final class g extends Binder implements IInterface {
    public final MultiInstanceInvalidationService i;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
        this.i = multiInstanceInvalidationService0;
        super();
        this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void a(int v, String[] arr_s) {
        synchronized(this.i.k) {
            String s = (String)this.i.j.get(v);
            if(s == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int v2 = this.i.k.beginBroadcast();
            try {
                for(int v3 = 0; v3 < v2; ++v3) {
                    Integer integer0 = (Integer)this.i.k.getBroadcastCookie(v3);
                    if(v != ((int)integer0) && s.equals(((String)this.i.j.get(integer0)))) {
                        try {
                            ((b)this.i.k.getBroadcastItem(v3)).a(arr_s);
                        }
                        catch(RemoteException remoteException0) {
                            Log.w("ROOM", "Error invoking a remote callback", remoteException0);
                        }
                    }
                }
            }
            finally {
                this.i.k.finishBroadcast();
            }
        }
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final int b(b b0, String s) {
        if(s == null) {
            return 0;
        }
        synchronized(this.i.k) {
            int v1 = this.i.i + 1;
            this.i.i = v1;
            if(this.i.k.register(b0, v1)) {
                this.i.j.put(v1, s);
                return v1;
            }
            --this.i.i;
            return 0;
        }
    }

    @Override  // android.os.Binder
    public final boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
        b b0 = null;
        switch(v) {
            case 1: {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if(iInterface0 == null || !(iInterface0 instanceof b)) {
                        b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
                        b0.i = iBinder0;
                    }
                    else {
                        b0 = (b)iInterface0;
                    }
                }
                int v2 = this.b(b0, parcel0.readString());
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 2: {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if(iInterface1 == null || !(iInterface1 instanceof b)) {
                        b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
                        b0.i = iBinder1;
                    }
                    else {
                        b0 = (b)iInterface1;
                    }
                }
                int v3 = parcel0.readInt();
                synchronized(this.i.k) {
                    this.i.k.unregister(b0);
                    this.i.j.remove(v3);
                }
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                this.a(parcel0.readInt(), parcel0.createStringArray());
                return true;
            }
            case 0x5F4E5446: {
                parcel1.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            default: {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
        }
    }
}

