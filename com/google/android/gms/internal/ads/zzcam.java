package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcam extends zzaqw implements IInterface {
    public final void zze(zzcal zzcal0, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcal0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.c(parcel0, 2);
    }
}

