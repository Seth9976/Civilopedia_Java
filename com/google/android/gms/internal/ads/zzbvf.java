package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvf extends zzaqw implements zzbvh {
    public zzbvf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString("Adapter returned null.");
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(zzbuj zzbuj0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbuj0);
        this.c(parcel0, 4);
    }
}

