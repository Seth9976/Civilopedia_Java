package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmt extends zzaqw implements zzbmv {
    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zze() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 1);
    }
}

