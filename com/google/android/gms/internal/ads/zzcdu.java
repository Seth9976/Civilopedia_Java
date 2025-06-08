package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcdu extends zzaqw implements zzcdw {
    @Override  // com.google.android.gms.internal.ads.zzcdw
    public final void zzb(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdw
    public final void zzc(String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, bundle0);
        this.c(parcel0, 3);
    }
}

