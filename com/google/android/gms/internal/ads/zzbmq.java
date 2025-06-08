package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbmq extends zzaqw implements zzbms {
    @Override  // com.google.android.gms.internal.ads.zzbms
    public final boolean zzb(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 2);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }
}

