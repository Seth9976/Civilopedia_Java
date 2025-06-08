package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcna extends zzaqw implements zzcnc {
    @Override  // com.google.android.gms.internal.ads.zzcnc
    public final void zze(IObjectWrapper iObjectWrapper0, zzcmz zzcmz0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzcmz0);
        this.c(parcel0, 2);
    }
}

