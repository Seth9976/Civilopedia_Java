package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzdc extends zzaqw implements zzde {
    public zzdc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzs0);
        this.c(parcel0, 1);
    }
}

