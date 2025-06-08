package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

public final class zzx extends zza implements ICancelToken {
    @Override  // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        Parcel parcel0 = this.b();
        try {
            this.i.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

