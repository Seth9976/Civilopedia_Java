package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzbqw extends zzaqw implements zzbqy {
    @Override  // com.google.android.gms.internal.ads.zzbqy
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqy
    public final void zzf() throws RemoteException {
        this.c(this.a(), 1);
    }
}

