package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzat extends zzaq implements zzav {
    @Override  // com.google.android.gms.internal.play_billing.zzav
    public final void zza(String s, String s1, zzax zzax0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeStrongBinder(((IBinder)zzax0));
        this.d(parcel0, 1);
    }
}

