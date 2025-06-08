package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;

public final class zzbx extends zzaqw implements zzbz {
    public zzbx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.c(parcel0, 1);
    }
}

