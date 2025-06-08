package com.google.android.gms.internal.appset;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzg extends zza implements IInterface {
    public final void zzc(com.google.android.gms.appset.zza zza0, zzf zzf0) throws RemoteException {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        zzc.zzb(parcel0, zza0);
        zzc.zzc(parcel0, zzf0);
        Parcel parcel1 = Parcel.obtain();
        try {
            this.i.transact(1, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel0.recycle();
            parcel1.recycle();
        }
    }
}

