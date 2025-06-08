package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbmk extends zzaqw implements zzbmm {
    @Override  // com.google.android.gms.internal.ads.zzbmm
    public final void zze(zzbs zzbs0, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbs0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 1);
    }
}

