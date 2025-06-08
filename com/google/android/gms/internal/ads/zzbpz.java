package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbpz extends zzaqw implements IInterface {
    public final void zze(zzbpt zzbpt0, zzbpy zzbpy0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbpt0);
        zzaqy.zzg(parcel0, zzbpy0);
        try {
            this.i.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

