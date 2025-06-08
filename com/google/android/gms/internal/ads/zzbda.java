package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbda extends zzaqw implements IInterface {
    public final long zze(zzbcy zzbcy0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbcy0);
        Parcel parcel1 = this.b(parcel0, 3);
        long v = parcel1.readLong();
        parcel1.recycle();
        return v;
    }

    public final zzbcv zzf(zzbcy zzbcy0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbcy0);
        Parcel parcel1 = this.b(parcel0, 1);
        zzbcv zzbcv0 = (zzbcv)zzaqy.zza(parcel1, zzbcv.CREATOR);
        parcel1.recycle();
        return zzbcv0;
    }

    public final zzbcv zzg(zzbcy zzbcy0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbcy0);
        Parcel parcel1 = this.b(parcel0, 2);
        zzbcv zzbcv0 = (zzbcv)zzaqy.zza(parcel1, zzbcv.CREATOR);
        parcel1.recycle();
        return zzbcv0;
    }
}

