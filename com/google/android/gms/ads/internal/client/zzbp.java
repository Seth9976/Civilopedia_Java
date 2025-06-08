package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbua;

public final class zzbp extends zzaqw implements IInterface {
    public zzbp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper0, String s, zzbua zzbua0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

