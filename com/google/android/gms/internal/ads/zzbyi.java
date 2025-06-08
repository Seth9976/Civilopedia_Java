package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbyi extends zzaqw implements zzbyk {
    @Override  // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        this.c(parcel0, 1);
    }
}

