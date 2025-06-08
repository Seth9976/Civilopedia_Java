package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbxw extends zzaqw implements zzbxy {
    public zzbxw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbxy
    public final IBinder zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

