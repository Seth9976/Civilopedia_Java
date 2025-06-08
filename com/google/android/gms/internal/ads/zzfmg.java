package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzfmg extends zzaqw implements IInterface {
    public final zzfme zze(zzfmc zzfmc0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzfmc0);
        Parcel parcel1 = this.b(parcel0, 1);
        zzfme zzfme0 = (zzfme)zzaqy.zza(parcel1, zzfme.CREATOR);
        parcel1.recycle();
        return zzfme0;
    }

    public final zzfmn zzf(zzfml zzfml0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzfml0);
        Parcel parcel1 = this.b(parcel0, 3);
        zzfmn zzfmn0 = (zzfmn)zzaqy.zza(parcel1, zzfmn.CREATOR);
        parcel1.recycle();
        return zzfmn0;
    }

    public final void zzg(zzflz zzflz0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzflz0);
        this.c(parcel0, 2);
    }
}

