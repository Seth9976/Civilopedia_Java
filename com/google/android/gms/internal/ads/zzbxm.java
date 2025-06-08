package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbxm extends zzaqw implements zzbxo {
    @Override  // com.google.android.gms.internal.ads.zzbxo
    public final zzbxl zze(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) throws RemoteException {
        zzbxl zzbxl0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbxl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbxl0 = iInterface0 instanceof zzbxl ? ((zzbxl)iInterface0) : new zzbxj(iBinder0);
        }
        parcel1.recycle();
        return zzbxl0;
    }
}

