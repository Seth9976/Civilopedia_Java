package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbpi extends zzaqw implements zzbpk {
    public zzbpi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 1);
    }
}

