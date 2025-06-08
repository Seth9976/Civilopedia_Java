package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbpl extends zzaqw implements zzbpn {
    @Override  // com.google.android.gms.internal.ads.zzbpn
    public final zzbpk zze(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v, zzbph zzbph0) throws RemoteException {
        zzbpk zzbpk0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        zzaqy.zzg(parcel0, zzbph0);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbpk0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbpk0 = iInterface0 instanceof zzbpk ? ((zzbpk)iInterface0) : new zzbpi(iBinder0);
        }
        parcel1.recycle();
        return zzbpk0;
    }
}

