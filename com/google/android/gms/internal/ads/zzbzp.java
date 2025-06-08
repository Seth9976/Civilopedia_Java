package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzbzp extends zzaqw implements zzbzr {
    public zzbzp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbzr
    public final void zze(zzaz zzaz0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzaz0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbzr
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, parcelFileDescriptor0);
        this.c(parcel0, 1);
    }
}

