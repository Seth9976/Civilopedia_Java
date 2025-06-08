package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzbpf extends zzaqw implements zzbph {
    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 1);
    }
}

