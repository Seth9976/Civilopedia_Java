package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaqz extends zzaqw implements zzarb {
    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zze(IObjectWrapper iObjectWrapper0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString("GMA_SDK");
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zzf() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zzh(int[] arr_v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeIntArray(null);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zzi(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzarb
    public final void zzj(byte[] arr_b) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeByteArray(arr_b);
        this.c(parcel0, 5);
    }
}

