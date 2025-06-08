package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzbqi extends zzaqw implements zzbqk {
    @Override  // com.google.android.gms.internal.ads.zzbqk
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqk
    public final void zzf() throws RemoteException {
        this.c(this.a(), 2);
    }
}

