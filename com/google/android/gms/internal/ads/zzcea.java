package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcea extends zzaqw implements zzcec {
    @Override  // com.google.android.gms.internal.ads.zzcec
    public final zzcdz zze(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) throws RemoteException {
        zzcdz zzcdz0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 2);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzcdz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdz0 = iInterface0 instanceof zzcdz ? ((zzcdz)iInterface0) : new zzcdx(iBinder0);
        }
        parcel1.recycle();
        return zzcdz0;
    }
}

