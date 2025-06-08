package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbxj extends zzaqw implements zzbxl {
    public zzbxj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, intent0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zzf() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zzg(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.c(parcel0, 2);
    }
}

