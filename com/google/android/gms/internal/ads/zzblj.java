package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzblj extends zzaqw implements zzbll {
    public zzblj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzb(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzc(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd() throws RemoteException {
        this.c(this.a(), 2);
    }
}

