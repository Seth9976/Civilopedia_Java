package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbql extends zzaqw implements zzbqn {
    @Override  // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        this.c(parcel0, 1);
    }
}

