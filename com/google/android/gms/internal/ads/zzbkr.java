package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbkr extends zzaqw implements zzbkt {
    public zzbkr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzbkt
    public final String zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkt
    public final List zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }
}

