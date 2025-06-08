package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;

public class zza implements IInterface {
    public final IBinder i;

    public zza(IBinder iBinder0) {
        this.i = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }
}

