package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmd extends zzaqw implements zzbmf {
    @Override  // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblv0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzblv0);
        parcel0.writeString(s);
        this.c(parcel0, 1);
    }
}

