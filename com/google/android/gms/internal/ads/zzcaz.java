package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcaz extends zzaqw implements zzcbb {
    public zzcaz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbb
    public final int zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbb
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 1);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

