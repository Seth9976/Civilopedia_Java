package b;

import android.os.IBinder;

public final class a implements b {
    public IBinder i;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }
}

